package OfficeHours.ClassObjectPractice;

import java.util.ArrayList;

public class ORACLE {

    public static void main(String[] args) {

        ScrumTeam scrumTeam = new ScrumTeam();

        Tester tester1 = new Tester();

        tester1.setTesterInfo("Madina", "SDET", 90555, 110000);

        Tester tester2 = new Tester();

        tester2.setTesterInfo("Jyldyz", "SDET", 90289, 90000);


        scrumTeam.hireTester(tester1);
        scrumTeam.hireTester(tester2);


        for(Tester each : scrumTeam.testersTeam){

            System.out.println(each);
        }

        System.out.println("=============================================");

        Developer developer1 = new Developer();

        developer1.setDeveloperInfo("Bob", "Senior Developer", 90001, 140000);

        Developer developer2 =new Developer();

        developer2.setDeveloperInfo("Mira", "Junior Developer", 90888, 120000);

        Developer developer3 = new Developer();

        developer3.setDeveloperInfo("Crystal", "Developer", 90787, 130000);

        Developer developer4 = new Developer();

        developer4.setDeveloperInfo("Kuba", "Senior Developer", 90676, 150000);


        scrumTeam.hireDeveloper(developer1);
        scrumTeam.hireDeveloper(developer2);
        scrumTeam.hireDeveloper(developer3);
        scrumTeam.hireDeveloper(developer4);


        for(Developer each : scrumTeam.developersTeam){

            System.out.println(each);
        }

        System.out.println("==================================================");

        ScrumTeam scrumTeam1 = new ScrumTeam();

        Tester tester3 = new Tester();

        tester3.setTesterInfo("Mariya", "SDET", 90655, 110000);

        Tester tester4 = new Tester();

        tester4.setTesterInfo("Jazgul", "QA", 90219, 90000);

        Tester tester5 = new Tester();

        tester5.setTesterInfo("Rasul", "SDET", 90331, 100000);


        scrumTeam1.hireTester(tester3);
        scrumTeam1.hireTester(tester4);
        scrumTeam1.hireTester(tester5);


        for(Tester each : scrumTeam1.testersTeam){

            System.out.println(each);
        }

        System.out.println("=========================================");

        Developer developer5 = new Developer();

        developer5.setDeveloperInfo("Brian", "Senior Developer", 90011, 154000);

        Developer developer6 =new Developer();

        developer6.setDeveloperInfo("Maya", "Junior Developer", 91888, 100000);

        Developer developer7 = new Developer();

        developer7.setDeveloperInfo("Cristina", "Developer", 99787, 120000);

        Developer developer8 = new Developer();

        developer8.setDeveloperInfo("Kairat", "Senior Developer", 96666, 150000);

        Developer developer9 = new Developer();

        developer9.setDeveloperInfo("Chloe", "Senior Developer", 92676, 150000);



        scrumTeam1.hireDeveloper(developer5);
        scrumTeam1.hireDeveloper(developer6);
        scrumTeam1.hireDeveloper(developer7);
        scrumTeam1.hireDeveloper(developer8);
        scrumTeam1.hireDeveloper(developer9);


        for(Developer each : scrumTeam1.developersTeam){

            System.out.println(each);
        }

        System.out.println("======================================================");



        ScrumTeam [] scrums = {scrumTeam, scrumTeam1};


       for(ScrumTeam each : scrums){

            for(Tester each2 : each.testersTeam){

                if(each2.salary > 100000){

                    System.out.println(each2);
                }

            }

       }

        System.out.println("======================================");


       for(ScrumTeam each : scrums){

           for(Developer each2 : each.developersTeam){

               if(each2.salary > 120000){

                   System.out.println(each2);
               }
           }
       }

        System.out.println("==========================================");


        ArrayList<ScrumTeam> scrumLists = new ArrayList<>();

        scrumLists.add(scrumTeam);
        scrumLists.add(scrumTeam1);


        for(ScrumTeam each : scrumLists){

           each.testersTeam.removeIf(p -> p.salary > 100000);

           for(Tester each2  :  each.testersTeam){

               System.out.println(each2);
           }

        }

        System.out.println("=============================================");

        for(ScrumTeam each : scrumLists){

            each.developersTeam.removeIf(p -> p.salary > 120000);

                for(Developer each2 : each.developersTeam){

                    System.out.println(each2);
                }

        }


    }
}

