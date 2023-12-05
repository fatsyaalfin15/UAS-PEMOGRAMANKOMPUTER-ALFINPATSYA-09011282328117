import java.util.Scanner;

public class kataFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan kata atau frase
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Menghilangkan spasi dan mengubah huruf menjadi huruf kecil
        String cleanedInput = cleanAndLowercase(input);

        // Mengecek apakah kata atau frase merupakan palindrom
        if (isPalindrom(cleanedInput)) {
            System.out.println("'" + input + "' adalah palindrom.");
        } else {
            System.out.println("'" + input + "' bukan palindrom.");
        }

        scanner.close();
    }

    // Metode untuk membersihkan dan mengubah huruf menjadi huruf kecil
    public static String cleanAndLowercase(String str) {
        return str.replaceAll("\\s", "").toLowerCase();
    }

    // Metode untuk mengecek apakah kata atau frase merupakan palindrom
    public static boolean isPalindrom(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
