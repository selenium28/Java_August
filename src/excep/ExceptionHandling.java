package excep;

public class ExceptionHandling {

	public static void main(String[] args) {
		 
		int a = 0;
		int b = 10;
		int c = 5;

//		System.out.println(b/a);
		
		try {
			System.out.println(b/c);
		} catch (Exception e) {
			System.out.println("Exception HAndle");
		}
		
		System.out.println("rest code");
	}

}
