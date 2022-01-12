package day33_CustomClass;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void setAccountInfo(String fullName, long accountNum, double accountBalance ){

        accountHolder = fullName;
        accountNumber = accountNum;
        balance = accountBalance;

    }

    public String toString(){

        return "AccountHolder is "+accountHolder +" "+"\n"+
                "Account Number is "+ accountNumber+"\n"+
                "AccountBalance is "+balance;
    }


    public void checkBalance(){

        System.out.println("Available balance is  $"+ balance);
    }

    public void withdraw(double amount) {


        System.out.println("Withdrawing $" + amount);

        balance = balance - amount;


    }

    public void deposit(double amount){

        System.out.println("Depositing $"+ amount);

        balance = balance + amount;
    }

}
