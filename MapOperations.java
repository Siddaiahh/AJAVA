package sidjava;

import java.util.*;

public class MapOperations {

    public static void main(String[] args) {

        Map<Integer, String> m1 = new HashMap<>();
        m1.put(1, "Shubham");
        m1.put(2, "Shravan");
        m1.put(3, "Rohan");
        m1.put(4, "Swapnil");
        m1.put(5, "Yogesh");

        Map<Integer, String> m2 = new HashMap<>();
        m2.put(6, "Sarthak");
        m2.put(7, "Kapil");
        m2.put(8, "Prasad");

        System.out.println("\nMap1:");
        for (Map.Entry<Integer, String> e : m1.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("\nMap2:");
        for (Map.Entry<Integer, String> e : m2.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("\nInsert map into another map");
        Map<Integer, String> m3 = new HashMap<>();
        m3.putAll(m1);
        m3.putAll(m2);
        System.out.println(m3);

        System.out.println("\nRemove items from the map");
        m1.remove(3);
        m1.remove(5);
        for (Map.Entry<Integer, String> e : m1.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("\nSearch specific key from the map");
        System.out.println("Is the key '4' present? " + m1.containsKey(4));
        System.out.println("Is the key '6' present? " + m1.containsKey(6));

        System.out.println("\nGet value of the specified key");
        String val = m1.get(4);
        System.out.println(val);
    }
}
