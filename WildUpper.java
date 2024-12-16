package sidjava;
import java.util.*;
public class WildUpper {

	    public static void main(String[] args) {
	        List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
	        System.out.println("Total sum is: " + sum(l1));

	        List<Double> l2 = Arrays.asList(1.1, 2.2, 3.3, 4.4);
	        System.out.println("Total sum is: " + sum(l2));
	    }

	    private static double sum(List<? extends Number> list) {
	        double sum = 0.0;
	        for (Number i : list) {
	            sum += i.doubleValue();
	        }
	        return sum;
	    }
	}
