package day34_CustomClass;


public class keyBank {

    public static void main(String[] args) {

        Testers2 tester6 = new Testers2();

        tester6.setTesterInfo("Muhtar", 90234, "Manual Tester", 60000);

        scrumTeam team1 = new scrumTeam();

        team1.hireTester(tester6);

        System.out.println(team1.testers2Team.size());

        team1.fireTester(23455);

        System.out.println(team1.testers2Team.size());

        System.out.println("==========================================");


        Developers developer1 = new Developers();

        developer1.setDeveloperInfo("Zuura",90123, "Senior Developer", 150000);

        Developers developer2 = new Developers();

        developer2.setDeveloperInfo("Sary", 90124, "Senior Developer", 140000);

        scrumTeam2 team2 = new scrumTeam2();

        team2.hire(developer1);
        team2.hire(developer2);

        System.out.println(team2.developersTeam.size());

        Developers developer3 = new Developers();

        developer3.setDeveloperInfo("Kiki", 90234, "Junior Developer", 90000);

        team2.fire(developer3.employeeID);

        System.out.println(team2.developersTeam.size());



    }
}