package chapter04.E04_22;

public class SodaCan {
	private double height, diameter;
	
	public SodaCan (double height, double diameter) {
		this.height = height;
		this.diameter = diameter;
	}
	
	public double getVolume() {
		double volume = Math.PI*Math.pow(diameter/2, 2)*height;
		return volume;
	}

	public double getSurface() {
		double surface = Math.PI*Math.pow(diameter/2, 2)*2 + 
				Math.PI*diameter*height;
		return surface;
	}
}
