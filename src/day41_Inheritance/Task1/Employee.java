package day41_Inheritance.Task1;

public class Employee {
    /*
    create a  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
			*/

    public String name;
    public String jobTitle;
    public  char gender ;
    public double salary;
    public long ID;

    public String toString(){

        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: $"
                +salary+", ID: "+ID+", Gender: "+gender;
    }
}
