package Sesi_9;

public class ProcessExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Processor\t: " + runtime.availableProcessors());
        System.out.println("Total Memory\t: " + runtime.totalMemory());
        System.out.println("Free Memory\t: " + runtime.freeMemory());
    }
}
