package Sesi_3;

public class TampilanBintang {
    public static void main(String[] args) {
        /*
         * //for
         * int n = 5
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < n; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Foreach
        int n[] = { 1, 2, 3, 4, 5 };
        for (int i : n) {
            for (int j : n) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }
}
