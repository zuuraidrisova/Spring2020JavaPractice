package day13_StringClass;

public class StringManipulation4 {

    public static void main(String []args){

        String str = "Cybertek School is the best school";
        String schoolName = str.substring(0,str.indexOf(" "));
        System.out.println(schoolName);


        String fullName = "Kuzzat Altay";
        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        System.out.println(fullName);
        System.out.println(firstName);
        System.out.println(lastName);

        String gmail = lastName.concat("_").concat(firstName).concat("@gmail.com").toLowerCase();
        System.out.println(gmail);

        String s1 = "I love Java programming";
        String className = s1.substring(7);
        System.out.println(className);


        String s2 = "I like C# programming";
        String s3 = s2.replace("C#","Java");
        System.out.println(s3);

        String name = "COVID 18";
        String name2 = name.replace("8","9");
        System.out.println(name2);



    }
}
