package day09_NestedIfStatements_Ternary;

public class Loan_NestedIf {
    public static void main(String []args){

        double salary = 120000;
        byte workHistory = 1;

        if(salary >= 30000){//might be qualified..true

            if(workHistory>=2){//if it is true, u are qualified

                System.out.println("You are qualified for loan!");

            }else{//gets executed when the if statement is false

                System.out.println("You need to work at least 2 years to be qualified!");
            }
        }else{

            System.out.println("You are not qualified!");
        }
    }
}
