package day41_Inheritance.Task1;

public class BusinessAnalyst extends Employee {

    /*
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		create a constructor that can initialize all the attributes of businessAnalyst
     */

    public BusinessAnalyst(String name, String jobTitle, char gender, double salary, long ID){

        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.ID = ID;

    }

    public void writeSRS(){

        System.out.println(name+" is writing Requirement Document");
    }

    public void gatherInfo(){

        System.out.println(name+" is gathering Information");
    }
}
