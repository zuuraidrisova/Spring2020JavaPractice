package OfficeHours.ClassObjectPractice;

public class Tester {

    String name;
    String jobTitle;
    long employeeID;
    double salary;

    public void setTesterInfo(String name, String jobTitle, long employeeID, double salary){

        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;

    }

    public String toString(){

        return  "Name : "+name +" Job Title: "+jobTitle+" Employee ID : "+employeeID
                +" Salary : "+salary;

    }
    public void smokeTest(){

        System.out.println(name+" is doing smokeTest");
    }

    public void createTicket(){

        System.out.println(name+" is creating a bug ticket in Jira");
    }
}
