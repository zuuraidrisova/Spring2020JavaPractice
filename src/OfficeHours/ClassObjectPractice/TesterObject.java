package OfficeHours.ClassObjectPractice;

public class TesterObject {

    public static void main(String[] args) {

        Tester [] testers ={new Tester(), new Tester(), new Tester()};

        testers[0].setTesterInfo("Zoye", "SDET", 90123, 105000);
        testers[1].setTesterInfo("Kim", "QA", 90234, 90000);
        testers[2].setTesterInfo("Katty","Senior SDET",90345, 120000);

        for(int i = 0; i < testers.length; i++){

            System.out.println(testers[i]);
        }

        System.out.println("=============================================");


        for(Tester each  : testers){

            each.smokeTest();
            each.createTicket();
        }


    }
}
