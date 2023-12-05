import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Buku {
      String judul;
      String penulis;
      int tahunTerbit;
      boolean dipinjam;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }
}

class Perpustakaan {
    private List<Buku> daftarBuku;

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku dalam Perpustakaan:");
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfo();
            System.out.println("----------------------");
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                if (!buku.isDipinjam()) {
                    buku.setDipinjam(true);
                    System.out.println("Buku '" + judul + "' berhasil dipinjam.");
                } else {
                    System.out.println("Buku '" + judul + "' sedang dipinjam oleh orang lain.");
                }
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan dalam perpustakaan.");
    }
}

public class bukuPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan beberapa buku ke dalam perpustakaan
        perpustakaan.tambahBuku(new Buku("The Human Chair", "Ranpo Edogawa", 1925));
        perpustakaan.tambahBuku(new Buku("The Raven", "Edgar Allan Poe", 1845));
        perpustakaan.tambahBuku(new Buku("Harry Potter", "J.K. Rowling", 2001));
        perpustakaan.tambahBuku(new Buku("Sherlock Holmes", "Arthur Conan Doyle", 1892));
        perpustakaan.tambahBuku(new Buku("Java Programming", "John Doe", 2020));
        perpustakaan.tambahBuku(new Buku("No Longer Human", "Dazai Osamu", 1948));

        // Menampilkan daftar buku dalam perpustakaan
        perpustakaan.tampilkanDaftarBuku();

        // Meminjam buku
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String judulBukuDipinjam = scanner.nextLine();
        perpustakaan.pinjamBuku(judulBukuDipinjam);

        // Menampilkan kembali daftar buku setelah peminjaman
        perpustakaan.tampilkanDaftarBuku();

        scanner.close();
    }
}
