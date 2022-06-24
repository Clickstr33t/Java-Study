package Chapter03.E03_06;

/**
 * Monitor the status of a light controlled by 2 switches.
 * @author Andrea
 *
 */
public class Circuit 
{
	private int firstSwitch;
	private int secondSwitch;
	private int lampState;
	
	/**
	 * Build a ciruit with lamp and switches to 0 status.
	 */
	public Circuit()
	{
		firstSwitch = 0;
		secondSwitch = 0;
		lampState = 0;
	}
	
	/**
	 * Toggle the first switch.
	 */
	public void setFirstSwitch() {
		firstSwitch=1-firstSwitch;
		lampState=1-lampState;
	}
	/**
	 * Toggle the second switch.
	 */
	public void setSecondSwitch() {
		secondSwitch=1-firstSwitch;
		lampState=1-lampState;
	}
	
	/**
	 * Display the lamp state.
	 * @return the lampState
	 */
	public int getLampState() {
		return lampState;
	}

	/**
	 * Display the first switch status.
	 * @return the firstSwitch
	 */
	public int getFirstSwitch() {
		return firstSwitch;
	}

	/**
	 * Display the second switch status.
	 * @return the secondSwitch
	 */
	public int getSecondSwitch() {
		return secondSwitch;
	}
}
