package inter;

public interface Bike {
	
	public void start();
	public void motorcycle();
	public void buttonStart();
	
	default void helmet() {
		System.out.println("Bike default method");
	}

}
