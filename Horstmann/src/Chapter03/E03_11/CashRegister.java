package Chapter03.E03_11;
/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double taxRate;
   private double purchase;
   private double taxablePurchase;
   private double payment;
   private String receipt="List: \n \n";
   private int count=0;
   private double dailySales =0;

   /**
      Constructs a cash register with no money in it.
      @param rate the tax rate for taxable purchases
   */
   public CashRegister(double rate)
   {
      taxRate = rate;
      purchase = 0;
      payment = 0;
   }

   /**
      Records the sale of a tax-free item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
      receipt=receipt.concat(String.valueOf(amount)).concat("\n");
      dailySales += amount;
      count++;
   }

   /**
      Records the sale of a taxable item.
      @param amount the price of the item
   */
   public void recordTaxablePurchase(double amount)
   {
      purchase = purchase + amount;
      taxablePurchase = taxablePurchase + amount;
      receipt=receipt.concat(String.valueOf(amount)).concat("\n");
      dailySales += amount;
      count++;
   }

   /**
      Processes a payment received from the customer.
      @param amount the amount of the payment
   */
   public void receivePayment(double amount)
   {
      payment = payment + amount;
   }

   /**
      Processes the sales tax due.
      @return the sales tax due
   */
   public double getSalesTax()
   {
      return taxablePurchase * taxRate / 100;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase - getSalesTax();
      purchase = 0;
      taxablePurchase = 0;
      payment = 0;
      return change;
   }
   
   /** Print price list of items bought 
    * 
    */
   public void printReceipt() {
	   receipt=receipt.concat("\n-------\n").concat(String.valueOf(giveChange()));	  
	   System.out.println(receipt);
   }
   /** 
    * Give the number of daily receipt.
    */
   public int getSalesCount() {
	   return count;
   }
   /**
    * Give the total daily amount sold.
    */
   public double getSalesTotal() {
	   return dailySales;
   }
   /**
    * Reset daily stats.
    */
   public void reset() {
	   dailySales=0;
	   count=0;
   }
}

