package Chapter03.E03_02;

public class CounterDemo
{
   public static void main(String[] args)
   {
      Counter tally = new Counter();
      tally.setLimit(2);
      tally.click();
      tally.click();
      tally.click();
      tally.click();

      System.out.print("result: \n \n"+tally.getValue());
   }
}
