package day42_Inheritance;

public class AccessModifiers {
    /*

    Access Modifiers:

            public  ==>visible and  accessible everywhere
            default ==> only visible within the same package
            private ==> only visible and accessible within the same class
                        private can be accessed thru getter, but never be inherited

            protected ==> special, because has relationship with inheritance
                            visible within the same package
                            and outside it is visible only for subclasses

           public and protected can be inherited in any subclasses

           public == > protected ==> default ==> private

  Inheritance :
            subclass inheriting features(methods and variables) of super class
            one class can only extend one super class
            one super class can be inherited by multiple sub classes

             Super class can never inherit anything from sub classes

            sub class : inherits public variables and methods from super class
                        Private variables and methods can never be inherited
                        Default can be inherited as long as subclasses are within the same package
                        Public and  protected can always be inherited in the subclasses, at anywhere

            same package:
                        public, protected, default

            different package:
                        public and protected


            Constructor is not inherited,because same name should be used to create one

 constructor calls:

        1. at least one parent class  constructor must be called in sub class
        2.if parent class constructor is default , it is called by default
        3. if parent class constructor is not default, it is called bu super() keyword






     */
}
