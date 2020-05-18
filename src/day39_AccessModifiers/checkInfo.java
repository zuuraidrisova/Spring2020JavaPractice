package day39_AccessModifiers;

public class checkInfo {

    public static void main(String[] args) {

        // static variables can be accessed publicly PUBLIC
        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);
        System.out.println("ID: "+PersonalInfo.id);

        //static variables cannot be accessed in different class, PRIVATE

       // System.out.println("Grade: "+PersonalInfo.grade);
       // System.out.println("SSN: "+PersonalInfo.SSN);

        // static variable can be accessed within the same package, DEFAULT
        System.out.println("Age: "+PersonalInfo.age);


        PersonalInfo obj = new PersonalInfo();

        System.out.println(obj.name);
        System.out.println(obj.gender);

    }
}
