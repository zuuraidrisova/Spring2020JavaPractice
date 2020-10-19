package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_IntroExample {

    public static void main(String[] args) {

        Map<String, Double> employeeData = new LinkedHashMap<>();

        employeeData.put("Zuura",100000.0);
        //now its size is 1, because we put one pair of data

        System.out.println(employeeData);

        System.out.println(employeeData.size());

        employeeData.put("Zarina", 120000.0);//now size is 2

        System.out.println(employeeData);

        System.out.println("=======================================");

        System.out.println(employeeData.get("Zarina"));

        System.out.println(employeeData.get("Zuura"));

        //System.out.println(employeeData.get("Bakhodir"));
        //when map does not contain , it gives null

        System.out.println("=======================================");

        employeeData.remove("Zarina");

        System.out.println(employeeData);//because we removed on key, now size is 1 again

        System.out.println(employeeData.size());

        System.out.println("=======================================");




    }
}
