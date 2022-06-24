package chapter07.E_04;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Scrivete il metodo sumWithoutSmallest che calcoli, usando un unico cilco , 
 * la somma di tutti i vlaori di un array, escludendo il valore minimo, 
 * Nel ciclo, aggiornate la somma e il valore minimo; al termine, restitutite 
 * la differenza tra questi due valori.
 */

/**
   This program reads a sequence of values and prints them, marking the largest value.
*/
public class LargestInArrayList
{
   public static void main(String[] args)
   {  
      ArrayList<Double> values = new ArrayList<Double>();

      // Read inputs

      System.out.println("Please enter values, Q to quit:");
      Scanner in = new Scanner(System.in);
      while (in.hasNextDouble())
      {  
         values.add(in.nextDouble());
      }

      // Find the largest value

      double largest = values.get(0);
      double smallest = values.get(0);
      for (int i = 1; i < values.size(); i++)
      {
         if (values.get(i) > largest)
         {
            largest = values.get(i);
         }
         if (values.get(i) < smallest)
         {
            smallest = values.get(i);
         }
      }

      // Print all values, marking the largest

      for (double element : values)
      {  
         System.out.print(element);
         if (element == largest) 
         {
            System.out.print(" <== largest value");
         }
         if (element == smallest) 
         {
            System.out.print(" <== smallest value");
         }
         System.out.println();
      }
      
      LargestInArrayList l = new LargestInArrayList();
      System.out.println("Sum Without Smallest: " + l.sumWithoutSmallest(values));
   }
   
   public double sumWithoutSmallest(ArrayList<Double> a) {
	   double smallest = a.get(0);
	   double sum = 0;
	   for (double x : a) {
		   smallest = Math.pow(smallest, x);
		   sum = sum + x;
	   }
	   return sum - smallest;
   }
}

