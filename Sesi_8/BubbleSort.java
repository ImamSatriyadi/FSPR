package Sesi_8;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] numbers) {
        long startTime = System.nanoTime();
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Execution time : " + endTime);
    }

    public void sortImprovement1(int[] numbers) {
        long startTime = System.nanoTime();
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Execution time : " + endTime);
    }

    public void sortImprovement2(int[] numbers) {
        int i = 0;
        boolean swapOccured = true;
        long startTime = System.nanoTime();
        while (swapOccured) {
            swapOccured = false;
            i++;
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    swapOccured = true;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Execution time : " + endTime);
    }

    private void swap(int[] numbers, int j, int k) {
        int temp = numbers[j];
        numbers[j] = numbers[k];
        numbers[k] = temp;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = new int[] { 2, 5, 7, 2, 4, 2, 8, 1, 11, 15, 17, 12, 14, 21, 18, 21, 20, 31, 28, 29 };
        int[] numbers1 = new int[] { 2, 5, 7, 2, 4, 2, 8, 1, 11, 15, 17, 12, 14, 21, 18, 21, 20, 31, 28, 29 };
        int[] numbers2 = new int[] { 2, 5, 7, 2, 4, 2, 8, 1, 11, 15, 17, 12, 14, 21, 18, 21, 20, 31, 28, 29 };
        bubbleSort.sort(numbers);
        bubbleSort.sortImprovement1(numbers1);
        bubbleSort.sortImprovement2(numbers2);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
    }
}