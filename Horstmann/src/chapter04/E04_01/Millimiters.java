package chapter04.E04_01;

import java.math.BigDecimal;
import java.math.MathContext;

public class Millimiters {
	public static void main(String[] args) {
		
		double width = 8.5;
		double height = 11;
		double perimeters;
		double diagonal;
		
		final double MILLIMETERS_PER_INCH = 25.4;
		

		
		
		BigDecimal a = new BigDecimal(Double.toString(width));
		BigDecimal b = new BigDecimal(Double.toString(MILLIMETERS_PER_INCH));
		BigDecimal c = a.multiply(b);
		System.out.println("Larghezza: "+ c);
		
		a = new BigDecimal(Double.toString(height));
		b = new BigDecimal(Double.toString(MILLIMETERS_PER_INCH));
		c = a.multiply(b);
		System.out.println("Altezza: "+ c);
		
		a = new BigDecimal(Double.toString(height*2));
		b = new BigDecimal(Double.toString(width*2));
		c = new BigDecimal(Double.toString(MILLIMETERS_PER_INCH)); 
		BigDecimal d = a.add(b).multiply(c);
		System.out.println("Perimetro: "+ d);
		
		a = new BigDecimal(Double.toString(height));
		b = new BigDecimal(Double.toString(width));
		c = new BigDecimal(Double.toString(MILLIMETERS_PER_INCH)); 
		MathContext prova = new MathContext(3);
		d = a.pow(2).add(b.pow(2)).sqrt(prova).multiply(c);
		System.out.println("Diagonale: "+ d);
		
	}

}
