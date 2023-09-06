package methodOverLoad;

public class ClassB extends ClassA{  // child class
	
//	It is inheriting the properties of parent class into child class is known as Inheritance.
	
	public void bike() {
		System.out.println("Class B: bike");
	}
	
	public void truck() {
		System.out.println("Class B: truck");
	}
	
	public void chopper() {
		System.out.println("Class B: chopper");
	}
	
//	When method name is same in parent class as well as in child class with same 
//	input parameter is known as method overriding  
	public void car() {
		System.out.println("Class B: car");
	}

}
