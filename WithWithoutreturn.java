package sidjava;

	interface Subtract {
	    int subtraction(int c, int d);
	}
	public class WithWithoutreturn {

	    public static void main(String[] args) {
	        Subtract sub = (c, d) -> (c - d);
	        int result = sub.subtraction(20, 18);
	        System.out.println("Subtraction: " + result);

	        Subtract sub2 = (int a, int b) -> {
	            return (a - b);
	        };
	        System.out.println("Subtraction 2: " + sub2.subtraction(32, 10));
	    }
	}
