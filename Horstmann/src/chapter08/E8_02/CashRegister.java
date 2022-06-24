package chapter08.E8_02;

/*
 * Modificate il metodo giveChange della classe CashRegister in modo che restituisca il
 * numero di monete di un particolare tipo che vanno fornite come resto.
 * 
 * int giveChange(Coin coinType)
 * 
 * Tale metodo va invocato una volta per ogni tipo di moneta, in ordine di valore decrescente.
 */

/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;

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
      Enters the payment received from the customer.
      @param coinCount the number of coins received
      @param coinType the type of coin that was received
   */
   public void receivePayment(int coinCount, Coin coinType)
   {
      payment = payment + coinCount * coinType.getValue();
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public int giveChange(Coin coinType)
   {
      int nCoin = (int)((payment - purchase)/coinType.getValue());
      
      if (purchase-nCoin*coinType.getValue()<=0) {
    	  purchase = 0;
      }else {
    	  purchase = purchase-nCoin*coinType.getValue();
      }
      payment = payment - nCoin * coinType.getValue();
      return nCoin;
   }
}

