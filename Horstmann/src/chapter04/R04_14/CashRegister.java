package chapter04.R04_14;

import java.math.BigDecimal;

/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01;

   BigDecimal purchase = new BigDecimal(0);
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
	  BigDecimal record = new BigDecimal(Double.toString(amount)); 
	  purchase = purchase.add(record);
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
   public BigDecimal giveChange()
   {
	  BigDecimal Total = new BigDecimal(0);
	  BigDecimal Pagamenti = new BigDecimal(payment);
	  Total=Pagamenti.subtract(purchase);
      return Total;
   }
}
