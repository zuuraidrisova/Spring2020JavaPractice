package day42_Inheritance;

public class TestData extends Data{

    // public, protected, default can be inherited, private cannot be ,
    // because it is only within class

    public static void main(String[] args) {

        System.out.println(TestData.publicData);// static can be called thru class name
        // public can be inherited everywhere

        System.out.println(TestData.protectedData);// static can be called thru class name
       // protected can be inherited within the same package and any subclasses regardless where they are

        System.out.println(TestData.defaultData);// static can be called thru class name
        // default can be inherited only within same package

       // System.out.println(TestData.privateData); private can never be visible outside class
                                                    // so can never be inherited

    }

}
