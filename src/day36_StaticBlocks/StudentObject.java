package day36_StaticBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {


        ArrayList<Student> list = new ArrayList<>();

        list.addAll(Arrays.asList(StudentCenter.student1, StudentCenter.student2,StudentCenter.student3,
                StudentCenter.student4, StudentCenter.student5, StudentCenter.student6));


        for(int i = 0; i <  list.size(); i++){

            System.out.println(list.get(i));
        }

        System.out.println("=======================================");

        for(Student each :  list){

            System.out.println(each.name +" is "+ each.isMarried);
        }

        System.out.println("======================================");

        list.removeIf(p -> p.gpa < 3);

        for(Student  each :  list){

            System.out.println(each.name+" has a gpa of :  "+each.gpa);
        }

    }


}
class Student{

    String name;
    String nationality;
    int age;
    double gpa;
    boolean isMarried;

    public void setStudentInfo(String name, String nationality, int age, double gpa, boolean isMarried){

        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gpa = gpa;
        this.isMarried = isMarried;

    }

    public String toString(){

        return "Name : "+name+" Nationality : "+nationality+" Age : "+age
                +" GPA : "+gpa +" Married : "+isMarried;

    }

    public void study(String subject){

        System.out.println(name+" is studying "+subject);
    }
}

class StudentCenter{


    static Student student1 = new Student();
    static Student student2 = new Student();
    static Student student3 = new Student();
    static Student student4 = new Student();
    static Student student5 = new Student();
    static Student student6 = new Student();


    static{

        student1.setStudentInfo("Raya","Russian",32, 3.4, true);
        student2.setStudentInfo("Seima", "Turkish", 24,3.5,false);
        student3.setStudentInfo("Kairat", "Kyrgyz", 27, 3.3, true);
        student4.setStudentInfo("John", "American", 35, 2.2, true);
        student5.setStudentInfo("Kim", "Korean", 22, 4.0, true);
        student6.setStudentInfo("Rahul", "Indian", 45, 2.0, false);

    }

}

