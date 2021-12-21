package Sesi3.fspr.src.session3;

import java.util.Scanner;

public class BloodPressureScanner {
    public static void main(String[] args) {
        int systolic, diastolic;
        String pilih;
        Scanner scan = new Scanner(System.in);
        systolic = 0;
        diastolic = 0;
        do {
            loop1: while (true) {
                try {
                    System.out.print("Masukkan Nilai Systolic : ");
                    systolic = scan.nextInt();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Maaf Data Invalid, Silahkan Ulangi");
                    scan.nextLine();
                    continue loop1;
                }
            }

            loop2: while (true) {
                try {
                    System.out.print("Masukkan Nilai Diastolic : ");
                    diastolic = scan.nextInt();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Maaf Data Invalid, Silahkan Ulangi");
                    scan.nextLine();
                    continue loop2;
                }
            }

            if (systolic <= 90 || diastolic <= 60) {
                System.out.println("Low Blood Preasure");
            } else if (systolic > 140 || diastolic >= 90) {
                System.out.println("High Blood Preasure");
            } else if (systolic >= 120 || diastolic >= 80) {
                System.out.println("Pre-High Preasure");
            } else {
                System.out.println("Ideal Blood Presure");
            }

            System.out.print("Apakah ingin melakukan pengecekan (Y/N) : ");
            pilih = scan.next();

        } while (pilih.equals("Y") || pilih.equals("y"));
        System.out.println("TERIMA KASIH :)");
    }
}
