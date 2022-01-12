package day46_Final_Abstract;

public abstract class Employee {

    /*
    1. create an abstract class called Employee
				attributes: name, age, gender, salary, jobtitle
				methods:
						abstract methods: work()
						instance method: toString()
     */

    public String name;
    public int age;
    public char gender;
    public double salary;
    public String jobTitle;

    public abstract void work();

    public String toString(){

        return name+" "+jobTitle+" "+gender+" "+age+" "+salary;
    }

}

/*
2. create two sub classes of the Employee:
									1. Tester
									2. Developer
					each class MUST have constructors to initialize the attributes
 */

class Tester extends Employee{

    public Tester(String name, String jobTitle, int age, char gender, double salary){

        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;

    }
    @Override
    public void work(){

        System.out.println(name+" works for 8 hours a day");
    }
}

class Developer extends Employee{

    public Developer(String name, String jobTitle, int age, char gender, double salary){

        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;

    }
    @Override
    public void work(){

        System.out.println(name+" works for 5 hours a day");
    }
}