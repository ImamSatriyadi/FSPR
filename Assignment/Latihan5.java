package Assignment;

public class Latihan5 {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        y1 = 10;
        y2 = 2;
        x1 = (y1 + y2) * (y1 + y2);
        x2 = (y1 % 4) * y2;

        System.out.println("LATIHAN 5 A");
        System.out.println("y1 = " + y1 + " y2 = " + y2);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        System.out.println("LATIHAN 5 B");
        System.out.println("x1 = x2 : " + (x1 >= x2));
        System.out.println("x2 >= x1 : " + (x2 >= x1));
        System.out.println("x1 mod 4 == ++x2 mod 5 : " + ((x1 % 4) == ((++x2 % 5))));
    }

}
