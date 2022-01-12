package reviewPracticing;

public class PalindromNumber {


    /*
    write a method tov check if a number is PALINDROME or Not
This can also be done using remainder (%) operator.
//////////////////
     */

    public static void main(String[] args) {

        long b = 123454321;

        boolean k = palindromeNumber(b);

        System.out.println("k = " + k);

        long c = 12341;

        boolean v = palindromeNumber(c);

        System.out.println("v = " + v);

    }

    public static boolean palindromeNumber(long number){

        String num = ""+number;
        String reversed = "";

        for (int i = num.length()-1; i >= 0; i--){

            reversed += num.charAt(i);
        }

        if (num.equalsIgnoreCase(reversed)){

            return true;
        }

        return  false;
    }
}
