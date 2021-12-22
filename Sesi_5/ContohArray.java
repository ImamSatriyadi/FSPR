package Sesi_5;

public class ContohArray {
    public static void main(String[] args) {
        String[] bahasa = { "Reactjs", "ReactNative", "Golang", "PHP" };
        String[][] framework = { { "Java", "Kotlin" }, { "React", "RecatJS" }, { "PHP", "Laravel" } };

        /*
         * Collection API
         * -------------------------------
         * Set - Tidak boleh ada duplikasi
         * List - boleh ada duplikasi
         * Queue - FIFO
         * DEQUE - LIFO
         * Map - key values
         */

        for (int i = 0; i < bahasa.length; i++) {
            System.out.println("indeks ke - " + i + " : " + bahasa[i]);
        }
    }
}
