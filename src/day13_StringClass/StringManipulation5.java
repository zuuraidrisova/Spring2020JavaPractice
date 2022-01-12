package day13_StringClass;


public class StringManipulation5 {

    public static void main(String[] args) {

        String str = "I like java programming";
        int num =  str.indexOf("j");
        System.out.println(num);

        String name ="Muhtar";
        int i = name.indexOf("Good guy");
        System.out.println(i);

        String fullName ="Kuzzat Altay";
        String first = fullName.substring(0,fullName.indexOf(" "));
        String last = fullName.substring(fullName.indexOf(" ")+1);

        System.out.println(first);
        System.out.println(last);


    }
}
