package Sesi_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Medison");

        Iterator<String> iterator = collection.iterator();

        for (String data : collection) {
            System.out.print(data.toUpperCase());
        }

        // while (iterator.hasNext()) {
        // System.out.print(iterator.next().toUpperCase() + " ");
        // }

        System.out.println();
    }
}
