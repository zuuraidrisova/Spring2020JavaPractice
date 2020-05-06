package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class HuntingtonBankDevelopers {

    public static void main(String[] args) {

        /*
        create a class called Bank Of Huntington:
        bank is planning to create their dev team, there fore
        they are hiring three developers
        create a list called DevTeam and store three developers in it
        write a program that can remove the developer if he/she is junior developer
        write a program that can calculate the total budget of the dev team

         */
            Developers developer1 = new Developers();

            developer1.setDeveloperInfo("Zuura", 90123, "Senior Developer", 140000);

           System.out.println(developer1);

           Developers developer2 = new Developers();

           developer2.setDeveloperInfo("Sary", 90234, "Developer", 150000);

          System.out.println(developer2);

          Developers developer3 = new Developers();

          developer3.setDeveloperInfo("Adam", 90345, "Junior Developer", 100000);

         System.out.println(developer3);

        System.out.println("==============================================");

         Developers [] developers = {developer1, developer2, developer3};

        System.out.println(Arrays.toString(developers));

        System.out.println("==============================================");

        ArrayList<Developers> listDevelopers = new ArrayList<>();

        listDevelopers.addAll(Arrays.asList(developers));

        for(int i = 0; i < listDevelopers.size(); i++){

            System.out.println(listDevelopers.get(i));
        }

        System.out.println("==============================================");

        Predicate<Developers> junior = d -> d.jobTitle.equalsIgnoreCase("Senior Developer");

        listDevelopers.removeIf(junior);

        System.out.println(listDevelopers);

        System.out.println("==============================================");

        double totalBudget = 0;

        for(Developers each : listDevelopers){

            totalBudget += each.salary;
        }

        System.out.println(totalBudget);

        System.out.println("==============================================");

        developer1.code("Java");

        developer2.code("Python");

        developer3.createTicket();


    }
}
