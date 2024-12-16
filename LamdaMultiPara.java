package sidjava;


	interface AddNum {
	    int add(int a, int b);
	}
	public class LamdaMultiPara {

	    public static void main(String[] args) {
	        AddNum a = (num1, num2) -> num1 + num2;
	        System.out.println("Addition: " + a.add(5, 6));
	    }
	}

