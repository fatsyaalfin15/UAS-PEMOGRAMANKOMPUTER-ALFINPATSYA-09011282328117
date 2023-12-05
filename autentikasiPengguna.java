import java.util.Scanner;

public class autentikasiPengguna {
    
    public static  String USERNAME = "user045";
    public static  String PASSWORD = "pass778";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        
        if (autentikasi(usernameInput, passwordInput)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        scanner.close();
    }

    public static boolean autentikasi(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}

