package Sesi_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Medison");

        System.out.println("A List of cities in collection 1");
        System.out.println(collection1);

        System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() + " Cities are in collection now");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angles");
        collection2.add("Atlanta");

        System.out.println("\nA List of cities in collection2 : ");
        System.out.println(collection2);

        ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in collection1 or collection2 : ");
        System.out.println(c1);

        c1 = (ArrayList<String>) (collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in collection1 or collection2 : ");
        System.out.println(c1);

        c1 = (ArrayList<String>) (collection1.clone());
        c1.removeAll(collection2);
        System.out.println("\nCities in collection1 or collection2 : ");
        System.out.println(c1);

    }
}

// Deep Copy