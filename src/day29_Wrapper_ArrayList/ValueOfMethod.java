package day29_Wrapper_ArrayList;

public class ValueOfMethod {

    public static void main(String[] args) {

        /*

       Wrapper class method:

                valueOf() : converts string of text to a wrapper class , returns object

         */
        String str = "123";

        Integer i = Integer.valueOf(str);//converts string of text into integer object

        System.out.println(i+1);//numeric, addition is here, returns 124

        double d = i; //primitive data types accept any wrapper classes
        //double = Integer;--> unboxing

        System.out.println(d);//123.0

        System.out.println("===================");

        String str2 = "15.5";

        double d1 =  Double.parseDouble(str2); // converts text to decimal primitive and returns double primitive
         //double = double; no autoboxing no unboxing

        System.out.println(d1);

        Double d2 = Double.valueOf(str2);//converts text to digits and returns object
            // double = Double -->  unboxing

        System.out.println(d2);

        System.out.println(d1 == d2);//true

        System.out.println("==================");

        String str3 = "true";

        Boolean b = Boolean.valueOf(str3);

        System.out.println(b);

        System.out.println("=================");

        String str4 = "True";

        Boolean b1 = Boolean.valueOf(str4);//converts string to Boolean Wrapper class
        boolean b3 = Boolean.valueOf(str4);//--> unboxing//true

        System.out.println(b1);
        System.out.println(b3);

        String str5 = "FalSE";

        Boolean b2 = Boolean.valueOf(str5);//converts string to Boolean Wrapper class,
        // does not care abt case sensitivity

        System.out.println(b2);

        System.out.println("=====================");

        String str6 = "1000000000.5";

        Float f1 =  Float.valueOf(str6);//converts string to Float Wrapper class

        System.out.println(f1);

        String str7 = "12345";

        Short s1 = Short.valueOf(str7);//converts string to Short Wrapper Class

        System.out.println(s1);

        System.out.println("=======================");

        String str8 = "10 > 9";//true expression, but does not match true text or false text

       Boolean b5 =  Boolean.valueOf(str8);//by default returns false

        System.out.println(b5);


    }
}
