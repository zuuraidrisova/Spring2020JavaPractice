package WarmUp_Practices;

public class PalindromrPrimeNumbers {

    public static void main(String[] args) {

       boolean b =  isPalindrome(12321);

        System.out.println("b = " + b);
        
    }


    //write a function that returns if number is palindrome or not
    static boolean isPalindrome(int number){

        // ex: 123321
        //i would like to use chartAt() method of String class
        // so i can convert number to String

        String str = ""+number;

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);

        }
        return reversed.equalsIgnoreCase(str);

    }

    //write a function that returns if number is prime or not

    static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
