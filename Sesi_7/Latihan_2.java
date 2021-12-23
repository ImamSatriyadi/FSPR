package Sesi_7;

public class Latihan_2 {
    public static void main(String[] args) {
        String[][] framework = {
                { "PHP", "Ruby", "Java" },
                { "Golang", "Javascript", "Swift" }
        };
        System.out.println(framework.length);
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.println("siapa yang akan duduk di kelas (" + i + "," + j + ") : " + framework[i][j]);
            }
        }

        System.out.println("==============================");
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.print("|" + framework[i][j] + "| ");
            }
            System.out.println();
        }
        System.out.println("==============================");
    }
}
