package day34_CustomClass;

import java.util.ArrayList;

public class scrumTeam2 {

    ArrayList<Developers> developersTeam = new ArrayList<>();


    public void hire(Developers developer){

        developersTeam.add(developer);

    }

    public void fire(long employeeID){

        developersTeam.remove(employeeID);

    }




}
