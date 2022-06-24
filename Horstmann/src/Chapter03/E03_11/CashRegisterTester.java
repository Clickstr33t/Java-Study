package Chapter03.E03_11;
/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister(5);
         // 5% sales tax on taxable purchases

      register.recordTaxablePurchase(10);
      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.receivePayment(50);
      register.printReceipt();
                
   }
}

