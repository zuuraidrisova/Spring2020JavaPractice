package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testerTeam = new ArrayList<>();


    public void hireTester(Tester tester){

        testerTeam.add(tester);

    }

    public void  fireTester(long employeeId){

        testerTeam.removeIf( p -> p.employeeID == employeeId);

    }


    ArrayList<Developers> developerTeam = new ArrayList<>();

    public void hireDeveloper(Developers developer){

        developerTeam.add(developer);

    }

    public void fireDeveloper(long employeeID){

        developerTeam.removeIf(p -> p.employeeID == employeeID);

    }


}
