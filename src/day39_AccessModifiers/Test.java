package day39_AccessModifiers;

public class Test {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.defaultAccess);//can be used within this package but different classes

        System.out.println(obj.publicAccess);//open to the world

       // System.out.println(obj.SSN); access denied, it is private,
        // visible only within class its  declared

    }
}
