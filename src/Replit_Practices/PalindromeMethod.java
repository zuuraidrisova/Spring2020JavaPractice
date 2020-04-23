package Replit_Practices;

public class PalindromeMethod {
    /*
    Complete a method isPalindrome() that will check if number is a palindrome.
     Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
     */

    public static void main(String[] args) {

      int num =   reverse(1001);

        System.out.println(num);

      isPalindrome(num);

    }

    public static void isPalindrome(int number){

        int reverse = reverse(number);

        if(reverse == number){

            System.out.println(true);
        }else{

            System.out.println(false);
        }

    }
    public static int reverse(int number){

        int reverse = 0; //to store reverse number //4 3 2

        int remainder = 0;

        do{
            remainder = number % 10; // last digit 4 3 2 1

            reverse = reverse * 10 + remainder; // ==> 4 3

            number = number / 10; //get rid of last digit // 1

        }while(number > 0);


        return reverse;
    }


}
