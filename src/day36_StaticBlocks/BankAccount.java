package day36_StaticBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccount {
    /*
    create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requirements:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available
					 balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should
					 not be able to withdraw money
			3. user should be able to see their balance
     */


    String AccountHolder;
    long AccountNumber;
    double balance;
    int penaltyFee;

    public  void setAccountHolderInfo(String AccountHolder, long AccountNumber, double balance){

        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.balance = balance;


    }

    public String toString(){

        return "Account Holder is : "+AccountHolder + ", Account number is : "
                +AccountNumber+", Account Balance is : "+balance;

    }

    public void showBalance(){

        System.out.println("Available Balance in your account is : "+balance);
    }

    public void deposit(double amount){

        System.out.println("The amount being deposited is : "+amount);
        System.out.println("The balance after depositing is : "+ (balance+amount));

    }

    public void withdraw(double amount){

        this.penaltyFee = 35;

        if(amount > balance){

            System.out.println("The overdraft penalty of "+penaltyFee +" was added to your account");
            System.out.println("The current balance is : "+ (balance - (amount+ penaltyFee)));

        }else if(balance <= 0){

            System.out.println("Unfortunately, your do not have enough balance in your account.");

        }
    }


}
class AccountHolder{

    public static void main(String[] args) {


        BankAccount accountHolder1 = new BankAccount();

        accountHolder1.setAccountHolderInfo("Sary", 56886, 900);

        BankAccount accountHolder2 = new BankAccount();

        accountHolder2.setAccountHolderInfo("Zuura", 82612, 1000);

        BankAccount accountHolder3 = new BankAccount();

        accountHolder3.setAccountHolderInfo("Alina",86632, 500);

        BankAccount accountHolder4 = new BankAccount();

        accountHolder4.setAccountHolderInfo("Asan", 90261, 1200);

        BankAccount accountHolder5 = new BankAccount();

        accountHolder5.setAccountHolderInfo("Zeynep", 12354, 3000);


        ArrayList<BankAccount> listAccounts = new ArrayList<>();

        listAccounts.addAll(Arrays.asList(accountHolder1, accountHolder2,

                accountHolder3,accountHolder4, accountHolder5));

        for(int i = 0; i < listAccounts.size(); i++){

            System.out.println(listAccounts.get(i));
        }

        System.out.println("================================================");

        System.out.println(listAccounts.size());

        System.out.println("================================================");

        for(BankAccount each : listAccounts){

            each.deposit(1000);
        }

        System.out.println("==================================================");

        for(int i = 0; i < listAccounts.size(); i++){

            listAccounts.get(i).showBalance();
        }

        System.out.println("===================================================");

        for (BankAccount each : listAccounts){

            each.withdraw(2000);
        }

        System.out.println("===================================================");

        listAccounts.removeIf(p -> p.balance < 0);

        for(BankAccount each : listAccounts){

            System.out.println(each);
        }
    }

}