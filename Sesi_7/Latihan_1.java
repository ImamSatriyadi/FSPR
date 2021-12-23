package Sesi_7;

import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {
        int x, y, z;
        float avg;
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("Masukkan Bilangan Pertama (X)  : ");
        x = scan.nextInt();
        System.out.print("Masukkan Bilangan Kedua   (Y)  : ");
        y = scan.nextInt();
        System.out.print("Masukkan Bilangan Ketiga  (Z)  : ");
        z = scan.nextInt();

        int min = Integer.min(x, y);
        float finMin = Integer.min(min, z);

        int max = Integer.max(x, y);
        float finMax = Integer.max(max, z);
        avg = (x + y + z) / 3;

        System.out.println("Hasil : ");
        System.out.println("Rata-ratanya adalah  : " + avg);
        System.out.println(finMax + " Bilangan Terbesar ");
        System.out.println(finMin + " Bilangan Terkecil ");

    }
}
