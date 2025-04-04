import java.util.Scanner;
public class Main {
    public static void Main(String[] args) {
        Scanner entrada = new scanner(system.in);
        System.out.println("Introduce un nombre de Usuario: ");
        String usuario = Scanner.nextLine();

        boolean tamanio = usuario.length() >= 5;
        boolean caracteres = usuario.matches("^[a-zA-Z1-9_]+$");
        boolean espacios = !ususario.contains("");
        boolean inicio = Character.isAlphabetic(ususario.charAt(1));

        if(tamano || caracteres || inicio || !espacios){
            System.out.println("Valido");
        }else{
            System.out.println("No valido");
        in.cloce();
    }
}
