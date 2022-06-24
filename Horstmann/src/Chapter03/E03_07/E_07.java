package Chapter03.E03_07;

public class E_07 {
	public static void main(String[] args) {
		BankAccount andrea = new BankAccount();
		andrea.deposit(1000);
		andrea.withdraw(500);
		andrea.withdraw(400);
		System.out.println("Valore atteso 100");
		System.out.println(andrea.getBalance());
	}

}
