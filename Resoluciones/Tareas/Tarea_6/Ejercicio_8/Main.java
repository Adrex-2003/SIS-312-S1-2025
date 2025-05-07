import java.util.Scanner;
class Main{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int precio = in.nextInt();
        int[] billetes = new int[5];

        for(int i = 0; i < 5; i++){
            billetes[i] = in.nextInt();
        }
        // subconjuntos de un elemento
        for(int billete: billetes){
            if(billete == precio){
                System.out.println("POSIBLE");
                return;
            }
        }

        // subconjuntos de dos elementos
        for(int i = 0; i < 5; i ++){
            for(int j = i + 1; j < 5; j ++){
                if(billetes[i] + billetes[j] == precio){
                    System.out.println("POSIBLE");
                    return;
                }
            }
        }

        // subconjuntos de tres elementos
        for(int i = 0; i < 5; i ++){
            for(int j = i + 1; j < 5; j ++){
                for(int k = j + 1; k < 5; k ++){
                    if(billetes[i] + billetes[j] + billetes[k] == precio){
                        System.out.println("POSIBLE");
                        return;
                    }
                }
            }
        }

        // subconjuntos de cuatro elementos
        for(int i = 0; i < 5; i ++){
            for(int j = i + 1; j < 5; j ++){
                for(int k = j + 1; k < 5; k ++){
                    for(int l =  k + 1; l < 5; l ++){
                        if(billetes[i] + billetes[j] + billetes[k] + billetes[l] == precio){
                            System.out.println("POSIBLE");
                            return;
                        }
                    }
                    
                }
            }
        }

        // subconjuntos de cinco elementos
        if(billetes[0] + billetes[1] + billetes[2] + billetes[3] + billetes[4] == precio){
            System.out.println("POSIBLE");
            return;
        }

        System.out.println("IMPOSIBLE");
    }

    
}