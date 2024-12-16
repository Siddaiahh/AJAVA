package sidjava;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Shubham");
        list.add("Shravan");
        list.add("Rohan");
        list.add("Yogesh");

        System.out.println("List in Normal Order:");
        System.out.println(list);
        
        System.out.println("List in Reverse Order:");
        Collections.reverse(list);
        System.out.println(list);
    }
}
