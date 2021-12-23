package Sesi_7;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Latihan_3 {
    public static void main(String[] args) {
        double pembelian, diskon, hargaBayar;
        Scanner scan = new Scanner(System.in);
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRp = NumberFormat.getCurrencyInstance(localeID);

        System.out.println();
        System.out.print("Masukkan Nilai Pembelian\t= Rp. ");
        pembelian = scan.nextDouble();
        System.out.print("Masukkan Nilai Diskon (%)\t= ");
        diskon = scan.nextDouble();

        hargaBayar = pembelian - (pembelian * (diskon / 100));
        System.out.println("Harga Bayar\t\t\t= " + formatRp.format(hargaBayar));
        System.out.println();

    }
}
