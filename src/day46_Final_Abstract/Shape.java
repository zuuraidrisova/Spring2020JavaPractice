package day46_Final_Abstract;

public abstract class Shape {

    /*
Can we declare abstract method as static?
No, We can't use static keyword with abstract method,
 because static cannot be overridden, abstract method is meant to be overridden

Can we declare abstract method as final?
No, We cannot use final keyword with abstract class,
because abstract method is meant to be inherited

Can we declare abstract method as private?
No, We cannot declare abstract method as private, because private cannot be inherited

Can we use public, protected and default modifiers with abstract method?
Yes, We can use public, protected and default modifiers with abstract method.
     */

    public abstract void area();// ==> abstract method does not have body

    //abstract method can only be created in an abstract class and by using interface
    // abstract method cannot be private, static, and final

}
