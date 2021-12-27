package Sesi_9;

class MyThread implements Runnable {
    public void run() {
        System.out
                .println(Thread.currentThread().getName() + " Thread " + Thread.currentThread().getName() + " running");
        System.out.println(Thread.currentThread().getName() + " ID " + Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName() + " Priority " + Thread.currentThread().getPriority());
    }
}

public class MyOwnThread {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread());
        threadA.setName("A");
        Thread threadB = new Thread(new MyThread());
        threadB.setName("B");

        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadA.start();
        threadB.start();
    }
}
