package Sistema;

public class Sistemas {

    public static String verificSystem() {
        if ("Linux".equals(System.getProperty("os.name"))) {
            return "Linux";
        }
        if ("windows".equals(System.getProperty("sun.desktop"))) {
            return "Windows";
        } else {
            System.out.println("Erro Pasta não Encotrada");
        }
        return "Falso";
    }

    public static String System(String sys) {
        if ("Linux".equals(sys)) {
            return "/home/" + System.getProperty("user.name") + "/SistemaBibliotecario/";
        }
        if ("Windows".equals(sys)) {
            return "C:/SistemaBibliotecario/";
        }
        else{
        return "Erro não suportado";
        }
    }
}
