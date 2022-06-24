package chapter07.E_03;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Modificate il programma LargestInArray.java visto nel paragrafo 7.3.10 
 * in modo che evidenzi l'elemeento minimo e l'elemento massmo.
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
   }
}

