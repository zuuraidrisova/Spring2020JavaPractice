package day49_Ploymorphism_Intro;


import java.util.ArrayList;
import java.util.Arrays;

public abstract class Employee {

    public static String companyName;
    public String name;
    public String jobTitle;
    public double salary;
    private long id;

    public abstract void work();

    public long getId(){

        return id;
    }

    public void setId(long id){

        this.id = id;
    }

    public String toString(){

        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: "+salary+", id: "+id+", Company Name: "+companyName;
    }

}

class Tester extends Employee{

    static {

        companyName = "Cybertek";
    }

    public Tester(String name, String jobTitle, double salary, long id){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        setId(id);
    }

    @Override
    public void work(){

        System.out.println(name+" is testing the app");
    }
}


class Developer extends Employee{

    static{

        companyName = " Cybertek";

    }

    public Developer(String name, String jobTitle, double salary, long id){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        setId(id);
    }

    public void work(){

        System.out.println(name+" is developing the app");
    }

}
class ScrumTeam{

    public static void main(String[] args) {

        Employee tester1 = new Tester("Zuura", "SDET",100000, 90123);
        Employee tester2 = new Tester("Madina", "SDET", 120000, 90345);
        Employee tester3 = new Tester("Azat", "QA", 80000, 83645);

        Employee developer1 = new Developer("Asan", "Developer", 140000, 90456);
        Employee developer2 = new Developer("Sary", "Senior Developer", 150000, 90786);
        Employee developer3 = new Developer("Cholpon", "Senior Developer",145000, 90642);

        ArrayList<Employee> scrumTeam = new ArrayList<>();

        scrumTeam.addAll(Arrays.asList(tester1,tester2,tester3,developer1,developer2,developer3));

        for(int i = 0; i < scrumTeam.size(); i++){

            System.out.println(scrumTeam.get(i));
        }

        System.out.println("************************************");

        for(Employee each: scrumTeam){

            each.work();
        }

        System.out.println("************************************");

        scrumTeam.removeIf(employee -> employee.jobTitle.equals("QA") || employee.jobTitle.equals("Developer"));

        for(Employee each :  scrumTeam){

            System.out.println(each);
        }

        System.out.println("************************************");

        scrumTeam.removeIf(employee -> employee.getId() == 90123 );

        for(int i = 0; i < scrumTeam.size() ; i++){

            System.out.println(scrumTeam.get(i));
        }

        System.out.println("************************************");

    }
}