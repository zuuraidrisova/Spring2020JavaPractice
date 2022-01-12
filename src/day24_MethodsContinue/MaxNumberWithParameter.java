package day24_MethodsContinue;

public class MaxNumberWithParameter {

    public static void main(String[] args) {
         /*
        write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
         */

         int a = 98;

         int b = 12;

         MaxNumber(a,b);
    }

    public static void MaxNumber(int num1, int num2){

        if(num1 >= num2 ){
            System.out.println("Maximum number is "+num1);

        }else{
            System.out.println("Maximum number is "+num2);
        }
    }
}
