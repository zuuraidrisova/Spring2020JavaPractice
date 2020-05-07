package OfficeHours.Practice_05_06_2020;

public class TestersObject {

    public static void main(String[] args) {


        Tester tester1 = new Tester();

        tester1.name = "Muhtar";
        tester1.jobTitle = "SDET";
        tester1.salary = 120000;
        tester1.employeeID = 90123;

        System.out.println(tester1);

        Tester tester2 = new Tester();

        tester2.setTesterInfo("Connor", "Junior SDET", 100000,90234);

        System.out.println(tester2);

        tester1.smokeTesting();
        tester2.smokeTesting();

        tester1.createTicket();
        tester2.createTicket();



    }


}
