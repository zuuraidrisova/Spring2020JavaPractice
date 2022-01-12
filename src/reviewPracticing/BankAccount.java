package reviewPracticing;

public class BankAccount {

            /*
            create a custom class for BankAccount
        attributes/data that can have are:
        1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: showBalance, deposit, withdraw
        requiremnts:
        1. user should be able to deposit money into their account
        2. user should be able to withdraw money from their account
        2.1. if the withdrawing account is greater than available
        balance, 35$ penalty charge will be added
        2.2. if the balance is less than or equal to 0, user should not
        be able to withdraw money
        3. user should be able to see their balance
             */

            String accountHolder;
            long accountNumber;
            double balance;

            public void setAccountInfo(String accountHolder, long accountNumber, double balance){

                this.accountHolder = accountHolder;
                this.accountNumber = accountNumber;
                this.balance = balance;

            }

            public String toString(){

                return "AccountHolder is "+accountHolder +" "+"\n"+
                "Account Number is "+ accountNumber+"\n"+
                "AccountBalance is "+balance;

                }


     public void checkBalance(){

        System.out.println("Available balance in your account is: "+balance);
    }


    public void deposit(long amount){

                System.out.println("Balance before Depositing $"+ balance);
                System.out.println("The amount being deposited is: "+amount);

                balance += amount;

                System.out.println("Balance after Depositing $"+ balance);

    }

    public void withdraw(long amount){

                        if (balance <= 0){

                            System.out.println("Sorry, You dont have money in your account!");

                        }else if(amount > balance){


                            int penaltyFee = 35;

                            System.out.println("Penalty charge of $ "
                                    +penaltyFee + " is added to your account balance for overdraft");

                            balance = balance - (amount + penaltyFee);

                            System.out.println("Your account balance after withdrawal is "+ balance);

                        }else {

                            System.out.println("Balance before withdrawing: " + balance);

                            System.out.println("Withdrawing amount is: " + amount);

                            balance -= amount;

                            System.out.println("Balance after withdrawing: " + balance);
                        }
                    }

}

class AccountHolder{


    public static void main(String[] args) {

        BankAccount bk = new BankAccount();

        bk.setAccountInfo("Zuura I",390721121,450);

        System.out.println(bk);

        bk.deposit(600);

        bk.checkBalance();

        bk.withdraw(800);

        bk.withdraw(280);

    }
}