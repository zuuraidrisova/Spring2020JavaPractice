package OfficeHours.Practice_05_06_2020;

public class Developers {

    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setDeveloperInfo(String name, String jobTitle, double salary, long employeeID){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;

    }
    public String toString(){

        return "Name : "+name+ ", Job Title : "+ jobTitle
                +", Salary : "+salary+" , EmployeeId : "+employeeID;

    }

    public void code(String programLanguage){

        System.out.println(name +" is coding in "+programLanguage);
    }

    public void fix(){

        System.out.println(name + " is fixing a bug");
    }

}
