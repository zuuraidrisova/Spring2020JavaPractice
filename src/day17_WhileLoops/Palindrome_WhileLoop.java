package day17_WhileLoops;

public class Palindrome_WhileLoop {
    public static void main(String[] args) {
        /*
        write a program that can check if user entered a string of text is palindrome
         */
        String str = "Java";

        String reversed = "";//to store reversed version of str

        int lastIndex = str.length()-1;//last index number

        while(lastIndex >= 0){

            reversed+=str.charAt(lastIndex);

            lastIndex--;

        }

        boolean palindrome = reversed.equalsIgnoreCase(str);

        if(palindrome){

            System.out.println("It is palindrome!");

        }else{
            System.out.println("It is not palindrome!");
        }

        System.out.println(reversed);

    }
}
