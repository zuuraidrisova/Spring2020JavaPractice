package day13_StringClass;
//import java.lang.String;//no need, all classes in this package imported automatically
public class String_Manipulations {
    public static void main(String []args){
        String str = "Cybertek";//01234567
        //each character in string has an index number,  which starts from zero,cannot be negative
        char ch1 = str.charAt(5);
        System.out.println(ch1=='A');
                         //'t'=='A';//false
        System.out.println(ch1=='T');
                        //'t'=='T';//false

        int totalLegth = str.length();//counts from 1
        System.out.println(totalLegth);//counts characters and returns as an int: 8
        System.out.println(totalLegth>10);//false

        String str2 = "Today is great day, Java is fun!";
        int maxNumber = str2.length()-1;
        System.out.println(maxNumber);

        String s1 ="Cybertek";//strings  cannot be changed
          s1 = s1.concat(" School");//Cybertek School
        System.out.println(s1);

        String s2 = "Java";
        System.out.println(s2.concat(" is a programming language"));//Java is a programming language
        System.out.println(s2);//Java

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        String r1 = "Java is fun";
              r1 =   r1.concat(" and it is easy");
        System.out.println(r1);

        String name1 = "CYBERTEK";
              name1 = name1.toLowerCase();//converts to lower case and returns a new string value
        System.out.println(name1);

        String name2 = "cybertek school";
                name2 = name2.toUpperCase();
        System.out.println(name2);//name2 has a new string value

        String a1 = "             Today is a great day           ";
        System.out.println(a1);
             a1 =  a1.trim();//removes unused space
        System.out.println(a1);//now a1 has a new string value













    }
}
