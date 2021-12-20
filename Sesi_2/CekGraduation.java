package Sesi_2;

import java.util.Scanner;

public class CekGraduation {
    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner keyboard = new Scanner(System.in);

        boolean suka = true;
        String jawaban;

        System.out.print("Nama   : ");
        nama = keyboard.nextLine();
        System.out.print("Nilai  : ");
        nilai = keyboard.nextInt();

        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal");
        }

        jawaban = suka ? "iya" : "tidak";
        System.out.println(jawaban);
    }
}
