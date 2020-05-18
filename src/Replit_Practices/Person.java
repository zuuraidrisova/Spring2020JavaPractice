package Replit_Practices;

public class Person {
    /*
    Create the a Person class with the following:

instance Variables
String firstname
String lastname
int birthmonth
int birthday
int birthyear
String ssn
All variables above should be private.
     */

    private String firstname;
    private String lastname;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String SSN;

    /*
    Constructor
The main constructor should take in all values and assign them to their
respective private class variables
     */
    public Person(String firstname, String lastname, int birthMonth, int birthDay,
                  int birthYear, String SSN){

        this.firstname  = firstname;
        this.lastname = lastname;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.SSN = SSN;
    }
    /*
    Methods
Create a public getters and setters for firstname and lastname:
getFirstname
getLastname
setFirstname
setLastname
     */
    public String getFirstname(){

        return firstname;
    }
    public String getLastname(){

        return lastname;
    }
    public void setFirstname(String firstname){

        this.firstname =firstname;
    }
    public void setLastname(String lastname){

        this.lastname = lastname;
    }
    /*
    Create a public getter method called getBirthday, which will return a
 String composed of their birthday in month/day/year format.  For example,
  if birthmonth=3, birthday=22, birthyear=2000, it should return the String
   "3/22/2000"
     */
    public String getBirthday(){

        return birthMonth+"/"+birthDay+"/"+birthYear;
    }
    /*
    Create a public method called verifySSN that takes in a String parameter
 and returns a boolean.  It will check the parameter against the person's SSN
 and return true or false based on whether they match.
     */

    public boolean verifySSN(String SSN){

        if(this.SSN == SSN){

            return true;

        }else{

            return false;
        }
    }

}