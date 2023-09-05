package methodOverLoad;

public class MethodOverloading {
	
	// Method inside method is not allowed in java.
	// Duplicate methods are not allowed in java.
	// We can use single parameter with different data type.
	// MethodOverloading: Method name is same with different input 
	// parameters with in the same class is known as MethodOverloading.

	public static void main(String[] args) {

	}
	
	// Can we overload main method? 
	// Yes - not a good practice to overload main method. compiler will get confuse.
//	public static void main() {
//
//	}

	public void display() { // no parameter
		System.out.println("Display method with 0 parameter");
	}

	public void display(int a) { // 1 parameter
		System.out.println("Display method with 1 parameter");
	}

	public void display(int b, int c) { // 2 parameters
		System.out.println("Display method with 2 parameter");
	}

	public void display(double d) { // 1 parameter
		System.out.println("Display method with 1 double - parameter");
	}


}
