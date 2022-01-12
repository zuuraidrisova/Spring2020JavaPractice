package day14_StringClassContinue;

public class ValidWebAddress {
    /*
    write a program that can validate if a web address is valid
    valid web address:
            MUST start with www.
            MUST ends with .com, .edu, .net, .gov
     */

    public static void main(String []args){

        String webAddress = "cybertek.www.com";
           webAddress = webAddress.toLowerCase();

           boolean validStart = webAddress.startsWith("www.");
           boolean validEnding = webAddress.endsWith(".com") || webAddress.endsWith(".edu")
                   || webAddress.endsWith(".net") || webAddress.endsWith(".gov");

           if(validStart){

               if(validEnding){

                   System.out.println("Valid address");

               }else{

                   System.out.println("Invalid end of web address");
               }
           }else{
               System.out.println("Invalid start of web address");
           }


    }
}
