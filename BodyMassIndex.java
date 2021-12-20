import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        // berat dalm kg/tinggi^2 meter
        // input dalam pound dan inchi

        double berat, tinggi, hasil;
        String interpretation;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan (Pound)  : ");
        berat = scan.nextDouble();
        System.out.print("Masukkan Tinggi Badan (Inchi) : ");
        tinggi = scan.nextDouble();

        hasil = (berat * 0.45359237) / ((tinggi * 0.0254) * (tinggi * 0.0254));

        if (hasil >= 30) {
            interpretation = "Obese";
        } else if (hasil >= 25 && hasil < 30) {
            interpretation = "Overweight";
        } else if (hasil >= 18.5 && hasil < 25) {
            interpretation = "Overweight";
        } else {
            interpretation = "Underweight";
        }

        System.out.println("Body Mass Index               : " + hasil);
        System.out.println("Body Mass Index               : " + interpretation);
    }
}
