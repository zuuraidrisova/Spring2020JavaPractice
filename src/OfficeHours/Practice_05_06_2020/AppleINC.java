package OfficeHours.Practice_05_06_2020;

public class AppleINC {

    public static void main(String[] args) {

        Tester tester1 = new Tester();

        tester1.setTesterInfo("Madina", "SDET", 120000, 90123);

        Tester tester2 = new Tester();

        tester2.setTesterInfo("Zuura", "SDET", 125000, 90234);

        Tester tester3 = new Tester();

        tester3.setTesterInfo("Muhtar", "SDET", 100000,90345);


        ScrumTeam scrumTeam = new ScrumTeam();

        scrumTeam.hireTester(tester1);
        scrumTeam.hireTester(tester2);
        scrumTeam.hireTester(tester3);

       //  scrumTeam.testerTeam; // returns testers team

        for(Tester each : scrumTeam.testerTeam){//we can use the ArrayList in scrumTeam class

            System.out.println(each);
        }
        System.out.println("=================================");

        scrumTeam.fireTester(90345);

        for(Tester each : scrumTeam.testerTeam){

            System.out.println(each);

        }

        System.out.println(scrumTeam.testerTeam.size());

        System.out.println("=====================================");
      //  System.out.println(scrumTeam);

        Developers developer1 = new Developers();

        developer1.setDeveloperInfo("Zoye", "Senior Developer", 145000, 90567);

        Developers developer2 = new Developers();

        developer2.setDeveloperInfo("Kim", "Junior Developer", 120000, 90678);

        Developers developer3 = new Developers();

        developer3.setDeveloperInfo("Katty", "Senior Developer", 150000, 90157);

       // ScrumTeam scrumTeam2 = new ScrumTeam(); we can create another scrum team, but no need we already have one

        scrumTeam.hireDeveloper(developer1);
        scrumTeam.hireDeveloper(developer2);
        scrumTeam.hireDeveloper(developer3);

        for(Developers each : scrumTeam.developerTeam){

            System.out.println(each);
        }

        System.out.println("=============================================");

        scrumTeam.fireDeveloper(90157);

        for(Developers each : scrumTeam.developerTeam){

            System.out.println(each);
        }

        System.out.println(scrumTeam.developerTeam.size());

        System.out.println("=============================================");

        System.out.println("In my scrum team , we have "+scrumTeam.testerTeam.size()

        + " testers and we have "+scrumTeam.developerTeam.size()+" developers");







    }
}
