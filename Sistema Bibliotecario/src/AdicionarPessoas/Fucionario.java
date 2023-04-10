package AdicionarPessoas;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Fucionario {

    ArrayList<String> Fucionario = new ArrayList();
    String nome, cpf, CRB, tipo;
    int idade, escolha, escolhido = 0;

    public void Cadastro() {
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o Tipo De Fucionario\n1)Recepicionista| 2)Bibliotecario"));
        switch (escolha) {
            case 1:
                tipo = "Recepicionista";
                break;
            case 2:
                tipo = "Bibliotecario";
                break;
        }
        this.nome = JOptionPane.showInputDialog("Digite o Nome:");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o Idade:"));
        this.cpf = JOptionPane.showInputDialog("Digite o CPF:");
        this.CRB = JOptionPane.showInputDialog("Digite o CRB:");
        this.Fucionario.add("Nome:" + nome + "\nIdade:" + idade + "\nCPF:" + cpf + "\nCRB:" + CRB + "\nFucionario:" + tipo);
    }

    public int Login(String nome) {
        boolean verificar, fucionario;
        int cont = -1;

        for (int i = 0; i < this.Fucionario.size(); i++) {
            verificar = this.Fucionario.get(i).contains(nome);
            if (verificar == true) {
                cont = i;
                break;
            }
        }
        if (cont >= 0) {
            verificar = Fucionario.get(cont).contains("Recepicionista");
            fucionario = Fucionario.get(cont).contains("Bibliotecario");

            if (verificar == true && fucionario == false) {
                //Recepicionista
                escolhido = 1;
            } else if (verificar == false && fucionario == true) {
                //Bibliotecario
                escolhido = 2;
            }

        }

        return 0;
    }
}
