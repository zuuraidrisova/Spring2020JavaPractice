package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class capitalOneTesters {

    public static void main(String[] args) {
        /*
        create a class called Bank Of America:

			bank of America is planning to create their automation team, there fore
			they are hiring three testers
			create a list called AutomationTeam and store three Testers in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team
         */

        Testers2 tester1 = new Testers2();

        tester1.setTesterInfo("Kim", 90123, "SDET", 100000);

        System.out.println(tester1);

        Testers2 tester2 = new Testers2();

        tester2.setTesterInfo("Zoye", 90234, "QA",89000);

        System.out.println(tester2);

        Testers2 tester3 = new Testers2();

        tester3.setTesterInfo("Madina", 90345, "Senior SDET", 150000);

        Testers2 tester4 = new Testers2();

        tester4.setTesterInfo("Muhtar",90456, "Manual Tester", 70000);

        Testers2 tester5 = new Testers2();

        tester5.setTesterInfo("John", 90567, "Uber Driver", 45000);

        System.out.println("==============================");

        Testers2 [] testers = {tester1,tester2,tester3,tester4};

        System.out.println(Arrays.toString(testers));

        ArrayList<Testers2> listTesters = new ArrayList<>();

        listTesters.addAll(Arrays.asList(testers));

        System.out.println("==================================");

        Predicate<Testers2> manual = t -> ! t.jobTitle.contains("SDET");

        listTesters.removeIf(manual);

        System.out.println(listTesters);

        System.out.println("==================================");

        double totalBudget = 0;

        for(Testers2 each:  listTesters){

            System.out.println(each.name);

            totalBudget += each.salary;

        }
        System.out.println("==================================");

        System.out.println(totalBudget);










    }
}
