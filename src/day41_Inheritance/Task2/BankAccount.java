package day41_Inheritance.Task2;

public class BankAccount {

      /*
    	create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString

     */

      public long accountNumber;
      public String accountHolder;
      public double balance;

      public void deposit(int amount){

          balance += amount;
      }

      public void showBalance(){

          System.out.println("Available balance: "+balance);
      }

      public String toString(){

          return "Account Holder: "+accountHolder+" Account Number: "+accountNumber

                  +" Account Balance: "+balance;
      }
}
