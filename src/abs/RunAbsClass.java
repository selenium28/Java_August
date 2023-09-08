package abs;

public class RunAbsClass {

	public static void main(String[] args) {
		
//		Bank obj = new Bank(); We can't create object of Abstract class
		ICICIBank obj = new ICICIBank();
		obj.atmMachine();
		obj.ccCard();
		obj.debitCard();
		obj.rateOfIntrest();

	}

}
