import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Introduce un nombre de Usuario: ");
            String usuario = entrada.nextLine();

            boolean tamanio = usuario.length() >= 5 && usuario.length() <= 15;
            boolean caracteres = usuario.matches("^[a-zA-Z0-9_]+$");
            boolean espacios = !usuario.contains(" ");
            boolean inicio = Character.isAlphabetic(usuario.charAt(0));

            String salida = "";

            salida = tamanio == false ? salida + "fuera del rango \n" : salida;
            salida = caracteres == false ? salida + "No se aceptan caracteres especiales \n" : salida;
            salida = espacios == false ? salida + "No se aceptan espacios \n" : salida;
            salida = inicio == false ? salida + "No debe empezar por numeros \n" : salida;

            salida = salida.length() == 0 ? "Nombre valido" : salida;

            System.out.println(salida);
        }
        entrada.close();
    }
}
