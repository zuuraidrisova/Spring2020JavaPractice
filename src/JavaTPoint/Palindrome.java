package JavaTPoint;

public class Palindrome {
    public static void main(String[] args) {
        /*
        Palindrome number in java: A palindrome number is a number that is same
         after reverse. For example 545, 151, 34543, 343, 171, 48984 are the
         palindrome numbers. It can also be a string like LOL, MADAM etc.

         */

        String num = "345873";

       String numReversed = "";

        for (int i = num.length()-1; i >= 0; i-- ){

            numReversed += num.charAt(i);

        }

        System.out.println(numReversed);

        if(num.equals(numReversed)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

    }


}
