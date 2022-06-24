package chapter04.R04_23;

public class Balloon {
	
	private double air;
	
	public Balloon() {
		air = 0;
	}
	
	public void addAir(double amount) {
		air += amount;
	}
	
	public double getVolume() {
		return air;
	}
	
	public double getSurfaceArea() {
		return 4*Math.PI*Math.pow(getRadius(), 2);
	}

	public double getRadius() {
		return  Math.pow(((air/Math.PI)*(3./4.)),1.0/3.0);
	}
}