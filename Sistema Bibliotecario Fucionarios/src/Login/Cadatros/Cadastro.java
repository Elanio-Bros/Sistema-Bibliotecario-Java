package Login.Cadatros;
import java.util.ArrayList;
public class Cadastro {
    public static String SenhaTrasforma(String senha){
    ArrayList<String> Organizar=new ArrayList();
    String Senha=senha;
    String formando = null;
    
    char[]b;
    b=Senha.toCharArray();
    for(int i=0;i<b.length;i++){
     String Switch=""+b[i];
        switch(Switch){
         case "A":
                formando="!";
                break;
         case "a":
                formando="@";
                break; 
         case "B":
                formando="#";
                break; 
         case "b":
                formando="$";
                break; 
         case "C":
                formando="%";
                break; 
         case "c":
                formando="¨";
                break;
         case "D":
               formando="&";
                break;
         case "d":
                formando="*";
                break; 
         case "E":
                formando="(";
                break; 
         case "e":
                formando=")";
                break; 
         case "F":
                formando="_";
                break; 
         case "f":
                formando="-";
                break;
         case "G":
                formando="+";
                break;
         case "g":
                formando="=";
                break; 
         case "H":
                formando="§";
                break; 
         case "h":
                formando="´";
                break; 
         case "I":
                formando="`";
                break; 
         case "i":
               formando="[";
                break;
         case "J":
                formando="]";
                break;
         case "j":
                formando="{";
                break; 
         case "K":
                formando="}";
                break; 
         case "k":
                formando="ª";
                break; 
         case "L":
                formando="º";
                break; 
         case "l":
                formando="°";
                break;
         case "M":
               formando="?";
                break;
         case "m":
                formando="/";
                break;
          case "N":
                formando=".";
                break;        
         case "n":
                formando=",";
                break; 
         case "O":
                formando=">";
                break; 
         case "o":
                formando="<";
                break; 
         case "P":
                formando="'";
                break;
         case "p":
                formando="1";
                break;
         case "Q":
                formando="¬";
                break; 
         case "q":
                formando="^";
                break; 
         case "R":
                formando="";
                break; 
         case "r":
                formando="~";
                break; 
         case "S":
               formando="6";
                break;
         case "s":
                formando="2";
                break;
         case "T":
                formando="5";
                break; 
         case "t":
                formando="3";
                break; 
         case "U":
                formando="4";
                break; 
         case "u":
                formando="0";
                break; 
         case "V":
                formando="8";
                break;
         case "v":
               formando="9";
                break;
         case "W":
                formando="7";
                break; 
         case "w":
                formando="|";
                break; 
         case "X":
                formando=";";
                break; 
         case "x":
                formando=":";
                break; 
         case "Y":
                formando="乙";
                break;
         case "y":
                formando="£";
                break;
         case "Z":
                formando="¢";
                break; 
         case "z":
                formando="¥";
                break; 
            }
        
         switch(Switch){
            case "1":
                formando="W";
                break;
            case "2":
                formando="v";
                break;
            case "3":
                formando="z";
                break;
            case "4":
                formando="M";
                break;
            case "5":
                formando="Y";
                break;
            case "6":
                formando="R";
                break;
            case "7":
                formando="C";
                break;
            case "8":
                formando="K";
                break;
            case "9":
                formando="A";
                break;
            case "0":
                formando="S";
                break;    
        }
         Organizar.add(formando);
        }
    String fim=String.join("",Organizar);
    return fim;
    }
}           
//094569