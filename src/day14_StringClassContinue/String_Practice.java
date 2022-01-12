package day14_StringClassContinue;

public class String_Practice {

    public static void main(String []args){

        String gmail = "zuuraidrisova@gmail.com";

        String userGmail ="Zuuraidrisova@gmail.com";

       //boolean result =  gmail.equals(userGmail);//false
        boolean result = gmail.equalsIgnoreCase(userGmail); //true

        if(result){
            System.out.println("Logged in");
        }

        System.out.println("+++++++++++++++++");
        /*
        valid password must contain a special character as(! _# $ %) and no space
         */
        String password = "mama 2019";

        if(password.contains(" ")){

            System.out.println("Password cannot have space in it");

        }else{

            System.out.println("Valid password");
        }

        System.out.println("++++++++++++++");
        /*
        every website has "www." at the beginning of the web address
         */
        String website = "www.amazon.com";
            website = website.toLowerCase();
            if(website.startsWith("w")){
                System.out.println("It is valid");
        }

        System.out.println("++++++++++++++++");
            /*
            every single gmail address ends with "@gmail.com"
             */

            String email = "zuuraidrisova@yahoo.com";

                if(email.endsWith("@gmail.com")) {

                    System.out.println("valid gmail");

                } else{
                     System.out.println("invalid gmail");
                 }




    }
}
