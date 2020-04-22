package OfficeHours.Practice_04_01_2020;

public class String_Methods_BooleanType {
    public static void main(String []args){
        // isEmpty()==> checks whether string is empty or not
        //returns true if it is empty, returns false if it is full
        String str = "     ";
        boolean r1 =str.isEmpty();// false
        boolean r2 =!str.isEmpty();//true
        System.out.println(r1);//false, it has spaces
        System.out.println(r2);//true, because it is not empty

        System.out.println("++++++++++++++");

        //equals(str)==> checks whether two strings of text  are equal or not
        //returns true if it is equal, return false if it is not equal
        // == checks memory location
        // equals() checks visible text
        String s1 ="cat";
        String s2 =new String("cat");
        String s3 ="Cat";
        System.out.println(s1==s2);//false, because two different memory locations
        System.out.println(s1.equals(s2));//true, because visible text is similar
        System.out.println(s1.equals(s3));//false, because case sensitive

        System.out.println("++++++++++++++");

        //equalsIgnoreCase()==> checks whether two string of text is equal or not
        //without case sensitivity, ignoring case
        //returns true if it is equal, returns false if it is not equal
        System.out.println(s1.equalsIgnoreCase(s3));//true,
        // because it ignores case sensitivity

        System.out.println("++++++++++++++");
        //contains(str)==> checks whether string is included in the string
        //returns true if it is included, returns false if it is not included
        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("Java"));//true
        String sentence2 ="Top 3 viruses are: corona, hanta, ebola";
        System.out.println(sentence2.contains("java"));//false

        System.out.println("++++++++++++++");
        //startsWith(str)==> checks whether string starts with given character
        //returns true if it starts, returns false if it does not start
        String webAddress ="www.amazon.com";
        boolean web  = webAddress.startsWith("www");//true
        System.out.println(web);//true

        //endsWith(str)==> checks whether string ends with given character
        //returns true if it ends, returns false if it does not end
        String gmail = "CybertekSchool@gmail.com";
        System.out.println(gmail.endsWith("@gmail.com"));//true










    }
}
