package day07_IfStatements;
/*
2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */
public class MaximumNumber {
    public static void main(String []args){
        int num1 =45;
        int num2 = 99;
        int num3 =3;
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is maximum number");
        }
        if(num2>num1 && num2 > num3){
            System.out.println(num2 + " is maximum number");
        }
        if(num3>num1 && num3 > num2){
            System.out.println(num3+ " is maximum number");
        }

    }
}
