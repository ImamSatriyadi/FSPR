package Sesi6;

public class Main {
    public static void main(String[] args) {

        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;

        // memanggil method luas dan keliling
        System.out.println();
        System.out.println("----------------------------------------");

        System.out.println("Luas Bangun Datar     : " + bangunDatar.luas());
        System.out.println("Keliling Bangun Datar : " + bangunDatar.keliling());
        System.out.println("----------------------------------------");
        System.out.println();

        System.out.println("Luas Persegi     : " + persegi.luas());
        System.out.println("Keliling Persegi : " + persegi.keliling());
        System.out.println();

        System.out.println("Luas Lingkaran     : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
        System.out.println(lingkaran);
        System.out.println();

        System.out.println("Luas Persegi Panjang     : " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling());
        System.out.println();

        System.out.println("Luas Segitiga     : " + mSegitiga.luas());
        System.out.println("Keliling Segitiga : " + mSegitiga.keliling());

        System.out.println("----------------------------------------");
        System.out.println();
    }
}
