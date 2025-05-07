import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Declaracion e inicializacion de un vector
        int N = in.nextInt();
        int vector[] = new int[N];
        
        
        for(int i = 0; i < vector.length; i ++){
            int valor = in.nextInt();
            vector[i] = valor;
        }

        int buscar = in.nextInt();

        //Busqueda lineal
        for(int i=0; i < vector.length; i ++){
            if(vector[i] == buscar){
                System.out.println("El valor " + buscar + " se encuentra en la posicion " + i);
                break;
            }
        }


        int mayor = vector[0];

        for(int i=1; i < vector.length; i ++){
            if(vector[i] > mayor ){
                mayor = vector[i];
            }
        }

        




    }
}
