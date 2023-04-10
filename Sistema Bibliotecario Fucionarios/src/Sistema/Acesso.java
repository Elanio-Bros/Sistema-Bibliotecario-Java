package Sistema;

import static Sistema.Sistemas.*;
import java.io.File;
import java.io.IOException;

public class Acesso {

    public static class Pasta {

        public static void criarPastas() throws IOException {
            new File(System(verificSystem())).mkdir();
            
            new File(System(verificSystem()) + "Estante").mkdir();
            new File(System(verificSystem()) + "Estante/Livros").mkdir();
            new File(System(verificSystem()) + "Estante/Revistas").mkdir();
            new File(System(verificSystem()) + "Estante/Registros").mkdir();
            
            new File(System(verificSystem()) + "Usuarios").mkdir();
            new File(System(verificSystem()) + "Usuarios/Fucionarios").mkdir();
            new File(System(verificSystem()) + "Usuarios/Estudantes").mkdir();
        }

    }

    public static class AcessoArq {
        public static String Raiz(){
            return System(verificSystem());
        }
        public static String Fucionario() throws IOException {
            return System(verificSystem()) + "Usuarios/Fucionarios/";
        }

        public static String Livros() throws IOException {
            return System(verificSystem()) + "Estante/Livros/";
        }
        public static String Registros() throws IOException {
            return System(verificSystem()) + "Estante/Registros/";
        }
        public static String Revistas() throws IOException {
            return System(verificSystem()) + "Estante/Revistas/";
        }
        
        public static String Alunos() {
            return System(verificSystem()) + "Usuarios/Estudantes/";
        }

    }
}
