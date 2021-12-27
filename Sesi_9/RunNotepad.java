package Sesi_9;

import java.io.IOException;

public class RunNotepad {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("notepad");
        } catch (IOException ioe) {
            System.out.println("WARNING : something happened with exec");
        }
    }
}
