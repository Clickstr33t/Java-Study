package chapter04.R04_20;
/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01;

   private double purchase;
   private double payment;
   private int quarter, dime, nickel, penny;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
   }
   
   /**
      Processes the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public void receivePayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      quarter = (int)(change /QUARTER_VALUE);
      dime = (int)(change%QUARTER_VALUE/DIME_VALUE);
      nickel = (int)(change%QUARTER_VALUE%DIME_VALUE/NICKEL_VALUE);
      penny = (int)(change%PENNY_VALUE);
      System.out.println("Quarter: "+quarter);
      System.out.println("Dime:    "+dime);
      System.out.println("Nickel:  "+nickel);
      System.out.println("Penny:   "+penny);
      purchase = 0;
      payment = 0;
      return change;
   }
}

