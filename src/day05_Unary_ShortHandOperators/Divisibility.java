package day05_Unary_ShortHandOperators;

public class Divisibility {
    public static void main(String[] args) {
        int num= 65;
        boolean DivisibleBy2 = num % 2 == 0;
        //num can be divided by 2 without remainder
        boolean DivisibleBy3 = num % 3 == 0;
        //num can be divided by 3 without remainder
        boolean DivisibleBy5 = num % 5 == 0;
        //num can be divided by 5 without remainder
        String result1 = num + " is divisible by 2: " + DivisibleBy2;
        String result2 = num + " is divisible by 3: " + DivisibleBy3;
        String result3 = num + " is divisible by 5: " + DivisibleBy5;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        int num2 =80;
        boolean evenNum1 = num2 % 2 == 0;
        boolean evenNum2 = num2 % 3 == 0;
        boolean evenNum3 = num2 % 5 == 0;

        String result4 = num2 + " is divisble by 2: "+ evenNum1;
        String result5 = num2 + " is divisble by 3: "+ evenNum2;
        String result6 = num2 + " is divisble by 5: "+ evenNum3;

        String FinalResult = result4+ "\n"+ result5+"\n" +result6;//concatenation
        System.out.println(FinalResult);
    }
}
