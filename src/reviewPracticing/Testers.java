package reviewPracticing;

import java.util.ArrayList;
import java.util.Arrays;

public class Testers {

       /*
    create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
create a class called Bank Of America:
			bank of America is planning to create their automation team,
			 there fore they are hiring three testers
			create a list called AutomationTeam and store three Testers in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team
     */

       String name;
       long empID;
       String jobTitle;
       double salary;

       public void setInfo(String name, long empID, String jobTitle, double salary){

           this.name = name;
           this.empID = empID;
           this.jobTitle = jobTitle;
           this.salary = salary;

       }

       public void smokeTesting(){

           System.out.println(name +" is responsible for smoke testing");

       }

       public void createTicket(){

           System.out.println(name +" is responsible for creating bug ticket");
       }

       public String toString(){

           return "name : " + name +" employeeID : "+ empID +
                   " jobTitle : "+ jobTitle + " salary : "+salary;
       }
}

class Developers{

         /*
    create a class called Developers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(),  creatingTicket();


     */

         String name;
         long empID;
         String jobTitle;
         double salary;

         public void setInfo(String name, long empID, String jobTitle, double salary){

             this.name = name;
             this.empID = empID;
             this.jobTitle = jobTitle;
             this.salary = salary;
         }

         public void code(){

             System.out.println(name+" is coding");
         }

         public void createTicket(){

             System.out.println(name+" is creating a ticket");
         }

         public String toString(){

             return "name : " + name +" employeeID : "+ empID +
                     " jobTitle : "+ jobTitle + " salary : "+salary;
         }

}

class BankOfAmerica{

    public static void main(String[] args) {

        Testers tester1 = new Testers();
        Testers tester2 = new Testers();
        Testers tester3 = new Testers();

        tester1.setInfo("Zuura",91281, "SDET", 120000);
        tester2.setInfo("Sary",91222, "SDET", 130000);
        tester3.setInfo("Chopa",91211, "SDET", 140000);

        ArrayList<Testers> automationTeam = new ArrayList<>();

        automationTeam.addAll(Arrays.asList(tester1,tester2,tester3));

        for (Testers each : automationTeam){

            System.out.println(each);
        }

        automationTeam.removeIf(p -> p.jobTitle.equalsIgnoreCase("Manual Tester"));

        double totalBudget = 0;

        for (int i = 0; i < automationTeam.size(); i++){

            totalBudget += automationTeam.get(i).salary;
        }

        System.out.println("totalBudget = " + totalBudget);
    }
}

class CapitalOne{

      /*
        create a class called Bank Of Huntington:
        bank is planning to create their dev team, there fore
        they are hiring three developers
        create a list called DevTeam and store three developers in it
        write a program that can remove the developer if he/she is junior developer
        write a program that can calculate the total budget of the dev team

         */

    public static void main(String[] args) {

        Developers dev1 = new Developers();
        Developers dev2 = new Developers();
        Developers dev3 = new Developers();

        dev1.setInfo("Zuura", 90123, "Senior Developer", 140000);
        dev2.setInfo("Sary", 92344,"Junior Developer", 100000);
        dev3.setInfo("Adam", 39826, "Developer",130000);

        ArrayList<Developers> devTeam = new ArrayList<>();

        devTeam.addAll(Arrays.asList(dev1,dev2,dev3));

        devTeam.removeIf(p -> p.jobTitle.equalsIgnoreCase("Junior DEveloper"));

        for (Developers dev : devTeam){

            System.out.println(dev);
        }

        double totalBudget = 0;

        for (Developers each : devTeam){

            totalBudget += each.salary;
        }

        System.out.println("totalBudget = " + totalBudget);
    }
}

class Scrum{

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

      ArrayList<Testers> testers = new ArrayList<>();
      ArrayList<Developers> developers = new ArrayList<>();

      public void  hireTester(Testers tester){

          testers.add(tester);
    }

    public void  fireTester(long empId){

          testers.removeIf(p -> p.empID == empId);
    }

    public void  hireDeveloper(Developers developer){

          developers.add(developer);
    }

    public void  fireDeveloper(long empID){

          developers.removeIf(p -> p.empID == empID);

    }

    public void dailyStandUp(){

          for (int i = 0; i< developers.size(); i++){

              System.out.println(developers.get(i)+" is attending daily scrum");
          }

        for (int i = 0; i< testers.size(); i++){

            System.out.println(testers.get(i)+" is attending daily scrum");
        }

    }

}

class KeyBank{

    public static void main(String[] args) {

        Testers tester1 = new Testers();
        Testers tester2 = new Testers();
        Testers tester3 = new Testers();
        Testers tester4 = new Testers();


        tester1.setInfo("Ainura", 123, "SDET", 140000);
        tester2.setInfo("Aika", 231, "Manual Testing", 70000);
        tester3.setInfo("Sary", 321,"QA", 100000);
        tester4.setInfo("Kim", 331,"QA", 90000);

        Scrum scrumTeam1 = new Scrum();

        scrumTeam1.hireTester(tester1);;
        scrumTeam1.hireTester(tester2);;
        scrumTeam1.hireTester(tester3);;
        scrumTeam1.hireTester(tester4);;

        Developers developer1 = new Developers();
        Developers developer2 = new Developers();
        Developers developer3 = new Developers();

        developer1.setInfo("Barzy",20099,"Senior Developer",150000);
        developer2.setInfo("Baktygul",400,"Junior Developer",115000);
        developer3.setInfo("Bay",100,"Junior Developer",90000);


        Scrum scrumTeam2 = new Scrum();

        scrumTeam2.hireDeveloper(developer1);
        scrumTeam2.hireDeveloper(developer2);
        scrumTeam2.hireDeveloper(developer3);

        for (int i = 0; i < scrumTeam1.testers.size(); i++){

            System.out.println(scrumTeam1.testers.get(i));
        }

        System.out.println("====================================================");

        for (int j = 0; j < scrumTeam2.developers.size(); j++){

            System.out.println(scrumTeam2.developers.get(j));
        }

        System.out.println("====================================================");

        for (Testers each: scrumTeam1.testers){

            each.createTicket();
        }

        System.out.println("====================================================");

        for (Testers each: scrumTeam1.testers){

            each.smokeTesting();
        }

        System.out.println("====================================================");

        for (Developers each: scrumTeam2.developers){

            each.code();
        }
        System.out.println("====================================================");

        for (Developers each: scrumTeam2.developers){

            each.createTicket();
        }

        System.out.println("====================================================");

        scrumTeam1.fireTester(123);

        for (int i = 0; i < scrumTeam1.testers.size(); i++){

            System.out.println(scrumTeam1.testers.get(i));
        }

    }
}