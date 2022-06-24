package Chapter03.E03_01;

public class CounterDemo
{
   public static void main(String[] args)
   {
      Counter tally = new Counter();
      tally.click();
      tally.click();
      tally.undo();
      tally.undo();
      tally.undo();
      tally.undo();
      System.out.print("result: \n \n"+tally.getValue());
   }
}
