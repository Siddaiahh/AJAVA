package sidjava;

	class GenricClass1<T>
	{
		T obj;
		GenricClass1(T obj){this.obj=obj;}
		public T get() {return this.obj;}
	}

	public class GenricClass {

		public static void main(String[] args) {
			GenricClass1<Integer>i= new GenricClass1<Integer>(1);
			System.out.println(i.get());
			
			GenricClass1<String> s= new GenricClass1<String>("Shubham Patil");
			System.out.println(s.get());

		}

	}
