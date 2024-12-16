package sidjava;


	interface StrConcat {
	    String stconcat(String a, String b);
	}

	public class Concatenate {

	    public static void main(String[] args) {
	        StrConcat s = (str1, str2) -> str1 + str2;
	        System.out.println("Concatenation: " + s.stconcat("Shubham", " Patil"));
	    }
	}

