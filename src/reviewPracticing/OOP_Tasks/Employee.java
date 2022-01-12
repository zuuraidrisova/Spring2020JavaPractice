package reviewPracticing.OOP_Tasks;


import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
    /*
    create a  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
			*/

    public String name;
    public String jobTitle;
    public char gender;
    public long id;
    public double salary;


    public String toString(){

        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: $"
                +salary+", ID: "+id+", Gender: "+gender;
    }
}
class Tester extends Employee {

    /*
    create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			create a constructor that can initialize all the attributes of Tester
     */

    public Tester(String name, String jobTitle, long id, double salary, char gender){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.gender = gender;
    }

    public void reportBug(){

        System.out.println(name+" reports Bug on Jira");
    }

    public void test(){

        System.out.println(name+" tests the application");
    }

}

/*
    	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     create a constructor that can initialize all the attributes of developer
     */
class Developer extends Employee{


    public Developer(String name, String jobTitle, long id, double salary, char gender){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.gender = gender;
    }

    public void fixBug(){

        System.out.println(name+" is fixing bug");
    }

    public void code(String programmingLanguage){

        System.out.println(name+" is coding in "+programmingLanguage);
    }

}
/*
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		create a constructor that can initialize all the attributes of businessAnalyst
     */

class BusinessAnalyst extends Employee{


    public BusinessAnalyst(String name, String jobTitle, long id, double salary, char gender){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.gender = gender;
    }

    public void writeBR(){

        System.out.println(name+" is writing Business Requirement Documents");
    }

    public void gatherInfo(){

        System.out.println(name+" is gathering requirement info");
    }

}

class EmployeeObjects{

    public static void main(String[] args) {


        Developer developer1 = new Developer("Zuura","Developer",2167,120000,'F');
        Developer developer2 = new Developer("Kim","Senior Developer",2111,130000,'F');
        Developer developer3 = new Developer("Karla","Junior Developer",2222,100000,'F');

        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(developer1,developer2,developer3));

        for (Developer each : developers){

            System.out.println(each);
        }

        System.out.println("=======================================================");

        for (Developer each : developers){

            each.code("Java");
        }

        System.out.println("=======================================================");

        for (Developer each : developers){

            each.fixBug();
        }


        System.out.println("=======================================================");


        Tester tester1 = new Tester("Esma","SDET",1234,120000,'F');
        Tester tester2 = new Tester("Eric","SDET",2993,110000, 'M');
        Tester tester3 = new Tester("Erin","SDET",2345,100000, 'M');

        ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(tester1,tester2, tester3));

        for (int i = 0; i < testers.size(); i++){

            System.out.println(testers.get(i));
        }

        System.out.println("=======================================================");

        for (int i = 0; i < testers.size(); i++){

            testers.get(i).reportBug();
        }

        System.out.println("=======================================================");

        for (int i = 0; i < testers.size(); i++){

            testers.get(i).test();
        }

        System.out.println("=======================================================");

        BusinessAnalyst ba = new BusinessAnalyst("Venera","BA",7261,130000, 'F');

        System.out.println(ba);

        System.out.println("=======================================================");


        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(developer1,developer2,developer3,tester1,tester2,tester3,ba));

        for (Employee emp : employees){

            System.out.println(emp);
        }

        System.out.println("=======================================================");

        employees.removeIf(p -> p.jobTitle.contains("Junior"));

        for (Employee emp : employees){

            System.out.println(emp);
        }

        System.out.println("=======================================================");

        employees.removeIf(p -> p.salary <= 100000);

        for (Employee emp : employees){

            System.out.println(emp);
        }

        System.out.println("=======================================================");

    }
}