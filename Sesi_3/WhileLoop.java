package Sesi_3;

public class WhileLoop {
    public static void main(String[] args) {
        int n = 10;
        int i = 0;
        System.out.println("WHILE");
        System.out.println("Hasil Output : ");
        while (i <= n) {
            System.out.println("Perulangan ke-" + i);
            i++;
        }

        i = 0;
        n = 10;
        System.out.println();
        System.out.println("DO WHILE");
        System.out.println("Hasil Output : ");
        do {
            System.out.println("Perulangan ke-" + i);
            i++;
        } while (i <= n);
    }
}
