package chapter07.E_05;

import java.util.Arrays;

/*
 * Aggiungete alla classe Student, vista nel Paragrafo 7.4, il metodo removeMin che
 * elimini il punteggio minimo senza invocare altri metodi.
 */

public class Student
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a student with no scores and a maximum number of scores.
      @capacity the maximum number of scores for this student
   */
   public Student(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   /**
      Adds a score for this student.
      @param score the score to add
      @return true if the score was added, false if there was no room to add the score
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
      {
         return false;      
      }
   }
   
   /**
      Gets the position of the minimum score.
      @return the position of the smallest element of values, or -1
      if there are no scores.
   */
   public int minimumPosition()
   {
      if (scoresSize == 0) { return -1; }
      int smallestPosition = 0;
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < scores[smallestPosition])
         {
            smallestPosition = i;
         }
      }
      return smallestPosition;
   }

   /**
      Computes the sum of the scores
      @return the total score
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }     

   /**
      Removes a score at a given position.
      @param pos the position of the score to remove
   */
   public void removeScore(int pos)
   {
      // Remove the element at this position--see Section 7.3.6
      scores[pos] = scores[scoresSize - 1];
      scoresSize--;
   }
   
   /**
    * Removes the mimimum score insert in the array, and decreas the size.
    */
   public void removeMin() {
	   int pos = 0;
	   double min = scores[0];
	   for (int i = 1; i < scoresSize;i++) {
		   if (scores[i] < min) {
			   min = scores[i];
			   pos = i;
		   }
	   }
	   for (int i = pos+1; i < scoresSize; i++ ) {
		   scores[i-1] = scores[i];
	   }
	   scoresSize--;
	   scores[scoresSize]=0;
   }
}

