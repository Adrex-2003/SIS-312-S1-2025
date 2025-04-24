package Desafio_2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String respuesta = "si";

        while(respuesta.equals("si")){
            System.out.println("Escribe un signo: ");
            String signo = in.nextLine();
            System.out.println("Escribe un actividad ");
            String actividad = in.nextLine();
            System.out.println("Escribe un objeto:");
            String objeto = in.nextLine();
            System.out.println("Escribe un adjetivo ");
            String adjetivo = in.nextLine();

            String frase = "Hoy " + signo + ", si decides " + actividad + " con un " + objeto + ", te sentirás increiblemente " + adjetivo + ". ¡Confía en las estrellas!";
            System.out.println(frase);

            do{
                System.out.println("¿Quieres continuar? (si/no)");
                respuesta = in.nextLine().toLowerCase();
            }while(!respuesta.equals("si") && !respuesta.equals("no"));
        }
        in.close();   
    }    
}

