package OfficeHours.Practice_05_06_2020;

public class Tester {

    String name;//object variable
    String jobTitle;//object variable
    double salary;//object variable
    long employeeID;//object variable

    public void setTesterInfo(String name, String jobTitle, double salary, long employeeID){
                        //user given argument

// objectVARIABLE   User give argument
        this.name = name;// user given argument is assigned to object variable
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;

//this : keyword refers to object instances


    }
    public String toString(){

        return "Name : "+name+ ", Job Title : "+ jobTitle
                +", Salary : "+salary+" , EmployeeId : "+employeeID;


    }

    public void smokeTesting(){


        System.out.println(name+" is doing SmokeTest");
    }

    public void createTicket(){

        int name = 100;//if we have local variable with the same name, we should use
        //this keyword to point to instance variable

        System.out.println(this.name +" is creating a ticket on Jira");
    }

}
