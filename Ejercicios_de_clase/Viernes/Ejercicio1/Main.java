// Semana 1 (28 - 03 - 2025)
// Ejercicio 1: Realizar un programa que lea números enteros hasta que se ingrese un 0.
// Al finalizar se debe mostrar la suma de los números, el promedio, el mayor y el menor de los números ingresados,
// la cantidad de números pares y la cantidad de números impares.

package Ejercicio1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int cantidad = 0;
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int pares = 0;
        int impares = 0;
        double promedio = 0;

        while (true) {
            numero = in.nextInt();
            if (numero == 0)
                break;
            suma += numero;
            if (numero > mayor)
                mayor = numero;
            if (numero < menor) 
                menor = numero;
            if (numero % 2 == 0)
                pares++;
            else
                impares++;
            cantidad++;
        }
        if(cantidad != 0){
            promedio = suma / cantidad;
            System.out.println("La suma es: " + suma);
            System.out.println("El promedio es: " + promedio);
            System.out.println("El mayor es: " + mayor);
            System.out.println("El menor es: " + menor);
            System.out.println("La cantidad de pares es: " + pares);
            System.out.println("La cantidad de impares es: " + impares);
        }else{
            System.out.println("No se ingresaron números.");
        }
        in.close();
        
    }
}
