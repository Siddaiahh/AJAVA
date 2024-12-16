package sidjava;
	interface Hello {
	    String printMsg();
	}
	public class Lamda {
	    public static void main(String[] args) {
	        Hello msg = () -> { return "Hello Shubham"; };
	        System.out.println(msg.printMsg());
	    }
	}
