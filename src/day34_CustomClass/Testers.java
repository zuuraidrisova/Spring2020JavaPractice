package day34_CustomClass;

public class Testers {

    /*
    create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
create a class called Bank Of America:
			bank of America is planning to create their automation team, there fore they are hiring three testers
			create a list called AutomationTeam and store three Testers in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team
     */

    String fullName ;
    int ID;
    String jobTitle;
    double salary;

    public void setTestersInfo(String fullName, int ID, String jobTitle, double salary){

        this.fullName = fullName;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }
    public String toString(){

        String result = fullName + " "+ ID +" "+ jobTitle +" " + salary;

        return result;
    }

    public double calculateBudget(int numberOfTesters){

        double total = 0;

        if(numberOfTesters > 0){

           total =  numberOfTesters * salary;
        }

        return total;
    }


    public void smokeTest(){

        System.out.println(fullName +" does Smoke testing");
    }

    public void createTicket(String ticket){

        System.out.println(fullName+" creates "+ticket);

    }
}
