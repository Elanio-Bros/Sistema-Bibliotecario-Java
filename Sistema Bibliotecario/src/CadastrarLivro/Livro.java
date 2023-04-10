package CadastrarLivro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Livro {
     ArrayList<String>livro=new ArrayList();
    ArrayList<String>nomes=new ArrayList(); 
    String Emprestar;
    String titulo,autor,editora;
    int ano;
    public String Emprestimo(int i){
        switch(i){
            case 1:
              this.Emprestar="Emprestado";
                break;
            case 2:
                this.Emprestar="Não Emprestado";
                break;
        }
         return this.Emprestar;
    }
   public void AdicionarLivro(){
        titulo=JOptionPane.showInputDialog(null,"Digite o Titulo Do Livro");
        autor=JOptionPane.showInputDialog(null,"Digite o Autor:");
        ano=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Ano:"));
        editora=JOptionPane.showInputDialog(null,"Digite a Editora:");
        this.livro.add("Titulo:"+titulo+"\nAutor:"+autor+"\nEditora:"+editora+"\nAno:"+ano+"\nEstado:"+Emprestimo(2));
        int tamanho=this.livro.size();
        this.nomes.add(tamanho+")"+titulo);
    }
    public void  mostraLivroBibliotecario(int i){
       int valor;
        valor=Integer.parseInt(JOptionPane.showInputDialog(null,this.livro.get(i-1)+"\n\n1)Emprestar    2)Devolução\nDigite 0 para sair"));
        this.livro.set((i-1),"Titulo:"+titulo+"\nAutor:"+autor+"\nEditora:"+editora+"\nAno:"+ano+"\nSituação:"+Emprestimo(valor));
    }
    public String listaDeLivros(){
        String Listar=String.join("\n",this.nomes);
         return Listar;
    }
    public void  mostraLivroRecepicionista(int i){
       JOptionPane.showMessageDialog(null,this.livro.get(i-1));
    }
}
