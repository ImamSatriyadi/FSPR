package Sesi_7;

import java.util.Scanner;

public class Latihan_4 {
    public static void main(String[] args) {
        int tahun;
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("Masukkan Tahun\t= ");
        tahun = scan.nextInt();

        if (tahun % 4 == 0 || tahun % 400 == 0) {
            System.out.println(tahun + " Adalah Tahun Kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println(tahun + " Bukan Tahun Kabisat");
        } else {
            System.out.println(tahun + " Bukan Tahun Kabisat");
        }

        System.out.println();
    }
}
