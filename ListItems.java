package sidjava;

	import java.util.ArrayList;
	public class ListItems {
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("Shubham");
	        list.add("Shravan");
	        list.add("Rohan");
	        list.add("Yogesh");

	        System.out.println("Traversing through ForEach Loop");

	        for (String friends : list) {
	            System.out.println(friends);
	        }
	    }
	}
