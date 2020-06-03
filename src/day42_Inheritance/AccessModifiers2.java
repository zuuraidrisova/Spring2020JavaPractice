package day42_Inheritance;

public class AccessModifiers2 {

    public static String publicVar = "public variable";
    protected static String protectedVar = "protected variable";
    static String defaultVar = "default variable";
    private static String privateVar = "private variable";


   public static void publicMethod(){

        System.out.println("public method");
    }

    protected static void protectedMethod(){

        System.out.println("protected method");
    }

    static void defaultMethod(){

        System.out.println("default method");
    }

    private static void privateMethod(){

        System.out.println("private method");
    }


}
