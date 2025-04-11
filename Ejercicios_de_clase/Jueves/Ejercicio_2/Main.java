package Ejercicio_2;

import java.util.Scanner;
public class Main {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a > b && a > c){
            System.out.println(a + " es mayor");
        }else if(b > a && b > c){
            System.out.println(b + " es mayor");
        }else if(c > b && c > a){
            System.out.println(c + " es mayor");
        }
        in.close();
    }
}
