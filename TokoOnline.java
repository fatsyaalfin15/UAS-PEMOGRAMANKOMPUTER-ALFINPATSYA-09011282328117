import java.util.Scanner;

public class TokoOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input harga barang
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        // Input jumlah barang yang dibeli
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        // Hitung total harga sebelum diskon
        double totalHarga = hargaBarang * jumlahBarang;

        // Hitung diskon berdasarkan jumlah barang yang dibeli
        double diskon = 0.0;
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05; // 5% diskon
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.1; // 10% diskon
        } else if (jumlahBarang > 20) {
            diskon = 0.2; // 20% diskon
        }

        // Hitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Tampilkan hasil
        System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
        System.out.println("Diskon yang diberikan: " + (diskon * 100) + "%");
        System.out.println("Total harga setelah diskon: Rp " + totalHargaSetelahDiskon);

        scanner.close();
    }
}
