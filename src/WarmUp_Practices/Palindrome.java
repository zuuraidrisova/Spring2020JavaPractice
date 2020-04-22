package WarmUp_Practices;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.next();
        System.out.println(name);

        String reversed = "";

        for(int i = name.length()-1; i>=0; i--){
            reversed += name.charAt(i);
        }
        System.out.println(reversed);

        if(name.equalsIgnoreCase(reversed)){
            System.out.println(name+" is a palindrome");
        }else{
            System.out.println(name+ " is not a palindrome");
        }

        boolean palindrome = name.equalsIgnoreCase(reversed);

        if(palindrome){
            System.out.println("palindrome");
        }else{
            System.out.println("NOT palindrome");
        }
    }
}
