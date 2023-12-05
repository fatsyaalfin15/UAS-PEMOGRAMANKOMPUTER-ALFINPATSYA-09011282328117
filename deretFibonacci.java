import java.util.Scanner;

public class deretFibonacci{
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n untuk deret Fibonacci");
            int n = scanner.nextInt();

            System.out.println("Deret Fibonaccci hingga suku ke-" + n + ":");
            for  (int i = 1; i <=n; i++){
                System.out.print(fibonacci(i) + "");
            }
        } 
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
    

