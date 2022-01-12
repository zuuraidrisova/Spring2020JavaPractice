package day33_CustomClass;

public class Day33_notes {
    /*
    05/03/2020
Topics: Custom class Intro
package name: day33_CustomClass
1. write a program that can return the unique objects from a anArray List
of Integers
Ex:
list: {1,1,2,3,4,5,5}
sout(list); ==> {2,3,4};
Note: 1. DO NOT use any extra arrayList
2. DO NOT use any loops
3. do not use any sort method
4. use predicate only and collections methods only
Hint:   Collections.frequency() // will return the frequency
removeIf( frequency == 1)  can keep the unique objects in
arrayList
5. write a program that can return the duplicated objects from a an
ArrayList of Integers
Ex:
list: {1,1,2,3,4,5,5}
sout(list); ==> {1,1,5,5};
Note: 1. DO NOT use any extra arrayList
6. DO NOT use any loops
7. DO NOT use any sort method
8. Use predicate and collections methods only
9. write a program that can extract the sepecial characters, digits and
letters from a string and stores them into seperate ArrayLists of
Character:
ex:
str = "ABCD123$%#@&456EFG!";
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
DO NOT USE LAMBDA
10. write a program that can extract the sepecial characters, digits and
alphebets from a string and stores them into seperate ArrayLists of
Character:
DO NOT USE LOOPS
Custom lass:
String class:
data/attribute:
text, index
actions/function:
toLower(),toUpper()..
car class:
data/Attribute:
brand, model, year, color, mileage...
actions/functions:
driver(), stop() ....
objects: came from class, we can create multiple objects from a class
ArrayList<>  list     =  new ArrayList<>();
Class     refName               OBJECT
Car car1 = new Car();
Ex:
car1 ==> BMW
car2 ==> Toyota
car3 ==> Audi
class: where the objects came from , determines how the object should
behave
instance variables: object variables
each object has its own copy of instance variable
decleared outside the blocks or methods
instance methods: object methods
does not have static specifier
local variable: variables that are declared within a block
toString(): the method gets executed automatically whenever we pass the
object name into the print statement
cat class:
data/attributes:  instance variables
breed, color, age
actions: instance methods
sleep(), eat(), drink()
practice task:
create a custom class for bank account
attrubutes: accountholder, accountnumber, balance
actions: cehckingBalance(), withDraw( amount ), deposit( amount )
Assignment:
create a custom class for BankAccount
attributes/data that can have are:
1. AccountHolder, 2. AccountNumber, 3. Balance
Actions: showBalance, deposit, withdraw
requiremnts:
1. user should be able to deposit money into their account
2. user should be able to withdraw money from their account
2.1. if the withdrawing account is greater than available
balance, 35$ penalty charge will be added
2.2. if the balance is less than or equal to 0, user should not
be able to withdraw money
3. user should be able to see their balance
     */
}
