package day42_Inheritance;

public class PalindromeNumber {

    /*
    write a method to check if a number is PALINDROME or Not
This can also be done using remainder (%) operator.
//////////////////
     */

    public static void main(String[] args) {

        long b = 123454321;

        boolean res = palindromeNum(b);

        System.out.println(res);

    }
    public static boolean palindromeNum (long num){

        String n = Long.toString(num);//converting to String

        String revNum= "";//storing reversed string

        for (int i=n.length()-1; i >= 0; i--) {//reversing string

            revNum += n.charAt(i);//concating to our result

        }
        if (revNum.equals(n)) {//comparing reversed version with origical string

            return true;

        }
        return false;
    }

}
