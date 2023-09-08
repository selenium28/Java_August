package cons;

public class Constractor {
	
//	While creating an object Constructor will call automatically.
//	Constructor name must be same as class name
//	Constructor does not have return type
//	we can't use static, abstract & final keywords.
//	we can use access modifier
	

	public static void main(String[] args) {
		System.out.println("Main method");
//		Contractor : class name
//		obj: reference variable 
//		new: keyword
//		Constractor(): Constructor
//		new Constractor();  : object
		Constractor obj = new Constractor();

	}
	
	{
		System.out.println("Blank block");
	}
	
	static{
		System.out.println("Static block");
	}
	
	Constractor(){
		System.out.println("Constractor Block");
	}
		

}
