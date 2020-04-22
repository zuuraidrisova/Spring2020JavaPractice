package day03_VariablesContinue;

public class Arithmetic_Operators {

    public static void main(String[] args) {
        /*
        + : addition
			- : subtraction
			* : multiplication
			/ : division
			% : remainder
         */
        System.out.println(5+3); //8
        System.out.println(10-2);//8
        System.out.println(10*3);//30
        System.out.println(10/2);//5, 10 - is nominator, 2-is denominator,denominator cannot be 0
        //System.out.println(30/0); denominator cannot be zero in math
        System.out.println(10-(4*2));//numerator - (denominator *result of wholenumber)
        // 2 is remainder
        System.out.println(10%4);//gives 2 as a remainder
        System.out.println(10/3);//3.3333
        System.out.println(10%3);//gives 1 as a remainder
        int result1 = 10%3;
        System.out.println(result1);//1
        int result2 = 11%3;
        System.out.println(result2);//2

        int c1= 10/4;
        System.out.println(c1);//2
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5

        double d1 =10/4;
        System.out.println(d1);//2.0
        double d2 = 10/4.0f;
        System.out.println(d2);












    }
}
