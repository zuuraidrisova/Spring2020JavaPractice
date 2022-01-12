package day39_AccessModifiers;

public class AccessModifiers {

    /*

   AccessModifier:
            public, private, protected, default

                    methods
                    variables

            public -->  is visible everywhere to everyone

            default --> if you do not provide access modifier, then
                        compiler will give you default access modifier
                        if it is default, it means it is accessible to all classes
                        within the same package

           private -->  can only be used within the same class

           assume one class is one country


           PUBLIC ==> DEFAULT ==> PRIVATE

     */

    int defaultAccess = 1000;//it has now default modifier, can be accessed within the same package

    public static int publicAccess = 2000;//this variable hs public access, can be access at everywhere

    private long SSN = 901234; // can only be used within the same class

}
