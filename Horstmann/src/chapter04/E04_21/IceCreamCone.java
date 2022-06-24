package chapter04.E04_21;

import java.util.Scanner;

public class IceCreamCone {
	
	private double height, ray;
	
	public static void main(String[] args) {
		double a,b;
		Scanner input = new Scanner(System.in);
		System.out.print("Raggio del cono: ");
		a = input.nextDouble();
		System.out.print("Altezza del cono: ");
		b = input.nextDouble();
		IceCreamCone test = new IceCreamCone(a, b);
		System.out.printf("Area: %.2f\n" , test.getSurfaceAarea());
		System.out.printf("Volume: %.2f\n", test.getVolume());
	}
	
	public IceCreamCone(double ray, double height) {
		this.height = height;
		this.ray = ray;
	}

	public double getSurfaceAarea() {
		double apotema = Math.sqrt(ray*ray+height*height);
		double area = Math.PI*ray*apotema;
		return area;		
	}
	
	public double getVolume() {
		double volume = (Math.PI*ray*ray*height)/3;
		return volume;
	}
}
