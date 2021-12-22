package Assignment;

public class EasyStat {
    public static void main(String[] args) {
        int number[] = { 11, 27, 69, 25, 19, 3, 48, 27, 95, 11 };
        int temp;

        // Urut
        for (int i = 0; i < number.length; i++) {
            for (int j = number.length - 1; j > i; j--) {
                if (number[j - 1] > number[j]) {
                    temp = number[j];
                    number[j] = number[j - 1];
                    number[j - 1] = temp;
                }
            }
        }

        // Mean
        double mean = 0;
        for (int dataNumber : number) {
            mean += dataNumber;
        }
        System.out.println("Mean           : " + mean / number.length);

        // Median
        double median;
        if (number.length % 2 == 1) {
            median = number[number.length / 2];
        } else {
            median = (double) (number[number.length / 2] + number[(number.length / 2) - 1]) / 2;
        }
        System.out.println("Median         : " + median);

        // Modus
        int maxValue = 0;
        int maxCount = 0;

        for (int i = 0; i < number.length; ++i) {
            int count = 0;
            for (int j = 0; j < number.length; ++j) {
                if (number[j] == number[i])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = number[i];
            }
        }

        System.out.println("Modus          : " + maxValue);

    }

}
