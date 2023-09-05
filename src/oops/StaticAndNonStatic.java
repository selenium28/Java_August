package oops;

public class StaticAndNonStatic {
	int a = 10;  // Non-static global variable

	public static void main(String[] args) {
		System.out.println("Main method");

		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.demo();
		sum();   // Direct calling
		obj.display();
		StaticAndNonStatic.test();  // By using class name
		
		System.out.println(obj.a);
		
	}
	
	public static void  sum() {
		System.out.println("Sum method");
	}
	
	public void display() {
		System.out.println("Display method");
	}
	
	public void demo() {
		System.out.println("Demo method");
	}
	
	public static void test() {
		System.out.println("Test method");
	}

}
