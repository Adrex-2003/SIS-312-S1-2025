package Desafio_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu contraseña: ");
        String contrasenia = entrada.nextLine();

        String salida = "";

        boolean tamanio = contrasenia.length() >= 8;
        boolean numeros = contrasenia.matches(".*[0-9].*");
        boolean mayusculas = !contrasenia.equals(contrasenia.toLowerCase());
        boolean minusculas = !contrasenia.equals(contrasenia.toUpperCase());
        boolean espacios = contrasenia.contains(" ");
        boolean simbolos = contrasenia.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");

        if(!tamanio)
            salida += "-> Debe tener al menos 8 carácteres\n";
        if(!numeros)
            salida += "-> Debe tener al menos un número\n";
        if(!mayusculas)
            salida += "-> Debe tener al menos una letra mayúscula\n";
        if(!minusculas)
            salida += "-> Debe tener al menos una letra minúscula\n";
        if(espacios)
            salida += "-> No se permiten espacios\n";
        if(!simbolos)
            salida += "-> Debe tener al menos un caracter especial\n";
        if(salida.length() == 0)
            salida = "Contraseña válida\n";
        
        System.out.println(salida);

        entrada.close();
    }
}
