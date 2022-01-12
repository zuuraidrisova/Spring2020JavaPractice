package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class bankOfAmericaTesters {
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

    public static void main(String[] args) {

        ArrayList<Testers> AutomationTeam = new ArrayList<>();

        Testers tester1 = new Testers();

        tester1.setTestersInfo("Zuura Idrisova",90123, "SDET",100000);

        Testers tester2 = new Testers();

        tester2.setTestersInfo("Kim Hua", 90234, "QA", 67000);

        Testers tester3 = new Testers();

        tester3.setTestersInfo("John Hanks", 90678, "Manual tester",55000);

        AutomationTeam.addAll(Arrays.asList(tester1,tester2,tester3));

        System.out.println(AutomationTeam);

        Predicate<Testers> manual = p -> p.jobTitle.equals("Manual tester");

        AutomationTeam.removeIf(manual);

        System.out.println(AutomationTeam);

        System.out.println("+===========================");

        double total = 0;

        for(int i = 0; i < AutomationTeam.size(); i++){

            total = AutomationTeam.get(i).calculateBudget(2);
        }

        System.out.println(total);

    }
}
