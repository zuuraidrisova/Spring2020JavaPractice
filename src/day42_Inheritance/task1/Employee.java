package day42_Inheritance.task1;

public class Employee extends Person {
    /*
    create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString

				Employee is a Person relationship
     */
    public double salary;
    public long ID;
    public String jobTitle;

    public void setEmployeeInfo(String name, int age, char gender, double salary, long ID,String jobTitle){

        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.ID = ID;

    }

    public void work(){

        System.out.println(name +" works as "+jobTitle);
    }
    public String toString(){

        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: "+salary+", ID: "+ID
                +", Age: "+age+", Gender: "+gender;
    }

}
