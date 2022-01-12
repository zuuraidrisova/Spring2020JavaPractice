package day35_StaticKeyword;

public class Student {

    String name;
    long studentID;
    double gpa;
    static String schoolName = "Cybertek";

    public void setStudentInfo(String name, long studentID, double gpa){
        //this method is instance method, doesn't need any static variable

        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;

    }

    public static void printSchoolName(){
        //this is static method, because we use static key word and static variable
        //static accepts only static

        System.out.println("School name is : "+schoolName);
    }

    public String toString(){
        //this method does not use any static variable so we can make instance method

        return  "Name : "+name + " Student ID :"+studentID+ " School name : "+schoolName;

    }

}
