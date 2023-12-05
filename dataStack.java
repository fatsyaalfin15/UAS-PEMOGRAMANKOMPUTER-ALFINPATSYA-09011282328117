import java.util.Stack;
import java.util.Scanner;

public class dataStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ekspresi matematika: ");
        String ekspresi = scanner.nextLine();

        if (cekUrutanKurung(ekspresi)) {
            System.out.println("Urutan kurung benar.");
        } else {
            System.out.println("Urutan kurung salah.");
        }

        scanner.close();
    }

    
    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        
        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '{' || karakter == '[') {
                
                stack.push(karakter);
            } else if (karakter == ')' || karakter == '}' || karakter == ']') {
                
                if (stack.isEmpty() || !pasanganKurung(stack.pop(), karakter)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean pasanganKurung(char kurungBuka, char kurungTutup) {
        return (kurungBuka == '(' && kurungTutup == ')') ||
               (kurungBuka == '{' && kurungTutup == '}') ||
               (kurungBuka == '[' && kurungTutup == ']');
    }
}
