package Chapter03.E03_13;

/**
 * A Car could be filled with gas and inizialized with specific propieties
 * after that you can test it.
 * @author Andrea
 *
 */
public class Car {
	private double consuption;
	private double gas;
	
	/**
	 * Construct a a car with 0 gas specifing the cunsuption.
	 * @param consuption Inser consuption L/Km.	
	 */
	public Car(double consuption) {
		this.consuption = consuption;
		gas=0;
	}
	
	/**
	 * Add gas.
	 * @param amount Insert total amount of gas;
	 */
	public void addGas(double amount) {
		gas = gas + amount;
	}
	
	/**
	 * Test a drive.
	 * @param amount Insert total amount of Km to drive.
	 */
	public void drive(double amount) {
		gas = gas - consuption*amount;
	}
	
	/**
	 * Show the remain gas in the tank.
	 * @return gas
	 */
	public double getGasInTank() {
		return gas;
	}
}
