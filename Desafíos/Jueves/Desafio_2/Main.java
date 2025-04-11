package Desafio_2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String respuesta = "si";

        while(respuesta.equals("si")){
            System.out.println("Escribe un sustantivo: ");
            String sustantivo = in.nextLine();
            System.out.println("Escribe un verbo: ");
            String verbo = in.nextLine();
            System.out.println("Escribe un adjetivo: ");
            String adjetivo = in.nextLine();
            System.out.println("Escribe un lugar: ");
            String lugar = in.nextLine();

            String frase = "En el misterioso rincón de " + lugar + ", el " + sustantivo + " " + verbo + " de forma muy " + adjetivo;
            System.out.println(frase);

            do{
                System.out.println("¿Quieres continuar? (si/no)");
                respuesta = in.nextLine().toLowerCase();
            }while(!respuesta.equals("si") && !respuesta.equals("no"));
        }
        in.close();   
    }    
}
