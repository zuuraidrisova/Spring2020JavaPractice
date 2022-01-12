package reviewPracticing.OOP_Tasks;


public class Bank {

            /*
            create a class called BankAccount
        variables:  accountNumber, accountHolder,  Balance
        methods: deposit, showBalance, toString

        create sub class of BankAccount and name it SavingAccount
        variables: accountNumber, accountHolder,
        balance, interestRate
        methods: deposit, showBalance

        create sub class of BankAccount and name it checkingAccount
        variables: accountNumber, accountHolder,
        balance
        methods: deposit, withDraw, showBalance
        inheritance vs import statement
             */

    private long accountNumber;
    private String accountHolder;
    public double balance;

    public long getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {

        this.accountNumber = accountNumber;
    }

    public String getAccountHolder(){

        return  accountHolder;

    }

    public void setAccountHolder(String firstName, String lastName){

        this.accountHolder = firstName+" "+lastName;
    }


    public void deposit(double amount) {

        System.out.println("The amount being deposited is : $" + amount);
        balance += amount;

    }

    public void checkBalance() {

        System.out.println("The amount in your available balance  is : $" + balance);

    }


    public String toString() {

        return "Account Holder: " + accountHolder + " Account Number: " + accountNumber

                + " Account Balance: " + balance;
    }



}

   /*
	create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance


			accountNumber ==> inherited
			 accountHolder ==> inherited
			  balance ==> inherited


			   withDraw()==> declared

			    showBalance()==> inherited
			    deposit() ==> inherited
			    toString() ==> inherited

    */

class Checking extends Bank{

    public void withdraw(double amount){

        balance -= amount;
    }
 }

     /*
create sub class of BankAccount and name it SavingAccount
        variables: accountNumber, accountHolder, balance, interestRate
        methods: deposit, showBalance

        accountNumber ==> inherited
         accountHolder ==> inherited
          balance ==> inherited

           interestRate ==> declared

           deposit()==> inherited
           showBalance()==> inherited
           toString() ==> inherited

        */

class Savings extends Bank{


    public static double interestRate;

   static  {

       interestRate = 0.02;
    }
}

class BankObjects{

    public static void main(String[] args) {

        Checking checking = new Checking();

        checking.checkBalance();

        checking.setAccountHolder("zuura","idrisova");
        checking.setAccountNumber(398288181);

        System.out.println("checking.getAccountHolder() = " + checking.getAccountHolder());
        System.out.println("checking.getAccountNumber() = " + checking.getAccountNumber());
        checking.deposit(1000);

        checking.checkBalance();

        checking.withdraw(200);

        checking.checkBalance();

        System.out.println("===========================================");

        Savings savings = new Savings();

        savings.checkBalance();

        savings.setAccountHolder("zuura","idrisova");
        savings.setAccountNumber(390932901);

        System.out.println("savings.getAccountHolder() = " + savings.getAccountHolder());
        System.out.println("savings.getAccountNumber() = " + savings.getAccountNumber());

        savings.checkBalance();

        savings.deposit(20000);




    }
}