package Replit_Practices;
import java.util.Scanner;
public class AlejandroEmails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        /*
        as Alejandro's time is precious and even with his little knowledge
        of programming he managed to save some time. but still he had a lot
        of emails to read.

        he wants to add more conditions to his program,
        he wants only job related mails so he will narrow it down by
        also checking if the word "project" also appears beside his name,
         that way he will be sure its a job email that refers to him.


            for example:

             a = "dear alejandro.....alot of text"

              outputs: "dont read"

               a = "thunder blaz is the best drink in the galaxy..."

               outputs: "dont read"

              a = "subject : important project, alejandro we refer to you  this ...."

              outputs: "read this mail"
         */

        //your code here
        if (a.contains("thunder blaz is the best drink in the galaxy")) {
            System.out.println("dont read");
        }else if(a.startsWith("dear alejandro")
                && a.endsWith(" a lot of text")) {
            System.out.println("dont read");
        }else if(a.contains("project")) {
            System.out.println("read this email");
        } else {
            System.out.println("dont read");
        }

    }
}
