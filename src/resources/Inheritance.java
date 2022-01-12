package resources;

import day42_Inheritance.Data;
import day42_Inheritance.TestData;

public class Inheritance extends Data {
    //          sub             super
    // public, protected can be inherited,

    //public is visible and can be inherited everywhere
    //protected is visible and can be inherited only in subclasses

    // private cannot be inherited, because it is only within the same class
    // default can be inherited , but only within the same package

    public static void main(String[] args) {


        System.out.println(Inheritance.publicData);// static can be called thru class name
        // public can be inherited everywhere

        System.out.println(Inheritance.protectedData);// static can be called thru class name
        // protected can be inherited within the same package and any subclasses regardless where they are

        // System.out.println(TestData.defaultData);// static can be called thru class name
        // default can be inherited only within same package

        // System.out.println(TestData.privateData); private can never be visible outside class
        // so can never be inherited

    }
}
