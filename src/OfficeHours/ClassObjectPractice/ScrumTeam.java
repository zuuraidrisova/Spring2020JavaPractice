package OfficeHours.ClassObjectPractice;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> developersTeam = new ArrayList<>();


    public void hireTester(Tester tester){

        testersTeam.add(tester);

    }

    public void fireTester(long employeeID){

        testersTeam.removeIf(p -> p.employeeID == employeeID);

    }


    public void hireDeveloper(Developer developer){

        developersTeam.add(developer);
    }

    public void fireDeveloper(long employeeID){

        developersTeam.removeIf(p -> p.employeeID == employeeID);
    }







}
