package Sesi_8;

import java.util.Scanner;

public class SelesctionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data  : ");
        int jml_data = scanner.nextInt();

        int[] data = new int[jml_data];
        System.out.println();
        for (int x = 0; x < jml_data; x++) {
            System.out.print("Input nilai Data ke-" + (x + 1) + " :");
            data[x] = scanner.nextInt();
        }

        System.out.println();
        System.out.print("Data Sebelum di Sorting : ");
        for (int x = 0; x < jml_data; x++) {
            System.out.println(data[x] + " ");
        }

        System.out.println("\n\nProses Selection Sort : ");
        for (int x = 0; x < jml_data; x++) {
            System.out.print("Iterasi ke - " + (x + 1) + " : ");
            for (int y = 0; y < jml_data; y++) {
                System.out.println(data[y] + " ");
            }

            System.out.println("Apakah Data " + data[x] + "Sudah benar pada urutannya");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "Tidak ada Pertukaran";
            for (int y = x + 1; y < jml_data; y++) {
                if (min > data[y]) {
                    tukar = true;
                    index = y;
                    min = data[y];
                }

            }

            if (tukar == true) {
                pesan = "Data" + data[x] + " ditukar dengan data" + data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }

            for (int y = 0; y < jml_data; y++) {
                System.out.println(data[y] + " ");
            }
            System.out.println(pesan + "\n");

        }

        System.out.print("Data Setelah di sorting : ");
        for (int y = 0; y < jml_data; y++) {
            System.out.print(data[y] + " ");
        }
    }
}
