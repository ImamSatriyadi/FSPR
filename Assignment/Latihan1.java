package Assignment;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Double luas, pi;
        int r;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukann Pi (3.14) : ");
        pi = scan.nextDouble();
        System.out.print("Masukann r         : ");
        r = scan.nextInt();

        luas = pi * r * r;
        System.out.println("Luas                : " + luas);
    }
}
