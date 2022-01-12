package day24_MethodsContinue;

public class CalculateMethod {

    public static void main(String[] args) {

        /*
        write a method called Calculation, that passes 3 parameters:
        2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
         */

        calculate(56,12,"+");
    }

    public static void calculate(int num1, int num2,String operator){

        int result = 0;

        if(operator.equals("+")){

            result = num1 + num2;

        }else if(operator.equals("*")){

            result = num1 * num2;

        }else if(operator.equals("-")){

            result = num1 - num2;

        }else if(operator.equals("/")){

            result = num1 / num2;

        }else if(operator.equals("%")){

            result = num1 % num2;

        }else{
            System.out.println("Invalid operator");
        }

        System.out.println(result);


    }

}
