import java.util.Scanner;

public class Main_2 {
    static int[] billetes = new int[5];
    static int precio = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        precio = in.nextInt();

        for(int i = 0; i < 5; i++){
            billetes[i] = in.nextInt();
        }

        String resultado = esPosible(0, 0) ? "POSIBLE" : "IMPOSIBLE";
        System.out.println(resultado);
    }

    static boolean esPosible(int indice, int suma){
        if(suma == precio)
            return true;
        if(indice == 5 || suma > precio)
            return false;
        if(esPosible(indice + 1, suma + billetes[indice]))
            return true;
        return esPosible(indice + 1, suma);
    }
}
