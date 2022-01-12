package day34_CustomClass;

import java.util.ArrayList;

public class scrumTeam {

    ArrayList<Testers2> testers2Team = new ArrayList<>();

    public void hireTester(Testers2 tester){

        testers2Team.add(tester);

    }

    public void fireTester(long employeeID){

        testers2Team.removeIf(t -> t.employeeID == employeeID);

    }

}
