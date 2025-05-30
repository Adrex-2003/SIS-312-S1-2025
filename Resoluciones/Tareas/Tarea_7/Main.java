import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] baldosa = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                baldosa[i][j] = (int) (Math.random() * 10);
                System.out.print(baldosa[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxPiedras(H, W, baldosa));
    }

    static int maxPiedras(int H, int W, int[][] baldosa) {
        int[][] nuevo = new int[H][W];

        for (int j = 0; j < W; j++) {
            nuevo[0][j] = baldosa[0][j];
        }

        for (int i = 1; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int maxAnterior = nuevo[i - 1][j];

                if (j > 0)
                    maxAnterior = nuevo[i - 1][j - 1] > maxAnterior ? nuevo[i - 1][j - 1] : maxAnterior; 
                if (j < W - 1)
                    maxAnterior = nuevo[i - 1][j + 1] > maxAnterior ? nuevo[i - 1][j + 1] : maxAnterior;

                nuevo[i][j] = baldosa[i][j] + maxAnterior;
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(nuevo[i][j] + " ");
            }
            System.out.println();
        }
        int maxPiedras = 0;
        for (int j = 0; j < W; j++) {
            maxPiedras = maxPiedras > nuevo[H - 1][j] ? maxPiedras : nuevo[H - 1][j];
        }
        return maxPiedras;
    }
    
}
