package Sesi_3;

public class BilanganGanjil {
    public static void main(String[] args) {

        /*
         * // For
         * int n = 20
         * for (int i = 0; i <= n; i++) {
         * if (i % 2 == 1) {
         * System.out.print(i + " ");
         * }
         * }
         */

        // Foreach
        int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        for (int i : n) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
