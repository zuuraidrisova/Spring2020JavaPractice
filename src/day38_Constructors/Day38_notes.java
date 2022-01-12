package day38_Constructors;

public class Day38_notes {
    /*
    05/12/2020
Topics: Constructor overloading
Constructor calls ( this() )
static block vs instance block vs constructor
Package name: day38_Constructors
warmup tasks:
Task01:
create a class called Item
instance variables:
name, unitPrice, quantity
add a constructor that can initialize the fields
instance methods:
calcCost(): returns the total cost as double
hint: quantity * unitPrice
toString(): returns the name, unit price, quantity and
total cost info as calculated by calcCost()
create a class called ShoppingList
create 5 objects of Item and store them into List of Items
calculate the total cost of all Items in the list
Task02:
Create class called SalaryCalculator
instance variables:
hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
add a constructor can initialize those fields
instance methods:
salary(): returns the total salary as double
(hourlyRate * weeklyHours * 48)
salaryAftertax(): retuns the salary after tax as
double ( salary - stateTax - federalTax)
stateTax(): retuns the total state tax as double (
salary * stateTaxRate)
federalTax(): retuns the total federal tax as double (
salary * fedralTaxRate)
toString(): returns the hourlyRate, weeklyHours and
salary info as calculated by salary()
constructor:
Access-Modifier  MethodName(Parameter){
}
MethodName MUST be same with className
No return-type, No specifier
we can have multiple constrcutor by overloading
creating object:
ClassName  objectName = new ExistingConstructor
overloading: same method name, different parameters
reusable, easy to maintain, readable
// sum
public void sum(int a, int b ){
}
public void sum(int a, int b, int c ){
}
this: refers to object instances
this.: we can instances of the object
this(): used for calling constructors within current class
constructor calls:
1. only constructor can call other constructor
2. constructor cannot be called by its name,  this() is used
for calling
3. constructor call needs to be at the first step
4. One constructor can only call one constructor
5. Contructor cannot call itself or conatin itself
static block vs instance block vs constructor:
static block: executed first, one time only, does not depend
on the object
instance block: depends on the object, runs before the
constructor
constructor: depends on the object, runs after the instance
block
tomorrow: office
2pm ~ 5pm: static & instance & constructor
OOP: Object Oriented Programming
Thursday:
Access modifiers: public, dfeault, private
Encapsulation Intro
Friday: Encapsulation
friday' quiz: object, constructor, constructor class, statics
     */
}
