package OfficeHours.ClassObjectPractice;

import java.util.ArrayList;

public class Employee {
    /*
     1. Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string
     */
    String name;
    long SSN;
    String jobTitle;
    double salary;
    char gender;

    public void setEmployeeInfo(String name, long SSN, double salary, String jobTitle, char gender){

        this.name = name;
        this.SSN = SSN;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;


    }

    public String toString(){

        return "Name: "+name
                +" SSN: "+SSN
                +" JobTitle: "+jobTitle
                +" Salary: "+salary
                +" Gender: "+gender;

    }

}
class HumanResources{

    /*
    2. create a class called HumanResources
			declare 5 objects of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
     */
    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();

    static{

       employee1.setEmployeeInfo("Zaya",123, 1000,"SDET",'F');
       employee2.setEmployeeInfo("Kanat",234,2000,"QA",'M');
       employee3.setEmployeeInfo("Davlet", 345,3000,"SDET",'M');
       employee4.setEmployeeInfo("Kim",456, 4000,"Manual Testing",'F');
       employee5.setEmployeeInfo("Madina",678,5000, "SDET",'F');
    }

}

class BankOfBishkek {

       /*

	3. create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
     */

    public static void main(String[] args) {


        ArrayList<Employee> listEmployees = new ArrayList<>();

        listEmployees.add(HumanResources.employee1);
        listEmployees.add(HumanResources.employee3);
        listEmployees.add(HumanResources.employee2);
        listEmployees.add(HumanResources.employee4);
        listEmployees.add(HumanResources.employee5);

        for(Employee each : listEmployees){

            System.out.println(each);
        }

        System.out.println("==============================================");


        listEmployees.removeIf(each -> !each.jobTitle.equals("SDET"));

        for(int i = 0; i < listEmployees.size(); i++){

            System.out.println(listEmployees.get(i));
        }

    }
}