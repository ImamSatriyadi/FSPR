package Sesi3.fspr.src.session3;

import java.util.Scanner;

public class JavaConstants {
    public static void main(String[] args) {
        final double PI_CONSTANT = 3.14159; // konstanta pi

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double radius = input.nextDouble();
        double area = PI_CONSTANT * radius * radius;
        System.out.println("Area for radius " + radius + " is " + area);
    }
}
