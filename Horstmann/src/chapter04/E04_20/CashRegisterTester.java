package chapter04.E04_20;

public class CashRegisterTester {
	public static void main(String[] args) {
		
		CashRegister register = new CashRegister();
		register.recordPurchase(20.37);
		register.enterDollars(20);
		register.enterQuarters(2);
		System.out.println("Change: " + register.giveChange());
		System.out.println("Excected: 0.13");
	}
}
