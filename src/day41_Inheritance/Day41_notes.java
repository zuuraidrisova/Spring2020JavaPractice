package day41_Inheritance;

public class Day41_notes {
    /*

Page
1
of 3
05/18/2020
Topics:
  OOP: Inheritance Intro
  IS A vs Has A
Package Name: day41_Inheritance
WarmUp tasks:
create costum class called BankAccount for Bank of America' bank
accounts:
public variables:  bankName, firstName,
lastName
 private variables: accountHolder,
accountNumber, balance
 encapsulate all the private data
 (DO NOT USE SHORTCUT)
 create a constructor that can initialize
firstName and fullName
 (DO NOT USE SHORTCUT)
 action:
 depositing
 withdrawing
 availablebalance
 toString: returns the full
name and balance
Inheritance: easiest way to get rich
 build relationship between classes
 super (parent) & sub (child) relationships
 sub class: can inherit variables and methods
from super class
 super class: cannot inherit anything
 advantage: improves re-usability
 easy to maintain
what can be inherited: visible variables and methods
Constructor cannot be inherited
IS A raltion: inherited relationships between classes
class Animal{
}
class Dog extends Animal{
}
Dog IS An Animal
class Fish extends Animal{
}
Fish IS An animal
Has A relation:
class Engine{
}
class Car{
Engine obj = new Engine();
}
Car Has An Engine
Task01:
creata  class called Employee:
variables: salary, name, id, jobTitle, gender
Actions: toString
create sub class of employee name it Tester:
variables: salary, name, id, jobTitle, gender
actions: reportingBug, testing
creata a constructor that can initialize all
the attributes of Tester
create subclass of employee name it developer:
     variables: salary, name, id, jobTitle, gender
     action: fixingBug, coding
     creata a constructor that can initialize all the
attributes of developer
create subclass of employee name it businessAnalyst
variables: salary, name, id, jobTitle, gender
actions: writingRequiremnts, gathering
creata a constructor that can initialize all the
attributes of businessAnalyst
Task02:
create a class called BankAccount
variables:  accountNumber, accountHolder,
Balance
methods: deposit, showBalance, toString
create sub class of BankAccount and name it SavingAccount
variables: accountNumber, accountHolder,
balance, interestRate
methods: deposit, showBalance
create sub class of BankAccount and name it checkingAccount
variables: accountNumber, accountHolder,
balance
methods: deposit, withDraw, showBalance
inheritance vs import statement
tomoorow: access modifiers: protected
  super keyword
     */
}
