package chapter04.R04_14;
/**
   This class tests the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();

      register.recordPurchase(19.93);
      register.receivePayment(20, 0, 0, 0, 0);
      System.out.print("Change: ");
      System.out.println(register.giveChange());
      
   }
}

