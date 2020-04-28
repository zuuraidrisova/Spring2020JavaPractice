package day30_ArrayList;

public class sumOfDigits2 {

    public static void main(String[] args) {

        String str = "a1b2c3";

        char ch [] = str.toCharArray();

        int sum = 0;

        for(char each : ch){

            if(Character.isDigit(each)){

                sum += Integer.parseInt(""+each);
            }
        }

        System.out.println(sum);





    }
}
