package resources;

import day40_Encapsulation.Encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

       // System.out.println(obj.SSN); cos data is private

        obj.setSSN(3594720);

        long ssn = obj.getSSN();

        System.out.println(ssn);


    }
}
