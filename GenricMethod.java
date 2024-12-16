package sidjava;

public class GenricMethod { 

		public static <E> void printArray(E[] inputArray) 
		{

		for(E element:inputArray) 
		{
		System.out.printf("%s,",element); 
		}
		System.out.println(); 
		}
		public static void main(String[] args) {  
		Integer [] intArray= {1,2,3,4,5,6}; 
		Double [] doubleArray= {1.45,2.35,4.63,8.56}; 
		Character [] charArray= {'H','E','L','L','0'}; 
		printArray(intArray); 
		printArray(doubleArray); 
		printArray(charArray); 
		}
		}