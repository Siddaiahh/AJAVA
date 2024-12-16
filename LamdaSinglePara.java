package sidjava;



	interface MyFunction {
	    int addByFive(int a);
	}

	public class LamdaSinglePara {

	    public static void main(String[] args) {
	        MyFunction f = (num) -> num + 5;
	        System.out.println("Addition: " + f.addByFive(20));
	    }
	}

