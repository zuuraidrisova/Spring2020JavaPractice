package day23_CustomMethods;

public class CalculationMethod {

    public static void main(String[] args) {
        /*
        write a method called Calculation, that can accepts 3 parameters:
         2 numbers and one operator, and prints out the calculation.
		if operator is not between [-, +, *, /, %] output should be
		Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;
         */

        calculation(10,2,"*");

    }
    public static void calculation(int num1, int num2,String operator ){

        if(operator.equals("+")){

            System.out.println(num1 + num2);

        }else if(operator.equals("*")){

            System.out.println(num1 * num2);

        }else if(operator.equals("-")){

            System.out.println(num1 - num2);

        }else if(operator.equals("/")){

            System.out.println(num1 /num2);

        }else if(operator.equals("%")){

            System.out.println(num1 % num2);
        }else{

            System.out.println("Invalid operator");
        }

    }


}
