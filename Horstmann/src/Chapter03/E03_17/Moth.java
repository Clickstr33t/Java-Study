package Chapter03.E03_17;

public class Moth {
	private double position;
		
	public Moth (double initialPosition) {
		position = initialPosition;
	}
	
	public void moveToLight(double lightPosition) {
		position = (position+lightPosition)/2;
	}
	
	public double getPosition() {
		return position;
	}

}
