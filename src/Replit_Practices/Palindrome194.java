package Replit_Practices;

public class Palindrome194 {
    /*
    Palindrome is a word, phrase, or sequence that reads the same backward as
    forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome
and false if it is not.

- make your conditions case insensitive.  ex: Civic and civic are both palindromes
- make your conditions space insensitive.  Race car is a palindrome even though
there is space in between.

Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true
     */

    public static void main(String[] args) {

        String n = "Nurses run";

       boolean b =  isPalindrome(n);

        System.out.println(b);
    }
    public static boolean isPalindrome(String check) {

        String reverse = "";

        for(int i = check.length()-1; i >= 0; i--){

            reverse += check.charAt(i);

        }

        check = check.replaceAll(" ","");
        reverse = reverse.replaceAll(" ","");

        if(check.equalsIgnoreCase(reverse)){

            return true;
        }else{
            return false;
        }
    }
}
