package day09_NestedIfStatements_Ternary;

public class IFStatementsWithoutCurlyBraces {
    public static void main(String []args){

        int number =100;

        if(number%2==0)//if statement without curly braces applies only a single statement
            System.out.println("Even number");

        else//it can contain only one single statement
            System.out.println("Odd number");

        if(9<8)//if the block contains more than one statement we MUST give the body
            System.out.println("hello");// it will get executed only if it is true

            System.out.println("condition is true");//gets executed no matter what
            System.out.println("text executed");//gets executed regardless of the condition

    }
}
