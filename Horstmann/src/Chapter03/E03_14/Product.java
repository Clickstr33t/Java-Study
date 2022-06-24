package Chapter03.E03_14;

/**
 * Product with a name and a specific price
 * @author Andrea
 *
 */
public class Product {
	private String name;
	private double price;
	
	/**
	 * Construct a product specifing name and price.
	 * @param name Product's name.
	 * @param price Product's price.
	 */
	public Product(String name, double price) {
		this.name=name;
		this.price=price;
	}
	
	/**
	 * Reduce the product's price specifing a value.
	 * @param amount Insert amount of price to subtract.
	 */
	public void reducePrice(double amount) {
		price = price - amount;
	}
	
	/**
	 * Show the name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Show the price.
	 */
	public double getPrice() {
		return price;
	}
}
