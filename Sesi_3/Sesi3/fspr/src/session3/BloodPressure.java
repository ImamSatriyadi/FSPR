package Sesi_3.Sesi3.fspr.src.session3;

import java.util.Scanner;

public class BloodPressure {
    public static void main(String[] args) {
        if (args.length < 2 || args.length > 2) {
            System.out.println("Data Invalid");
        } else {
            int systolic = Integer.parseInt(args[0]);
            System.out.println(systolic);
            int diastolic = Integer.parseInt(args[1]);
            System.out.println(diastolic);
            try {
                if (systolic <= 90 || diastolic <= 60) {
                    System.out.println("Low Blood Preasure");
                } else if (systolic > 140 || diastolic >= 90) {
                    System.out.println("High Blood Preasure");
                } else if (systolic >= 120 || diastolic >= 80) {
                    System.out.println("Pre-High Preasure");
                } else {
                    System.out.println("Ideal Blood Presure");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan Salah");
            }

        }

    }

}
