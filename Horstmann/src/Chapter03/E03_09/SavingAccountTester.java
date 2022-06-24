package Chapter03.E03_09;

public class SavingAccountTester {
	public static void main(String[] args) {
		SavingAccount andrea = new SavingAccount(1000, 10);
		andrea.addInterest();
		andrea.addInterest();
		andrea.addInterest();
		andrea.addInterest();
		andrea.addInterest();
		System.out.println("Valore atteso 1610,51");
		System.out.println(andrea.getBalance());
	}

}
