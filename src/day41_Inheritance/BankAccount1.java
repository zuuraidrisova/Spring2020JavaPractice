package day41_Inheritance;

public class BankAccount1 {
    /*
    	create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString

     */

    private long accountNumber;
    private String accountHolder;
    private double balance;

    public long getAccountNumber(){

        return accountNumber;
    }

    public String getAccountHolder(){

        return accountHolder;

    }

    public double getBalance(){

        return balance;
    }

    public void setAccountNumber(long accountNumber){

        this.accountNumber = accountNumber;
    }
    public void  setAccountHolder(String accountHolder){

        this.accountHolder = accountHolder;

    }

    public void setBalance(double amount){

        this.balance += amount;
    }

    public void deposit(int amount){

        balance += amount;

    }
    public void showBalance(){

        System.out.println(balance);
    }

    public String toString(){

        return "Account Holder: "+getAccountHolder()+" Account Number: "+getAccountNumber()

                +" Account Balance: "+getBalance();
    }
}
/*
create sub class of BankAccount and name it SavingAccount
        variables: accountNumber, accountHolder, balance, interestRate
        methods: deposit, showBalance
        */

class SavingAccount{

}

/*
	create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
 */
