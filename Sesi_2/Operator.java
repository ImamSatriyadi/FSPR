package Sesi_2;

public class Operator {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;

        a = 5;
        b = 10;

        b += a;
        System.out.println("Penambahan : " + b);

        b -= a;
        System.out.println("Pengurangan : " + b);

        b *= a;
        System.out.println("Perkalian : " + b);

        b /= a;
        System.out.println("Pembagian : " + b);

        b %= a;
        System.out.println("Sisa bagi : " + b);
    }
}
