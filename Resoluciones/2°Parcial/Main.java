import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();

        int[][] matriz = new int[M][N];

        for(int i = 0; i < M; i ++){
            for(int j = 0; j < N; j ++){
                matriz[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < M; i ++){
            int cont = 0;
            int ultimo = matriz[i][N - 1];
            for(int j = 0; j < N - 1; j ++){
                if(matriz[i][j] > ultimo){
                    cont ++;
                }
            }
            System.out.print(cont + " ");
        }

    }
}