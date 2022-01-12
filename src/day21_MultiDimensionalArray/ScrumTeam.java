package day21_MultiDimensionalArray;

import java.util.Arrays;

public class ScrumTeam {

    public static void main(String[] args) {

        String [] devTeam = {"Zeynep","Heider","Jovid"};

        String [] testers = {"Rahman","Ali","Osman","Zuura"};

        String [] PO = {"Sary","Chopa"};

        String [] Testers2 = {"Zarina","Ilham","Aizhan"};


        String [] [] ScrumTeam = {devTeam,testers, PO};

            ScrumTeam[1] = Testers2;

        //                           0       1
        String emp1 = ScrumTeam [0][1];

        String replacement = ScrumTeam [0][1] = "Jean";//replace

        System.out.println(emp1+" is fired!");
        System.out.println(replacement+" is hired");

        System.out.println("======================");

        String emp3 = ScrumTeam [2][1];
        System.out.println(emp3);

        System.out.println("============");

        for(String eachEmployee : ScrumTeam [1]){//choosing testers here
            System.out.println(eachEmployee);
        }
        System.out.println("====================");

        String emp2 =  ScrumTeam [1][2];
        System.out.println(emp2+" ");

        System.out.println("=======================");

    }
}
