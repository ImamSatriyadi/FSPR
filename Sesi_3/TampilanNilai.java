package Sesi_3;

public class TampilanNilai {
    public static void main(String[] args) {

        /*
         * //For
         * int n = 10;
         * for (int i = 0; i <= n; i++) {
         * System.out.print(i + " ");
         * }
         */

        // Foreach
        int n[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i : n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
