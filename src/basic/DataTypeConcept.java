package basic;

public class DataTypeConcept {

	public static void main(String[] args) {
		
//		DataTypes Primitive data type
//		1. Integer
//		int - DataType
//		a - Variable
//		10 - value - we have assign/stored 10 value to a variable
		int a = 10;
		int a1 = 20;
		int a2 = -5;
//		int a = 20;  // Duplicate variable is not allowed in java
		System.out.println(a);
		System.out.println(a2);
		System.out.println("a+a1 = " +(a+a1));
		
//		2. Double
		double d = 100.55;
		double d1 = 105;
		System.out.println(d1);
		
//		3. char
		char c = 'a';
		char c1 = 'Z';
		char c2 = '@';
		System.out.println(c1);
		
//		4. boolean
//		Is true & false are values or Keywords in java?
//		Values & Keywords
		boolean b1 = true;
		boolean b = false;
		System.out.println(b1);
		
//		5. String - Non-primitive data type
//		String is class in java
//		Class - Starting from caps
		String str = "Java";
		String str1 = "!@##$%%^&&";
		System.out.println(str1);
		String str3 = "100";
		String str2 = "1654";
		System.out.println(str2);
		System.out.println(str3+str2);
	}

}
