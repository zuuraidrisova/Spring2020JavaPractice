package day36_StaticBlocks;

import java.util.ArrayList;

public class TesterObject {
    /*
    create a class called Testers
            Attributes:
    name, employeeID, JobTitle, Salary
    Actions:
    setTesterInfo(), smokeTesting(),  creatingTicket();
    create a class called Bank Of America:
    bank of America is planning to create their automation team, there fore
    they are hiring three testers
    create a list called AutomationTeam and store three Testers in it
    write a program that can remove the tester if he/she is manual tester
    write a program that can calculate the total budget of the Automation team

     */
    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobTitle, double salary){

        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }
    public String toString(){

        return "Name is : "+name+" Employee ID : "+employeeID+" Job Title : "+jobTitle+" Salary : "+salary;
    }

    public void smokeTest(){

        System.out.println(name+" is doing Smoke Testing");
    }

    public void createTicket(){

        System.out.println(name+" is creating a Ticket");
    }
}


class DeveloperObject{

    /*
    create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()
     */

    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setDeveloperInfo(String name, long employeeID, String jobTitle, double salary){

        this.name = name;
        this.employeeID =employeeID;
        this.jobTitle = jobTitle;
        this.salary=salary;

    }

    public String toString(){

        return "Name is : "+name+" Employee ID : "+employeeID+" Job Title : "+jobTitle+" Salary : "+salary;
    }

    public void code(String progLanguage){

        System.out.println(name+" is coding in "+progLanguage);
    }

    public void fix(){

        System.out.println(name + " is fixing a bug");
    }
}


class ScrumTeam{

    /*
    create a class called ScrumTeam
			Attributes:
				name
				List of Testers,
				List of Developers,
			Actions:
				hireTester
				fireTester
				hireDeveloper
				fireDeveloper
				DailyStandUp

     */
    ArrayList<TesterObject> listTesters = new ArrayList<>();
    ArrayList<DeveloperObject> listDevelopers = new ArrayList<>();


    public void hireTester(TesterObject tester){

        listTesters.add(tester);

    }
    public void fireTester(long employeeID){

        listTesters.removeIf(p -> p.employeeID == employeeID);

    }

    public void hireDeveloper(DeveloperObject developer){


        listDevelopers.add(developer);

    }
    public void fireDeveloper(long employeeID){

        listDevelopers.removeIf(p -> p.employeeID == employeeID);

    }

    public void DailyStandUp(){

        for(int i = 0; i < listDevelopers.size(); i++){

            System.out.println(listDevelopers.get(i).name);
        }
        for(TesterObject each : listTesters ){

            System.out.println(each.name);
        }

    }

}


class BOA{
    /*
    Bank of America in VA is planning to create a scrum teams:
						4 developers 2 testers
				 create a arraylist of scrum team and:
						 1. use the for loop to print out every single
						 employees from BOA' scrum teams
						 2. calculate the total budgets of the scrumteam
     */


    public static void main(String[] args) {

        TesterObject tester1 = new TesterObject();
        TesterObject tester2 = new TesterObject();
        TesterObject tester3 = new TesterObject();
        TesterObject tester4 = new TesterObject();

        tester1.setTesterInfo("Ainura", 123, "SDET", 140000);
        tester2.setTesterInfo("Aika", 231, "Manual Testing", 70000);
        tester3.setTesterInfo("Sary", 321,"QA", 100000);
        tester4.setTesterInfo("Kim", 331,"QA", 90000);


        DeveloperObject dev1 = new DeveloperObject();
        dev1.setDeveloperInfo("Barzy",200,"Senior Developer",150000);

        DeveloperObject dev2 = new DeveloperObject();
        dev2.setDeveloperInfo("Bay",100,"Junior Developer",90000);

        DeveloperObject dev3 = new DeveloperObject();
        dev3.setDeveloperInfo("Batma",300,"Senior Developer",130000);

        DeveloperObject dev4 = new DeveloperObject();
        dev4.setDeveloperInfo("Baktygul",400,"Junior Developer",115000);


        ScrumTeam scrum1 = new ScrumTeam();

        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);
        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);

        ScrumTeam scrum2 = new ScrumTeam();

        scrum2.hireDeveloper(dev3);
        scrum2.hireDeveloper(dev4);
        scrum2.hireTester(tester3);
        scrum2.hireTester(tester4);

        ScrumTeam scrum3 = new ScrumTeam();

        scrum3.hireTester(tester1);
        scrum3.hireTester(tester2);
        scrum3.hireTester(tester3);
        scrum3.hireTester(tester4);
        scrum3.hireDeveloper(dev1);
        scrum3.hireDeveloper(dev2);
        scrum3.hireDeveloper(dev3);
        scrum3.hireDeveloper(dev4);

        ScrumTeam [] teams = {scrum1,scrum2,scrum3};

         /*
         1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
         */

        for(int i = 0; i < teams.length; i++){

            if(teams[i].listDevelopers.get(i).salary > 120000 ){

                System.out.println("Developer's name is : +" + teams[i].listDevelopers.get(i).name);
            }

            if(teams[i].listTesters.get(i).salary < 120000){

                System.out.println("Tester's name is : "+teams[i].listTesters.get(i).name);
            }
        }









    }

}