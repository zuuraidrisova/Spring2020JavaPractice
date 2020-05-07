package OfficeHours.ClassObjectPractice;

public class Developer {

    String name;
    String jobTitle;
    long employeeID;
    double salary;

    public  void setDeveloperInfo(String name, String jobTitle, long employeeID, double salary){

        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary =salary;


    }

    public String toString(){

        return  "Name : "+name +" Job Title: "+jobTitle+" Employee ID : "+employeeID
                +" Salary : "+salary;
    }


    public void code(String programLanguage){

        System.out.println(name + " is coding in "+programLanguage);
    }
    public void fix(){

        System.out.println(name+" is fixing bug");
    }
}
