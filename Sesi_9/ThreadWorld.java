package Sesi_9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWorld extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + ": World");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ThreadWorld instance = new ThreadWorld();
            instance.setName("" + i);
            instance.start();
        }
    }
}
