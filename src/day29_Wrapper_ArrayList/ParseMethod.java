package day29_Wrapper_ArrayList;

public class ParseMethod {

    public static void main(String[] args) {

        /*
        WRAPPER Class Methods:

            parse : converts string of text to primitive, returns primitive date types
         */

        String str = "123";

        System.out.println(str);//this is string of text

        int i =  Integer.parseInt(str); //converted to digits  123

        System.out.println(i);//this is int

        System.out.println("==================");

        System.out.println(str + 1);//concatenation--> returns string
        System.out.println(i + 1);//addition--> returns number

        System.out.println("==================");

        byte b1 = Byte.parseByte(str);//converts str to byte

      //  Integer i1 = Byte.parseByte(str); //compile error bcs Integer wrapper class
                                        // accepts only int

        Integer i1 = (int)Byte.parseByte(str);//autoboxing, explicit casting


        System.out.println(b1);

        System.out.println("==================");

        short s1 =  Short.parseShort(str);//converts str to short

        System.out.println(s1);

        /*
        String str2 = "aa2aa3";

        int i1 = Integer.parseInt(str2);//does not compile bcs it has text

        System.out.println(i1);

         */
        System.out.println("==================");

        String str1 = "10.7";

        float f1 = Float.parseFloat(str1);//converts string to float

        System.out.println(f1+1);//addition, returns float

        double d1 =  Double.parseDouble(str1);//converts string to double

        System.out.println(d1);//returns double

        System.out.println("==================");

        String str3 = "32147483647";

        long l1 = Long.parseLong(str3);// primitive data type long

        Long l2 = Long.parseLong(str3);//object, autoboxing

        System.out.println(l1);
        System.out.println(l2);


        System.out.println("==========================");

        String str4 = "true";

        boolean b2 =  Boolean.parseBoolean(str4);//converts string to boolean

        System.out.println( ! b2);//returns false bcs of  !


        String str5 = "today";//today is not true or false text

        boolean b3 = Boolean.parseBoolean(str5);//if it does not match with true or false,
                                                // by default it will return false

        System.out.println(b3);


        String str6 = "10 > 9";//not matching with true or false text

        boolean b4 = Boolean.parseBoolean(str6);//by default false bcs not matching

        System.out.println(b4);


        String str7 = "TruE";//matches true

        boolean b5 = Boolean.parseBoolean(str7); // ignores case sensitivity
                           // parse method does not care abt case sensitivity

        System.out.println(b5);//return true











    }
}
