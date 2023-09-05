package oops;

public class Dog {

	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void sleeping() {
		System.out.println("Dog is sleeping");
	}
	
	public void running() {
		System.out.println("Dog is running");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		
//		How to create an object in Java?
//		Dog - Class name
//		objDog - ReferenceVariable
//		new - keyword
//		Dog() - Contractor
//		object -  new Dog();
		
		Dog objDog = new Dog();
		objDog.eat();
		objDog.sleeping();
		objDog.running();

	}
	
}
