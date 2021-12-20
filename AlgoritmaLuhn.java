import java.util.Scanner;

public class AlgoritmaLuhn {
    public static void main(String[] args) {
        long creditNumber;
        int jumlah, i;
        jumlah = 0;
        i = 0;
        double angka;
        String output;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan No Kartu Kredit : ");
        creditNumber = scan.nextLong();
        while (creditNumber > 0) {
            angka = creditNumber % 10;
            creditNumber = creditNumber / 10;

            if (i % 2 != 0) // Ganjil di kali 2
                angka *= 2;

            if (angka > 9) // kalau lebih dari 9
                angka = (angka % 10) + 1;
            else
                angka *= 1;

            jumlah += angka; // lakukan penjumlahan
            i++;
        }

        output = jumlah % 10 == 0 ? "Kartu kredit telah benar" : "Pastikan kartu kredit sudah benar!";

        // Print hasil
        System.out.println("Output: " + output);
    }
}
