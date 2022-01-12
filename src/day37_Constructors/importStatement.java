package day37_Constructors;

import java.util.*;

import static day37_Constructors.Data.staticVariable;
import static day37_Constructors.Data.staticMethod;

public class importStatement {

    public static void main(String[] args) {

        int [] arr = {4,3,2,1};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(staticVariable);//prints 300

        staticMethod();//bcs we already imported it is not necessary to call thru the class name

        /*

        Reqular imports:

                 import packageName.className; --> imports a particular class

                 import packageName.*;--> imports all classes even thou unnecessary

        Static imports:

                we can import static variables and methods only

                syntax:
              import static packageName.className.name; --> imports particular static method or variable

            import static packageName.className.*;--> imports all static variables and methods

         */

    }
}
