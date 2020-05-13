package InterviewQuestions;

public class FactorialNumber {
    /*
    Write a return method that returns the factorial number of any given number

    Ex:
	input: 5
    output: 120
			because:

				5! = 5 * 4 * 3 * 2* 1 = 120


     */
    public static void main(String[] args) {

        int num = 5;

        int fac = factorialNumber(num);

        int num2 = 7;
        int fac2 = FactorialNumber2(num2);

        System.out.println(fac2);
    }

    public static int factorialNumber(int num){

        int result = 1;

        for(int i = 1; i <= num; i++){

            result = result * i;
        }


        return result;
    }


    public static int FactorialNumber2(int num){

        int result = 1;

        for(int i = 1; i <= num; i++){

            result = result * i;

        }

        return result;
    }

}
