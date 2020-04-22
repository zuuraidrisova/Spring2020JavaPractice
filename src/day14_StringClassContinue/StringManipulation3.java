package day14_StringClassContinue;

public class StringManipulation3 {
    public static void main(String[] args) {
        String str ="CYBERTEK";
        String str1 ="cybertek";

        System.out.println(str.equals(str1));//false, bcs one is upper and another is lower case

        System.out.println(str.equalsIgnoreCase(str1));//true, bcs it ignores case sensitivity


        String s1 = "Cybertek School";
           boolean s =   s1.contains("School");//true
        System.out.println(s);

        String s2 = "United States";
        System.out.println(s2.startsWith("U"));//true

        String s3 ="Cybertek School";
        System.out.println(s3.endsWith("l"));//true
        System.out.println(s3.endsWith("School"));//true
        System.out.println(s3.endsWith("Cybertek"));//false


    }
}
