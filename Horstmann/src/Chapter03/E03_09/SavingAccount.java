package Chapter03.E03_09;
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class SavingAccount
{  
   private double balance;
   private double interest;

   /**
      Constructs a bank account with a zero balance.
   */
   public SavingAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public SavingAccount(double initialBalance, double interest)
   {   
      balance = initialBalance;
      this.interest = interest;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
   /**
    * Add intererst to the balance.
    */
   public void addInterest() {
	   balance += balance *interest /100;
   }
}
