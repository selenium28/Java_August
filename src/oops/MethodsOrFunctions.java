package oops;

public class MethodsOrFunctions {

	public static void main(String[] args) {
		MethodsOrFunctions objMethodsOrFunctions = new MethodsOrFunctions();
		objMethodsOrFunctions.add();
		objMethodsOrFunctions.sub();
		objMethodsOrFunctions.sub();
		int r = objMethodsOrFunctions.divide(50, 5);
		System.out.println(r);
		
		int s = objMethodsOrFunctions.divide(100, 5);
		System.out.println(s);
		
		
	}
	
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
	public void sub() {
		int m = 50;
		int n = 10;
		System.out.println(m-n);
	}
	
	public int divide(int p, int q) {// parameters
		
		return p/q;  
	}

}
