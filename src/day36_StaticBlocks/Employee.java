package day36_StaticBlocks;

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
    long ID;
    long SSN;
    String jobTitle;
    double salary;
    char gender;



    public void setEmployeeInfo(String name, long ID, long SSN, String jobTitle, double salary, char gender){

       this.name = name;
       this.ID =ID;
       this.SSN = SSN;
       this.jobTitle = jobTitle;
       this.salary = salary;
       this.gender = gender;



    }

    public String toString(){

       return " Name : "+name+", ID : "+ID+", SSN : "+SSN+", jobTitle : "+jobTitle+", salary : "+salary+", gender : "+gender;
    }


}
class HumanResources1{

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
    static Employee employee5 = new Employee();


    static {

        employee1.setEmployeeInfo("Kim", 12309, 1234290,"SDET", 120000, 'F');
        employee2.setEmployeeInfo("Hasan",90827, 83276192, "QA", 100000,'M');
        employee3.setEmployeeInfo("Aliya", 21633, 90832671, "Developer", 150000, 'F');
        employee4.setEmployeeInfo("Mary", 56748, 12764211, "SM", 100000,'F');
        employee5.setEmployeeInfo("John", 89735, 72154721, "PO", 200000, 'M');
    }




}

class BankOfAzerbaijan{
    /*
    . create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it
				 with previous output
     */

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(HumanResources1.employee1);
        list.add(HumanResources1.employee3);

        for(Employee each : list){

            System.out.println(each);
        }

    }

}

