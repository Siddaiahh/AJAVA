package sidjava;
import java.util.*;

	public class Set {
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<String>();

	        list.add("Shubham");
	        list.add("Shravan");
	        list.add("Rohan");
	        list.add("Yogesh");
	        list.add("Sarthak");

	        System.out.println("My List: " + list);

	        Collections.reverse(list);
	        System.out.println("Reversed List: " + list);
	    }
	}
