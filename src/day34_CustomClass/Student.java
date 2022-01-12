package day34_CustomClass;

public class Student {

    String name;
    String nationality;
    int age;
    double GPA;
    char gender;
    boolean marriage;

    public void setStudentInfo(String name, String nationality, int age, double GPA,
                               char gender, boolean marriage){

        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.GPA = GPA;
        this.gender = gender;
        this.marriage = marriage;


    }

    public String toString(){

        return "Name :  "+name+", gender : "+ gender +", nationality : "+ nationality
                +", age : "+age +", GPA : "+GPA+ " married : "+ marriage;
    }

}
