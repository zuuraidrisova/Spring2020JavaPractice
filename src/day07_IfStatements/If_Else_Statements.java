package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String []args){

        int number = 9;

        if(number >=0){
            System.out.println(number+ " is positive");
        }
        if(number<0){
            System.out.println(number+ " is negative");
        }

        int number2 =100;

        if(number2%2==0){

            System.out.println(number2+ " is even number");

        } else {//otherwise

            System.out.println(number2+" is odd number");
        }

        int age =30;

        if(age>=21){

            System.out.println("Here is your Vodka");
        }else{
            System.out.println("Go drink your milk");
        }

        boolean testPositiveForCorona =false;
        //always 2 possibilities, not more and not less
        if(testPositiveForCorona){
            System.out.println("Stay home");
        }else{
            System.out.println("Do more coding!");
        }

    }
}
