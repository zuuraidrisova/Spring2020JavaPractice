package day41_Inheritance;

import static day41_Inheritance.Data.*;

public class DataTest {

    public static void main(String[] args) {

        System.out.println(a); // static variable imported

        System.out.println(Data.a); // can be called thru class name

      //  System.out.println(DataTest.a); // this is an object of different class,
                                        // we cannot use like this, because it is imported

      //  Inheritance gives rights to copy variables and methods using extends keyword
        //we can make multiple copies

    }
}
