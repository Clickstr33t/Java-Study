package Chapter02.E02_16;

public class DayTester {
	public static void main(String[] args) {
		Day today = new Day();
		Day daySum = today.addDays(10);
		System.out.println(daySum.daysFrom(today));
		
	}
}
 