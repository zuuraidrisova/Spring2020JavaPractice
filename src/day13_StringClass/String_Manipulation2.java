package day13_StringClass;

public class String_Manipulation2 {
    public static void main(String []args){

        String str = "Cybertek School is the best";
                    //01234567
        String schoolName = str.substring(0,8);//index from beginning till the ending index excluded
        System.out.println(schoolName);

        String fullName ="Kuzzat Altay";
        String firstName = fullName.substring(0,6);
        System.out.println("Hist first name is " +firstName);
        String lastName = fullName.substring(7,11+1);
        System.out.println("His last name is "+lastName);

        //from full name =  firstname + lastname;
        //gmail: lastname_firstname@gmail.com

        String name = "Zuura Idrisova";
        String firstname = name.substring(0,5);
        String lastname = name.substring(6,13+1);
        System.out.println(lastname.concat("_"+firstname.concat("@gmail.com")));
        String gmail = lastname+"_"+firstname+"@gmail.com";
        System.out.println(gmail);
        String gmail1 = name.substring(0,5)+"_"+name.substring(6,13+1)+"@gmail.com";
        System.out.println(gmail1);

        String s1 = "I love Java Programming Language";
        String className = s1.substring(7);
        System.out.println(className);

        String s2 = "I like C# Programming";//new value will be replaced with old one
              s2 =   s2.replace("C#","Java");
        System.out.println(s2);

        String nAme = "COVID 18";
             nAme =  nAme.replace("8","9");
        System.out.println(nAme);

        String r1 ="I like C#, C# is fun, C# is cool";
             r1 =    r1.replaceFirst("C#","Java");
             //the first value will be replaced with old one
        System.out.println(r1);

        String day = "Tomorrow is Monday, Tomorrow is Tuesday";
              day =   day.replaceFirst("Tomorrow","Today");
        System.out.println(day);

        String s3 = "I like python, python is fun, python is cool";
        String s4 = s3.replace("python","java");
        System.out.println(s4);

        String s5 = s3.replaceFirst("python","java");
        System.out.println(s5);





    }
}
