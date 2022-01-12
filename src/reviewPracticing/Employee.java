package reviewPracticing;

import java.util.ArrayList;
import java.util.Arrays;

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
     String gender;

     public void setInfo(String name, long id, long ssn, String jobTitle, double salary, String gender){

         this.name = name;
         this.id = id;
         this.ssn = ssn;
         this.salary = salary;
         this.gender = gender;
         this.jobTitle = jobTitle;

     }

     public String toString(){

         return "Name: "+name+", id: "+id+", ssn: "+ssn+", salary: "+salary+", jobTitle: "+jobTitle+", gender: "+gender;

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

    static String companyName;
    static String location;

    static Employee emp1 = new Employee();
    static Employee emp2 = new Employee();
    static Employee emp3 = new Employee();
    static Employee emp4 = new Employee();
    static Employee emp5 = new Employee();

    static {

        emp1.setInfo("Zuura", 2331,813269,"SDET", 120000, "female");
        emp2.setInfo("Chopa",1981,1283692, "SDET",130000,"female");
        emp3.setInfo("Adam",1930, 135721,"QA", 100000, "male");
        emp4.setInfo("Kim",2811, 291711,"Developer",140000,"female");
        emp5.setInfo("Ak",2711,2181631,"Developer",120000,"male");
    }


}

class  BankOfAzerbaijan{
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

        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(HumanResources.emp1, HumanResources.emp5, HumanResources.emp3));

        for (Employee each : employees){

            System.out.println(each);
        }

    }
}