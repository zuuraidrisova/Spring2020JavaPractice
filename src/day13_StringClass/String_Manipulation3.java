package day13_StringClass;

public class String_Manipulation3 {

    public static void main(String []args){

        String str = "I like Java programming,John is fun.";
               int num = str.indexOf("Java");//returns the index of  very first matching character
       //if there are more than 1 matching, we can give second available character
        System.out.println(num);

        String str2 = "Cybertek school is awesome";
            int num2 = str2.indexOf("s");//returns 9, first occurring character
            int num3 =str2.indexOf("is")+1;//returns 17

        System.out.println(num2);
        System.out.println(num3);

        int maxIndex = "Cybertek".length()-1;
        System.out.println(maxIndex);

        String names = " Muhtar";
           int num5 = names.indexOf("Good guy");
           //if character does not exist, it will return negative  number
        System.out.println(num5);

        String fullName ="Kuzzat Altay";

        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName =fullName.substring(fullName.indexOf(" ")+1);

        System.out.println(firstName);
        System.out.println(lastName);





    }
}
