package day24_MethodsContinue;

public class PalindromeMethod {

    public static void main(String[] args) {

        /*
        write a method that can identify if a string is palindrome
			ex: palindrome("level")  ==> true
				palindrome("Cybertek") ==> false
         */

        String word2 = "hello";

        palindrome(word2);

    }

    public static void palindrome(String word){

        String reversed = "";

        for(int i = word.length()-1; i >= 0 ; i--){

            reversed += word.charAt(i);
        }

        if(word.equalsIgnoreCase(reversed)){
            System.out.println("It is a palindrome");

        }else{
            System.out.println("It is not a palindrome");
        }
    }

}
