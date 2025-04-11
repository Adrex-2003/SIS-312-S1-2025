package Ejercicios_de_clase.Viernes.Ejercicio_2;

import java.util.Scanner;

public class Main {

    static double saldo = 1000.0;
    static String contrasenia = "1234";
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int band = 0;
        while (band == 0) {
            menu();
            int opcion = in.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el monto");
                    double monto = in.nextDouble();
                    retirarDinero(monto);
                }break;
                case 2: consultarSaldo();
                break;
                case 3: {
                    System.out.println("Introduzca su contrasenia");
                    String contraseniaIngresada = in.nextLine();
                    cambiarContrasenia(contraseniaIngresada);
                }break;
                case 4: band = 1;break;
                default: System.out.println("Opcion invalida");
                    break;
            }
            
        }
    }


    public static void menu(){
        System.out.println("Bienvenido al cajero automatico");
        System.out.println("1. Retirar dinero");
        System.out.println("2. Consultar saldo");
        System.out.println("3. Cambiar contraseña");
        System.out.println("4. Salir");
    }

    public static void retirarDinero(double retiro){
        if(retiro <= saldo){
            saldo -= (retiro + aplicarCargo(retiro));
            System.out.println("Retiro exitoso. ");
        }else{
            System.out.println("No tienes suficiente saldo suficiente");
        }
    }

    public static double aplicarCargo(double retiro){
        if(retiro >= 500)
            return retiro * 0.01;
        return 0;
    }

    public static void consultarSaldo(){
        System.out.println("Tu saldo es: " + saldo);
    }

    public static boolean validarContrasenia(String contraseniaIngresada){
        return contrasenia == contraseniaIngresada;
    }

    public static void cambiarContrasenia(String contraseniaIngresada){
        if(validarContrasenia(contraseniaIngresada)){
            contrasenia = in.nextLine();
            System.out.println("Contrasenia cambiada");
        }else{
            System.out.println("Contrasenia incorrecta");
        }

    }

   
}
