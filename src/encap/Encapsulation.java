package encap;

public class Encapsulation {

	private int rollNo;
	private String name;
	private double marks;
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {
		Encapsulation o = new Encapsulation();
		o.setName("Kanchan");
		o.setMarks(75.33);
		o.setRollNo(10);
		
		System.out.println("Name: " +o.getName());
		System.out.println("Marks: " +o.getMarks());
		System.out.println("Roll No: " +o.getRollNo());

	}

}
