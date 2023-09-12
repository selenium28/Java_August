package excep;

public class ExceptionHandle {

	public static void main(String[] args) throws Exception {
		 
		int a = 0;
		int b = 10;
		int c = 5;
		
//		Can we use single try & multiple catch block?
//		Yes
//		Can we use single catch & multiple try block?
//		No : we can use finally block with single try block
//		inside try block its called nested try catch block

//		System.out.println(b/a);
		
		try {
			System.out.println(b/c);
		} finally {
			System.out.println("finally block");
		}
		
		
		try {
			System.out.println(b/c);
		} catch (ArithmeticException e) {
			System.out.println("Exception Handle");
		} catch (ArrayIndexOutOfBoundsException e) {
			
		} catch (Exception e) {
			
		}
		
		try {
			System.out.println(b/c);
		} catch (ArithmeticException e) {
			System.out.println("Exception Handle");
		}
		
		System.out.println("rest code");
	}

}
