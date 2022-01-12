package resources;

import day42_Inheritance.AccessModifiers2;

public class Inheritance2 extends AccessModifiers2 {
            // subclass                 superclass

    /*
    only public and protected can be inherited

    default cannot be inherited because it is only visible within the same package
     */

    public static void main(String[] args) {

        System.out.println(Inheritance2.publicVar);
        System.out.println(Inheritance2.protectedVar);

        System.out.println("===============================");

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
    }

}
