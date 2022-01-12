package day33_CustomClass;

public class capitalOne {

    public static void main(String[] args) {

        BankAccount accountHolder1 = new BankAccount();

        accountHolder1.setAccountInfo("Zuura Idrisova",
                1078653293, 17000 );

        System.out.println(accountHolder1);

        System.out.println("============================");

        accountHolder1.checkBalance();

        System.out.println("==========================");

        accountHolder1.withdraw(1200);

        accountHolder1.checkBalance();

        System.out.println("===========================");

        accountHolder1.deposit(2000);

        accountHolder1.checkBalance();

        System.out.println("==========================");

    }
}
