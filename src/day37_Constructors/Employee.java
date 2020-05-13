package day37_Constructors;

import java.util.ArrayList;

public class Employee {
    /*
     Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string
     */
    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setEmployeeInfo(String name, long id, long ssn, String jobTitle, double salary, char gender)
    {
    this.name = name;
    this.id = id;
    this.ssn = ssn;
    this.jobTitle = jobTitle;
    this.salary = salary;
    this.gender = gender;


    }


    public String toString(){

        return "Name "+name+" ID number is: "
                +id+" Social Number is: "+ssn
                +" Job Title is: "+ jobTitle
                +" Salary: "+salary
                +" Gender: "+gender;
    }


}

class HumanResources{
/*
create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees

 */

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee() ;


    static {

        employee1.setEmployeeInfo("Zuleyha",1254,45874641,"QA",110000,'F');
        employee2.setEmployeeInfo("Jack",1239,111223333, "Tester",100000,'M');
        employee3.setEmployeeInfo("Nedime",1299,4580011,"Tester",120000,'F');
        employee4.setEmployeeInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');
        employee5.setEmployeeInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');

    }


}
class BankOfBishkek{


    public static void main(String[] args) {
/*
create class called BOB
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
 */
        ArrayList<Employee> listEmployees = new ArrayList<>();

        listEmployees.add(HumanResources.employee1);
        listEmployees.add(HumanResources.employee3);
        listEmployees.add(HumanResources.employee5);


        System.out.println(listEmployees.get(0));
        System.out.println(listEmployees.get(1));




    }
}