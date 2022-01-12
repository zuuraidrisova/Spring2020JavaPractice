package reviewPracticing;

public class Account {
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

     public String bankName;
     public String firstName;
     public String lastName;

     private String accountHolder;
     private long accountNumber;
     private double balance;

     public Account(String firstName, String lastName){

         this.firstName = firstName;
         this.lastName = lastName;
         this.accountHolder = firstName +" "+lastName;

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

     public double getBalance(){

         return  balance;
     }

     public void setBalance(double balance){

         this.balance = balance;
     }

     public void deposit(double amount){

        // balance += amount;
         setBalance(balance + amount);
     }

     public double checkBalance(){

         return getBalance();
     }

     public void withdraw(double amount){

        // balance -= amount;
         setBalance(balance - amount);
     }

     public String toString(){

         return "Full name: "+firstName+" "+lastName+", Balance: "+balance;
     }
}

class Capital{

    public static void main(String[] args) {

        Account account = new Account("Zuura","Idrisova");

        System.out.println("account = " + account);

        account.setAccountNumber(281947);

        account.setBalance(1200);

        System.out.println("account = " + account);

        account.deposit(1400);

        System.out.println("account.checkBalance() = " + account.checkBalance());

        account.withdraw(1000);

        System.out.println("account.checkBalance() = " + account.checkBalance());
    }
}