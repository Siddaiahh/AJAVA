package sidjava;
import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Shubham");
        list.add("Shravan");
        list.add("Rohan");
        list.add("Yogesh");
        
        System.out.println("Traversing through Iterator");
        
        Iterator<String> itrt = list.iterator();
        while (itrt.hasNext()) {
            System.out.println(itrt.next());
        }
    }
}

