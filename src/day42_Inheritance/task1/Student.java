package day42_Inheritance.task1;

public class Student extends Person{

    /*
    create a subclass of Person called Student
				attributes: name, age, gender, studentID, class
				methods: attendClass, code, setStudentInfo, toString

				Student is a Person relationship
     */

    public String clazz;
    public long studentID;
    public static String schoolName = "Cybertek";

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz){

        setPersonInfo(name, age, gender);
        this.studentID =studentID;
        this.clazz = clazz;
    }

    public void attendClass(String subject){

        System.out.println(name+" attends "+subject);
    }

    public void code(String programLang){

        System.out.println(name+" codes "+programLang);
    }

    public String toString(){

        return "Name: "+name+", Class of: "+clazz+", SchoolName: "+schoolName+", Student ID: "+studentID+", Age: "+age

        +", Gender: "+gender;
    }

}
