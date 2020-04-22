package day02_Variables;

public class EscapeSequences {

public static void main(String [] args){
        System.out.println("\t\t\t\t\t\tHello");
        /* \t it gives paragraph space
         they should be within the double quote
         */
        System.out.println("Cybertek \n  School");
        // \n starts a new line, within double quotes
        System.out.println("Cybertek School");
        System.out.println("\nMy\n\nname\nis\nZuura");

        System.out.println("My favourite tv-show is \"The game of Thrones\"");
        // \" this prints double quote on the console
         System.out.println("My favorite book is \"When the mountains fall\" by well-known kyrgyz author Chyngyz Aytmatov");

         System.out.println("\\");
         //prints single slash on the console
         System.out.println("/");
         //prints backslash on the console

        System.out.println("My favorite programming language is 'Java'. ");
        }
}
