
public class Main{
    public static void main(String[] args){
        int cantidad = formas(8);
        System.out.println("\n"+cantidad);
    }

    static int formas(int n){
        if(n == 1) 
            return 1;
        if(n < 1) 
            return 0;
        return formas(n - 2) + formas(n - 3);
    }

    static int beta(int a){
        if(a <= 1)
            return a;
        return a + beta(a/2) + beta(a/3);
    }

    static int digital(int n){
        int c, b;
        while(n > 9){
            c = 1;
            b = n;
            while(b > 0){
                c = c * (b % 10);
                b = b / 10;
            }
            n = c;
        }
        return n;
    }
}



