package Chapter03.E03_08;

public class BankAccountTester {
	public static void main(String[] args) {
		BankAccount andrea = new BankAccount(1000);
		andrea.addInterest(10);
		System.out.println("Valore atteso 1100");
		System.out.println(andrea.getBalance());
	}

}
