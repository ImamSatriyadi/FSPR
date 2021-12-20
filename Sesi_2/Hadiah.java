package Sesi_2;

import java.util.Scanner;

public class Hadiah {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Total Belanjaan : Rp ");
        belanja = keyboard.nextInt();

        if (belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan hadiah !");
        }
        System.out.println("Terima kasih ...");

    }
}
