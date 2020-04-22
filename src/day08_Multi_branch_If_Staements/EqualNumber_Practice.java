package day08_Multi_branch_If_Staements;

public class EqualNumber_Practice {
    public static void main(String []args){
        double num1 =300;
        double num2 =3000;
        double num3 =30000;

        boolean num1EqualNum2 = num1==num2 && num1!=num3;
        boolean num1EqualNum3 = num1==num3 && num1!=num2;
        boolean num2EqualNum3 = num2==num3 && num2!= num1;
        boolean AllEqual = num1==num2 && num1==num3;

        if(num1EqualNum2){
            System.out.println("num1  is equal to num2");
        }else if(num1EqualNum3){
            System.out.println("num1 is equal to num3");
        }else if(num2EqualNum3){
            System.out.println("num2 is equal to num3 ");
        }else if(AllEqual){
            System.out.println("All is equal.");
        }else{
            System.out.println("None of them are equal.");
        }

        //another way doing it, with declaring a local  variable and initializing it
        String result = " ";
        if(num1EqualNum2){
            result = "num1 is equal to num2";
        }else if(num1EqualNum3){
            result = "num1 is equal to num3";
        }else if(num2EqualNum3){
            result = "num2 is equal to num3";
        }else if(AllEqual){
            result ="All is equal";
        }else{
            result ="None of them are equal";
        }
        System.out.println(result);

    }
}
