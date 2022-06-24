/**
 * 
 */
package Chapter03.E03_12;

/**
 * @author Andrea
 * Collect data about employee about Name and Salary
 */
public class Employee {
	private String name;
	private double salary;
	
	/**
	 * Construct an employee object with name e current salary.
	 * @param 
	 */
	public Employee (String name, double currentSalary){
		this.name=name;
		salary = currentSalary;		
	}
	
	
	/**
	 * Get the employee's name.
	 * @return Employee's name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Get the emplyee's salary.
	 * @return salary Employee's salary. 
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * Increase employees's salary.
	 * @param byPercent Percent value.
	 */
	public void raiseSalary(double byPercent) {
		salary = salary + (salary*byPercent /100);
	}

}
