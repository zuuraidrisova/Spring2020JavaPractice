package Replit_Practices;
import java.util.Scanner;
public class Email_ExReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")){
            String first = email.substring(0, email.indexOf("_"));
            String last = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            String reverseEmail = last+"_".concat(first)+domain;
            System.out.println(last+"_".concat(first)+domain);
        }else{
            System.out.println(email);
        }
    }
}
