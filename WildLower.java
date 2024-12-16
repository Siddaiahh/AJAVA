package sidjava;
import java.util.*;

public class WildLower {

	    public static void print1(List<? super Integer> list) {
	        System.out.println(list);
	    }

	    public static void main(String[] args) {
	        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
	        print1(list1);

	        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
	        print1(list2);
	    }
	}
