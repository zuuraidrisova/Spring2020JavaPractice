package day33_CustomClass;

public class BankAccount2 {
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
					2.2 if the balance is less than or equal to 0, user
					 should not be able to withdraw money
			3. user should be able to see their balance


 */
        String accountHolder;
        long accountNumber;
        double accountBalance;


        public void setAccountInfo(String fullName, long accountNum, double balance){


            accountHolder = fullName;
            accountNumber = accountNum;
            accountBalance = balance;

        }

        public String toString(){

            String result = "Account Holder is "+accountHolder + "\n"+"Account Number is "+
                    accountNumber+ "\n"+"Account Balance is $ "+accountBalance;

            return result;
        }

        public void checkBalance(){

            System.out.println("Available balance in your account is $ "+ accountBalance);

        }

        public void deposit(double amount){

            System.out.println("Amount depositing to your account is $ "+ amount);

            accountBalance = accountBalance + amount;

            System.out.println("Your account balance after depositing is $ " + accountBalance);

        }

        public void withdraw(double amount){

            int penaltyFee = 0;

            if(amount > accountBalance){

                penaltyFee += 35;

                System.out.println("Penalty charge of $ "
                        +penaltyFee + " is added to your account balance for overdraft");

                accountBalance = accountBalance - (amount + 35);

                System.out.println("Your account balance after withdrawal is "+ accountBalance);

            }else if(accountBalance <= 0){

                System.out.println("Sorry, your account balance is negative");

            }else{

                System.out.println("Amount withdrawing from your account is $ "+amount);

                accountBalance = accountBalance - amount;

                System.out.println("Your account balance after withdrawal is "+ accountBalance);

            }
        }

}
