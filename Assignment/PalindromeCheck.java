package Assignment;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan kata atau kalimat: ");
        String input = scan.nextLine();

        String reversed = "";

        for (int i = input.length(); i > 0; i--) {
            String test1 = input.substring(i - 1, i);
            reversed += test1;
        }

        if (input.equals(reversed)) {
            System.out.println(input + " adalah Palindrome");
        } else {
            System.out.println(input + " bukan Palindrome");
        }
    }
}
