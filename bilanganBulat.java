import java.util.Scanner;
public class bilanganBulat {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Masukan bilangan bulat positif"); 
        int bilangan = scanner.nextInt();

        System.out.print("Faktorisasi" + bilangan + ":" );
        faktorisasi(bilangan);
        
        scanner.close();
    }


    public  static void faktorisasi(int n)  {
        for (int i = 2; i <= n; i++) {
            while (n % i ==0 ) {
                System.out.print(i);
                n /= i;
                if (n > 1) {
                        System.out.print("*");
                }
            }
        }
    }
    
}
