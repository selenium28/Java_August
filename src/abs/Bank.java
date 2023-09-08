package abs;

public abstract class Bank {
//	Partial abstraction - 0 to 100%
	
//	No method body
	public abstract void rateOfIntrest();

	public void atmMachine() {
		System.out.println("Bank atm machine");
	}
	
	public void ccCard() {
		System.out.println("Bank CC Card");
	}
	
	public abstract void debitCard(); 
	
}
