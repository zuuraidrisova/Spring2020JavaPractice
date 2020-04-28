package WarmUp_Practices;

public class ReturnSumOfDigits {

    public static void main(String[] args) {

     /*
        write a program that can return the sum of all the digits from a string

        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)
        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)

        HINT: on ascii table, the characters between #48 ~ #57 are digits


      */

     String str = "a1b2c3";

     int sum = sum(str);

        System.out.println(sum);




    }

    public static int sum(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                sum += Integer.parseInt(""+str.charAt(i));
            }
        }

        return sum;

    }
}
