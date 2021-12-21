package Sesi3.fspr.src.session3;

public class LabeledForLoop {
    public static void main(String[] args) {
        int i, j;

        outer: for (i = 1; i <= 5; i++) {
            System.out.println();
            inner: for (j = 1; j <= 10; j++) {
                System.out.print(j + " ");
                if (j == 9) {
                    break outer;
                }
            }
        }
        System.out.println();
    }
}
