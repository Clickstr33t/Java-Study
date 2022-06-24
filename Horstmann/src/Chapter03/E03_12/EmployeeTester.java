package Chapter03.E03_12;

public class EmployeeTester {
	public static void main(String[] args) {
		Employee andrea = new Employee("Andrea, Paffi", 1000);
		andrea.raiseSalary(10);
		System.out.println(andrea.getName());
		System.out.println(andrea.getSalary());
	}

}
