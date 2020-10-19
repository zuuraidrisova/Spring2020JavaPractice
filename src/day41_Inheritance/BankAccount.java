package day41_Inheritance;

public class BankAccount {
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

    public static String bankName = "Bank of America";
    public String firstName;
    public String lastName;
    public String fullName;
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder(){

        return accountHolder;

    }
    public long getAccountNumber(){

        return accountNumber;
    }
    public double getBalance(){

        return balance;
    }

    public void setAccountHolder(String firstName, String lastName){

       accountHolder = firstName+" "+lastName;
    }
    public void setAccountNumber(long accountNumber){

        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){

        this.balance = balance;
    }

    public BankAccount(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;


        fullName = firstName +" "+ lastName;

    }

    public void deposit(double amount){

        System.out.println("Amount deposited is: $"+amount);
        balance += amount;
    }

    public void withdraw(double amount){

        System.out.println("Amount withdrawn is: $"+amount);
        balance -= amount;

    }

    public void balance(){

        System.out.println("Available Balance is: $" + balance);
    }
    public String toString(){

        return  fullName+" : $"+balance;
    }

}

class BAO{

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Zuura","Idrisova");

        System.out.println("account1.getAccountHolder() = " + account1.getAccountHolder());
        account1.setBalance(200);
        System.out.println(account1.getBalance());
        account1.deposit(1000);
        account1.withdraw(200);
        account1.balance();
        System.out.println(account1);
    }
}