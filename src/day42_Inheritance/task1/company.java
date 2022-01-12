package day42_Inheritance.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class company {
/*
create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID

					Company has an Employee relationship
 */

       public static Employee emp4;//we can call it now using class name
       public static Employee emp5;

       static{//static block runs first

          emp4 = new Employee();
          emp4.setEmployeeInfo("Messi", 32, 'M', 140_000, 13654,"FullTime");

          emp5 = new Employee();
          emp5.setEmployeeInfo("Aigerim", 18, 'F', 130_000, 65654,"FullTime");

       }


    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.setEmployeeInfo("Zuura", 29, 'F',120000,90123,"SDET");
        emp2.setEmployeeInfo("Sasha",32,'M',140000,90625,"Developer");
        emp3.setEmployeeInfo("Muhtar", 30, 'M',150000,90476,"Java Master");

        ArrayList<Employee> team = new ArrayList<Employee>();

        team.addAll(Arrays.asList(emp1,emp2,emp3, emp4, emp5));

        for(int i =0; i < team.size(); i++){

            System.out.println("Employee Name: "+team.get(i).name+", Employee ID: "+team.get(i).ID);
        }

    }

}

