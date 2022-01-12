package reviewPracticing.OOP_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
            /*
            create a class called Person
        attributes:  name, age, gender
        methods: eat, walk, sleep, setPersonInfo
        */

            public String name;
            public int age;
            public  char gender;

          public void eat(String food){

              System.out.println(name+" is eating "+food);
          }

          public void walk(){

              System.out.println(name+" is walking");
          }

          public void sleep(int hours){

              System.out.println(name+" is sleeping "+hours);
          }

           public void setPersonInfo(String name, int age, char gender){

              this.name = name;
              this.age = age;
              this.gender = gender;

           }

}
/*
        create a class called Employee
        attributes: name, age, gender, Salary, employeeID,
        jobTitle
        methods: work, setEmployeeInfo, toString
 */

class Employes extends Person{


    public double salary;
    long empId;
    public String jobTitle;
    public static String company = "Oracle";

    public void work(String companyName){

        System.out.println(name+" is working "+companyName);

    }

    public void setEmpInfo(String name, int age, char gender, double salary, String jobTitle, long empId){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.empId = empId;

    }

    public String toString(){

        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: "+salary+", ID: "+empId
                +", Age: "+age+", Gender: "+gender;
    }
}
            /*

        create a class called Student
        attributes: name, age, gender, studentID, clazz
        methods: attendClass, code, setStudentInfo, toString
        create a class called school:
        */

class Student extends Person{

    long stID;
    public String clazz;


    public void attendClazz(){

        System.out.println(name+" is attending "+clazz);
    }

    public void code(String progLang){

        System.out.println(name+" is coding in "+progLang);
    }

    public void setStInfo(String name, int age, char gender, long stID, String clazz){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.stID = stID;
        this.clazz =clazz;

    }

    public String toString(){

        return "Name: "+name+", ID: "+stID
                +", Age: "+age+", Gender: "+gender;
    }

}

class School{

    //       create a class of School and  3 objects of student and set their info
//        create a an ArrayList of students to store all student
//        objects
//        use for each loop to print out each students' name and
//        studentID
    public static void main(String[] args) {

        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student.setStInfo("Zuura",29,'F',90133,"Batch18");
        student2.setStInfo("Sary", 29,'M',90111,"ComputerScience");
        student3.setStInfo("Aku",31, 'F',90333,"Languages2020");

        ArrayList<Student>students = new ArrayList<>();

        students.addAll(Arrays.asList(student,student2,student3));

        for (Student each : students){

            System.out.println(each.name +" "+each.stID);
        }

        for (Student each: students){

            each.attendClazz();
            each.code("Java");
        }
    }
}

            /*
        create a class called company:
        create 3 objects of employee and set thier info
        create an array of employees and store all those
        employee objects
        use regular for loop to print out each employee' name
        and employeeID
             */
class Company{

      public static void main(String[] args) {


          Employes employes1 = new Employes();
          Employes employes2 = new Employes();
          Employes employes3 = new Employes();


          employes1.setEmpInfo("Zuura", 29, 'F',120000,"SDET",2178);
          employes2.setEmpInfo("Sasha",32,'M',140000,"Developer",2918);
          employes3.setEmpInfo("Muhtar", 30, 'M',150000,"Java Master",1212);

          Employes [] employes = {employes1,employes2,employes3};

          for (int i = 0; i < employes.length; i++){

              System.out.println(employes[i].name +" "+employes[i].empId);
          }

          for (int i = 0; i < employes.length; i++){

              employes[i].eat("fish");
              employes[i].work(Employes.company);
              employes[i].sleep(8);
              employes[i].walk();
          }

      }
 }