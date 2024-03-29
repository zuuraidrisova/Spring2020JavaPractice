package day39_AccessModifiers;

public class Employee {

    /*
     create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
     */

    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;
    static String companyName = "BOA";

    public Employee(String name){

        this.name = name;

    }
    public Employee(String name, String jobTitle){

        this(name);
        this.jobTitle = jobTitle;

    }
    public Employee(String name, String jobTitle, long id){

        this(name, jobTitle);
        this.id = id;


    }
    public Employee(String name, String jobTitle, long id, double salary){

        this(name, jobTitle, id);
        this.salary = salary;

    }
    public Employee(String name, String jobTitle, long id, double salary, char gender){

        this(name, jobTitle, id, salary);
        this.gender = gender;

    }

    public String toString(){

        return "Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle
                +", Company name: "+companyName+", ID: "+id+", Salary: "+salary;

    }
}

class EmployeeObject{

    public static void main(String[] args) {

        Employee emp1 = new Employee("Zuura");
        Employee emp2 = new Employee("Zuura","SDET");
        Employee emp3 = new Employee("Zuura","SDET",90123);
        Employee emp4 = new Employee("Zuura","SDET",90123, 110000);
        Employee emp5 = new Employee("Zuura", "SDER", 90123, 110000, 'F');

        Employee [] info = {emp1,emp2,emp3,emp4,emp5};

        for(int i = 0; i < info.length; i++){

            System.out.println(info[i]);
        }

        for(Employee each : info){

            System.out.println(each.id);
        }

    }
}