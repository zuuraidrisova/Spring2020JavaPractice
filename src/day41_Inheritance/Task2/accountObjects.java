package day41_Inheritance.Task2;

public class accountObjects {

    public static void main(String[] args) {

        CheckingAccount ch = new CheckingAccount();

        ch.showBalance();

        System.out.println(ch);// all default values bcs we have not initialized yet

        ch.accountHolder = "Zuura Idrisova";
        ch.accountNumber = 19278946;
        ch.balance = 0;

        System.out.println(ch);//we set info, now we have all info

        ch.deposit(400);// now it added 400

        ch.showBalance();

        ch.withdraw(200);

        ch.showBalance();//now account balance is 200


        System.out.println("=====================================");

        SavingAccount saving = new SavingAccount();

        saving.showBalance();

        System.out.println(saving.interestRate);

        saving.accountHolder = "Sary";
        saving.accountNumber = 32289741;
        saving.balance = 0;

        saving.deposit(200);

        saving.showBalance();

        System.out.println(saving);

    }
}
