package day41_Inheritance.Task1;

public class Tester extends Employee {
    /*
    create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			create a constructor that can initialize all the attributes of Tester
     */
    public void  reporting(){

        System.out.println(name+" is reporting the Bug");
    }
    public void testing(){

        System.out.println(name+" is testing");
    }
    public Tester(String name, String jobTitle, char gender, double salary, long ID){

        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.ID = ID;


    }



}
