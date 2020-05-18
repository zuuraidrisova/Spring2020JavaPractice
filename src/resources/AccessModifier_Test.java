package resources;

import day39_AccessModifiers.AccessModifiers;
import day39_AccessModifiers.PersonalInfo;

public class AccessModifier_Test {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

      //  System.out.println(obj.defaultAccess);
        // cannot be accessed in different package

        System.out.println(obj.publicAccess);//visible at everywhere

        //Public access modifiers can be accessed at everywhere
        System.out.println(PersonalInfo.name);//public, static
 // we need to import package, if we want to use variables in different package

        System.out.println(PersonalInfo.gender);//public, static

        //Default access modifier can be accessed within the same package
       // System.out.println(PersonalInfo.grade);//default, static
       // System.out.println(PersonalInfo.age);//default, static


        // Private access modifiers can be accessed with the same class only
       // System.out.println(PersonalInfo.SSN);//private, static
       // System.out.println(PersonalInfo.ID);//private, static






    }
}
