package string;

public class StringConcept {

	public static void main(String[] args) {
		String str = "Java";
		String str1 = new String("Java");
		String str4 = new String("Java");
		String str2 = new String("Selenium");
		String str3 = "Selenium";
		String str5 = "Selenium";
		
//		== & equals
//		== : Operator it is used for address comparison
//		equals methods: used for content comparison 
//		String is a immutable in java
//		String is a class in java also sequence in char.
		System.out.println(str==str1);
		System.out.println(str1==str4);
		System.out.println(str3==str5);
		System.out.println(str2.equals(str5));

	}

}
