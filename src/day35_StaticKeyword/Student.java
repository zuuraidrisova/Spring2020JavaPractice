package day35_StaticKeyword;

public class Student {

    String name;
    long studentID;
    double gpa;
    static String schoolName = "Cybertek";

    public void setStudentInfo(String name, long studentID, double gpa){

        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;


    }

    public static void printSchoolName(){

        System.out.println("School name is : "+schoolName);
    }

    public String toString(){

        return  "Name : "+name + " Student ID :"+studentID+ " School name : "+schoolName;

    }

}
