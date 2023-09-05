package oops;

public class GlobalVariableAndLocalVeriable {
	static int d = 20;  // Non-static Global variable
	static String str = "name";
	

	public static void main(String[] args) {
		int a = 10;  // local variable: Scope of local variable within the method
		System.out.println(a);
		int m = a + d;

	}
	
	public void add() {
		int b = 50; // local variable: Scope of local variable within the method
//		System.out.println(a);   // a  cannot be resolved to a variable
		int c = b + d;
		
//		System.out.println(str + strr);   // strr cannot be resolved to a variable
	}
	
	public void display() {
		String strr = "Java";
		
		System.out.println(strr + str);
	}

}
