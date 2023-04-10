package TelaInicial;

import AdicionarPessoas.Fucionario;
import CadastrarLivro.Livro;
import javax.swing.JOptionPane;

public class Inicio {

    Livro livro = new Livro();
    Fucionario fucionario = new Fucionario();

    public void CadastroFucionario() {
        fucionario.Cadastro();
    }

    public void CadatrosLivro() {
        livro.AdicionarLivro();
    }

    public void ConsultarLivroBibliotecario() {
        int seleçao;
        seleçao = Integer.parseInt(JOptionPane.showInputDialog(null, livro.listaDeLivros() + "\nEscolha um Numero(Digite 0 para sair)"));
        if (seleçao > 0) {
            livro.mostraLivroBibliotecario(seleçao);
        }
    }

    public void ConsultarLivroRecepicionista() {
        int seleçao;
        seleçao = Integer.parseInt(JOptionPane.showInputDialog(null, livro.listaDeLivros() + "\nDiEscolha um Numero(0 para sair)"));
        if (seleçao > 0) {
            livro.mostraLivroRecepicionista(seleçao);
        }

    }

    public int login(String Login) {
        return fucionario.Login(Login);
    }

    public static void main(String[] args) {
        Inicio telas = new Inicio();
        String Login;
        int TelaInicio;
        while (true) {
            TelaInicio = Integer.parseInt(JOptionPane.showInputDialog("1)Cadastrar Fucionario\n2)Login\nEscolha um Numero(0 para sair)"));

            if (TelaInicio == 0) {
                break;
            }
            if (TelaInicio == 1) {
                telas.CadastroFucionario();
            }

            if (TelaInicio == 2) {
                Login = JOptionPane.showInputDialog("Digite o seu Login");

                System.out.println(telas.login(Login));

                if (telas.login(Login) == 0) {
                    JOptionPane.showMessageDialog(null, "Usuário Não Existe", "Erro", JOptionPane.ERROR_MESSAGE);
                }

                if (telas.login(Login) == 1) {
                    int cont = 1;
                    for (int i = 0; i < cont; i++) {
                        int seleçao;
                        seleçao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Cadastrar Livro\n2) Consultar Livros\nEscolha um Numero (0 para Sair)"));
                        switch (seleçao) {
                            case 0:
                                i++;
                                break;
                            case 1:
                                telas.CadatrosLivro();
                                break;
                            case 2:
                                telas.ConsultarLivroRecepicionista();
                                break;
                        }
                        i--;
                    }
                }

                if (telas.login(Login) == 2) {
                    //Bibliotecario
                    int cont = 1;
                    for (int i = 0; i < cont; i++) {
                        int seleçao;
                        seleçao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Cadastrar Livro\n2) Consultar Livros\nEscolha um Numero (0 para Sair)"));
                        switch (seleçao) {
                            case 0:
                                i++;
                                break;
                            case 1:
                                telas.CadatrosLivro();
                                break;
                            case 2:
                                telas.ConsultarLivroBibliotecario();
                                break;
                        }
                        i--;
                    }
                }
            }
        }
    }
}
