package Chapter03.E03_02;

/**
This class models a tally counter.
*/
public class Counter
{
private int value;
private int limit;

/**
   Gets the current value of this counter.
   @return the current value
*/
public int getValue()
{
   return value;
   
}

/**
   Advances the value of this counter by 1.
*/
public void click() 
{
   value = Math.min(value +1, limit);
}

/**
   Resets the value of this counter to 0.
*/
public void reset()
{
   value = 0;
}

/**
* Reduce the value of this counter by 1.
*/
public void undo()
{
	   value=Math.max(value-1,0);   
	   
}
/**
 * 	Set max Limit for the counter
 *	@param maximum maximum capacity for the counter.
 */
public void setLimit(int maximum)
{
	limit = maximum;
}

}

