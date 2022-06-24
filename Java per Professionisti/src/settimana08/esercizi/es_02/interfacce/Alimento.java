package settimana08.esercizi.es_02.interfacce;

public interface Alimento {
	
	/**
	 * rende il peso totale di un alimento, in grammi
	 * @return peso alimento
	 */
	public double getWeight();
	
	/**
	 * rende le calorie relative a una porzione di 100 grammi di un alimento
	 * @return calorie in 100g
	 */
	public double getCalories100();
	
	/**
	 * rende le calorie totali di un alimento
	 * @return calorie totali
	 */
	public double getTotalCalories();
	
}
