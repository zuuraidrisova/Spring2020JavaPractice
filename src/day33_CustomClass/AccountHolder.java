package day33_CustomClass;

public class AccountHolder {


    public static void main(String[] args) {


        BankAccount2 accountHolder1 = new BankAccount2();

        accountHolder1.setAccountInfo("Kim Hva", 7788453,
                1200);

        System.out.println(accountHolder1);

        System.out.println("==========================");

        accountHolder1.checkBalance();

        System.out.println("==========================");

        accountHolder1.deposit(1000);

        System.out.println("===================");

        accountHolder1.withdraw(1000);

        System.out.println("======================");

        accountHolder1.withdraw(2000);

        System.out.println("========================");

       accountHolder1.checkBalance();

    }
}
