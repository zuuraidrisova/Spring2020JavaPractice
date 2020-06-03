package day42_Inheritance;

public class Data {

    public static String publicData = "public data";
            // visible everywhere, can be inherited everywhere

    protected static String protectedData = "protected data";
            // visible within the same package and  everywhere inside subclasses

    static String defaultData = "default data";//default access modifier
            // visible within the same package

    private static String privateData = "private data";
            // visible within the same class only


}
class testing extends Data{
    //sub             super

    // public, protected, default  can be inherited,
    public static void main(String[] args) {

        System.out.println(testing.publicData);
        System.out.println(testing.protectedData);
        System.out.println(testing.defaultData);

        //System.out.println(testing.privateData);
        //private data can never inherited  in anywhere

    }
}