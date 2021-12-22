package Sesi6;

abstract class Manusia {
    protected abstract void tampilSuara();
    // Deklarasi class dan method tipe abstract
}

class Cowok extends Manusia {

    // Menggunakan method dari class abstract Manusia
    @Override
    protected void tampilSuara() {
        System.out.println("da du du di dam");
        // Statement dari prilaku yang menampilkan output pesan text berbeda dari class
        // Manusia
    }
}

class Cewek extends Manusia {
    // Menggunakan method dari class abstract manusia
    @Override
    protected void tampilSuara() {
        System.out.println("du ri dam dam");
        // Statement dari prilaku yang menampilkan output pesan text berbeda dari class
        // Manusia
    }
}
/*
 * public class Cetak {
 * public static void main(String[] args) {
 * Manusia cowok = new cowok();
 * /// Membuat Objek referensi dari class Manusia, dengan constructor manusia
 * 
 * cowok.tampilSuara();
 * // Menampilkan output pada method yang ada di class cowok
 * 
 * Manusia cewek = new cewek();
 * 
 * cewek.tampilSuara();
 * }
 * }
 */