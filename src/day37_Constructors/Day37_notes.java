package day37_Constructors;

public class Day37_notes {
    /*
    05/11/2020
Topics: static imports vs regular imports
instance initializer block
constructor Intro
Package name: day37_Constructors
warmup task:
1. Create a class called Employee
instance variables:
name, id, ssn, jobTitle, salary, gender
actions:
setEmployeeInfo(): can initialize all the instance
variables
toString(): can return the info of the employee as
string
2. create a class called HumanResources
declare 5 variables of Employee as static
use static block to:
1. initialize those static variables
2. set all the info of the Employees
3. create class called BankOfAzerbaijan
in the main method:
1. create a List of Employees
2. add random two employees from HumanResources to the
List
3. use for each loop to print out the employee info
regular imports:
syntax:
import PackageName.ClassName;  // imports one class from package
import PackageName.*;  // imports all classes from the package
static imports: we can import static variables or methods
syntax:
import static PackageName.className.name;  // only imports one
static from the class
import static PackageName.className.*; // imports all static
variables and methods from the class
two initializer blcoks in java:
static initialzier block: gets executed as soon as class is
loaded, only once
static {
statemnt;
}
designed for initializing static variables
instance initializer block: belongs to the object, execution
depends on the object
{
statements;
}
designed for initializing instance variables
regular methods:
MUST          MUST
Access-modifers   specifier   return-type  methodName(Parameter){
statements;
}
Access modifiers: public, protected, default, private
specifiers: static, abstract, final, synchronized
return-type: void, any primitve and none primitives
methodName: any name
parameter: any datatype
Constructor: very special method
Every class MUST have, if we don't create one,, compiler will
creates the no-arg constructor
execution always depends on the object
Access-modifier  MethodName(Parameters){
statements
}
methodName: MUST be same with class name
No specifier, No return-Type
class Test{
}
creating object:
Test   obj = new  Test();
className  objectName =  new  ExistingConstructor
canvas -> java- > modules -> day37 -> static & instance short quiz
due by: 11 : 30 am
PLEASE USE CHROME OR FIRE FOX BROWSER
This week: constructor
Encapsulation
Access modifiers: public, default, private
     */
}
