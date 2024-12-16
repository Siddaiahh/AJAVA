package sidjava;

import java.util.*;
import java.util.Set;
public class SetOperations {
    public static void main(String[] args) {

        Set<Integer> t = new LinkedHashSet<Integer>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        t.add(6);

        Set<Integer> t1 = new LinkedHashSet<Integer>();
        t1.add(7);
        t1.add(8);

        t.addAll(t1);
        System.out.println("Set_1: " + t);
        System.out.println("Set_2: " + t1);

        System.out.println("\nAfter Adding Set_2 into Set_1: " + t);

        t.remove(3);
        t.remove(5);
        System.out.println("\nSet after removing elements: " + t);

        System.out.println("\nDoes the Set contain 5? " + t.contains(5));
        System.out.println("Does the Set contain 1? " + t.contains(1));
    }
}
