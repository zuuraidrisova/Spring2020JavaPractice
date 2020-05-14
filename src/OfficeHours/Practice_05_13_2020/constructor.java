package OfficeHours.Practice_05_13_2020;

public class constructor {
    /*

    CONSTRUCTOR: every single class must have
                 execution depends on object

            constructor is special method:
                    to create an object of a class
                    to initialize instance variables

      if we do not create constructor on our own, compiler will give us default
       constructor with no argument

       public constructor(int a ){


               }

       parameter is optional
       access modifier is optional

       regular methods:
                                  MUST      MUST
       accessModifier specifier returnType methodName(parameter){}




     */

    public constructor(){

        System.out.println("default constructor");

    }

    public static void main(String[] args) {

       constructor obj =  new constructor();// ==> default constructor
                        // new is keyword to allocate memory,




    }

}

class Employee{
    /*

Write a program by creating an 'Employee' class having the following methods
 and print the final salary.

     */

    String name;
    long id;
    int weeklyHours;
    double hourlyRate;

    /*
    1 - 'getInfo()' which takes the salary, number of hours of work per day of
 employee as parameter
     */
    public Employee(String name, long id,int weeklyHours, double hourlyRate ){

       this.name = name;
       this.id = id;
       this.weeklyHours = weeklyHours;
       this.hourlyRate = hourlyRate;

    }

    public double employeeSalary(){

        return hourlyRate * weeklyHours;

    }
    /*

2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
     */

    public double addSal(){

        if(employeeSalary() < 500 ){

            return employeeSalary() + 10;

        }else{

            return employeeSalary();
        }
    }
    /*

3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of
 work per day is more than 6 hours.
     */

    public double addWork(){

        if(weeklyHours > 6){

            return employeeSalary() + 5;

        }else{

            return employeeSalary();
        }
    }

    public String toString(){

        return "Name: "+name+" Employee id: "+id+" salary: "+employeeSalary();
    }

}

class EmployeeObject{

    public static void main(String[] args) {

        Employee emp1 = new Employee("Asan", 90123, 40,10.10);

        System.out.println(emp1.name +" "+emp1.id);
        System.out.println(emp1.addSal());
        System.out.println(emp1.addWork());


    }
}