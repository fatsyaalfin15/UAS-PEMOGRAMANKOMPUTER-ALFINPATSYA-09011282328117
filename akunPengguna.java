   public class akunPengguna {
     
      String username;
      String password;
      boolean aktif;

    
     akunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = false; 
    }
 
    public void aktifkanAkun() {
        aktif = true;
        System.out.println("Akun " + username + " telah diaktifkan.");
    }

   
    public void nonaktifkanAkun() {
        aktif = false;
        System.out.println("Akun " + username + " telah dinonaktifkan.");
    }

    public void tampilkanStatusAkun() {
        System.out.println("Username: " + username);
        System.out.println("Status Aktif: " + (aktif ? "Aktif" : "Nonaktif"));
    }
    
    public String getUsername() {
        return username;
    }

    public boolean isAktif() {
        return aktif;
    }

    public static void main(String[] args) {
        // Membuat objek AkunPengguna
        akunPengguna akun1 = new akunPengguna("user30", "pass503");

        // Menampilkan status awal akun
        akun1.tampilkanStatusAkun();

        // Mengaktifkan akun
        akun1.aktifkanAkun();

        // Menampilkan status setelah diaktifkan
        akun1.tampilkanStatusAkun();

        // Menonaktifkan akun
        akun1.nonaktifkanAkun();

        // Menampilkan status setelah dinonaktifkan
        akun1.tampilkanStatusAkun();
    }
}
