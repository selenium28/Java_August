package basic;

public class StringConcat {

	public static void main(String[] args) {
		
//		+ -> Operator
		
		String str = "Java";
		String ptr = "500";
		int x = 100;
		int y = 200;
		System.out.println(x+y);  // 300
		System.out.println(x+ptr);  // 100500
		System.out.println(x+str+y+x);  // 100java200100
		System.out.println(x+y+str+ptr); // 100200java500, 300java500
		System.out.println(x+ptr+y+x);   // 100500200100
		System.out.println(x+ptr+(y+x)); // 100500300
	}

}
