package Test2::Event::Generic;
use strict;
use warnings;

use Carp qw/croak/;
use Scalar::Util qw/reftype/;

our $VERSION = '1.302175';

BEGIN { require Test2::Event; our @ISA = qw(Test2::Event) }
use Test2::Util::HashBase;

my @FIELDS = qw{
    causes_fail increments_count diagnostics no_display callback terminate
    global sets_plan summary facet_data
};
my %DEFAULTS = (
    causes_fail      => 0,
    increments_count => 0,
    diagnostics      => 0,
    no_display       => 0,
);

sub init {
    my $self = shift;

    for my $field (@FIELDS) {
        my $val = defined $self->{$field} ? delete $self->{$field} : $DEFAULTS{$field};
        next unless defined $val;

        my $set = "set_$field";
        $self->$set($val);
    }
}

for my $field (@FIELDS) {
    no strict 'refs';

    *$field = sub { exists $_[0]->{$field} ? $_[0]->{$field} : () }
        unless exists &{$field};

    *{"set_$field"} = sub { $_[0]->{$field} = $_[1] }
        unless exists &{"set_$field"};
}

sub can {
    my $self = shift;
    my ($name) = @_;
    return $self->SUPER::can($name) unless $name eq 'callback';
    return $self->{callback} || \&Test2::Event::callback;
}

sub facet_d