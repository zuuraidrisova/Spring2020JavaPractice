package day41_Inheritance;

public class BankAccountWarmUp {
      /*
    create custom class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
     */

      static String bankName = "Bank of America";
      public String firstName;
      public String lastName;

      private String accountHolder;
      private long accountNumber;
      private double balance;

      public BankAccountWarmUp(String firstName, String lastName){

          this.firstName = firstName;
          this.lastName = lastName;
          this.accountHolder = firstName+" "+lastName;

      }

      public String getAccountHolder(){

          return accountHolder;
      }
      public long getAccountNumber(){

          return accountNumber;
      }
      public void setAccountNumber(long accountNumber){

          this.accountNumber = accountNumber;
      }

      public double getBalance() {
        return balance;
      }

      public void setBalance(double balance) {
        this.balance = balance;
      }

      public void deposit(int amount){

         // balance = balance + amount; we can do this way, or like below
          setBalance(balance + amount);//now it can set a new balance by adding amount
      }

      public void withdraw(int amount){

        //  balance = balance - amount; we can also do it bu using set method

          setBalance(balance - amount);
      }
      public void checkBalance(){

        //  System.out.println("Available balance is: $"+balance); ==> also works

          System.out.println("Available balance is: $"+getBalance());
      }
      public String toString(){

          return "Full Name: "+getAccountHolder()+",  Balance:"+getBalance();
      }

}
class BAB{

    public static void main(String[] args) {

        BankAccountWarmUp account = new BankAccountWarmUp("Zuura","Idrisova");

        System.out.println(account);

        System.out.println(account.getAccountHolder());

        System.out.println("+++++++++++++++++++++++++++++");

        account.setBalance(1200);

        System.out.println(account.getBalance());

        System.out.println("+++++++++++++++++++++++++++++");

        account.deposit(300);

        System.out.println(account.getBalance());

        System.out.println("+++++++++++++++++++++++++++++");

        account.withdraw(500);

        System.out.println(account.getBalance());

        System.out.println("+++++++++++++++++++++++++++++");

        System.out.println(account);
    }
}