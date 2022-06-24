package Chapter03.E03_03;

/**
 * Allow the user to increas e decreas the temperature between a specific range.
 * @author Andrea
 *
 */
public class RangeInput {
	private int max = 80;
	private int min = 60;
	private int temperature;
	
	/**
	 * Costruisce un oggetto RangeInput impostando la temperatura media ai valori di fabbrica.
	 */
	public RangeInput()
	{
		temperature=(max+min)/2;
	}
	
	/**
	 * Increase the temperature.
	 */
	public void up()
	{
		temperature=Math.min(max, temperature+1);
	}
	/**
	 * Decrease the temperature.
	 */
	public void down()
	{
		temperature = Math.max(min, temperature-1);
	}
	/**
	 * Display temperature value.
	 * @return Temperature value.
	 */
	public int display()
	{
		return temperature;
	}
}
