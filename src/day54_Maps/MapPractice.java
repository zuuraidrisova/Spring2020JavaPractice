package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        //create a map and store 5 people's name and birthday

        Map<String, LocalDate> birthdays = new LinkedHashMap<>();

        birthdays.put("Zuura", LocalDate.of(1990,11,17));
        birthdays.put("Sary",LocalDate.of(1991, 5,2));
        birthdays.put("Alina", LocalDate.of(1989, 4,1));
        birthdays.put("Zeynew",LocalDate.of(2014,8,27));
        birthdays.put("Apam",LocalDate.of(1966,4,1));

        System.out.println(birthdays);

        birthdays.remove("Zeynew");

        System.out.println(birthdays);

        System.out.println(birthdays.get("Zuura"));

        boolean b =  birthdays.containsKey("Asan");//returns false, because it is not contained

        System.out.println(b);

        boolean b1 =  birthdays.containsKey("Zuura");//returns true, because it is there

        System.out.println(b1);


       boolean b2 =  birthdays.containsValue(LocalDate.of(1990,11,17));

        System.out.println(b2);//true

        boolean b3 = birthdays.containsValue(LocalDate.of(1982,12,3));

        System.out.println(b3);//false

        System.out.println(birthdays.isEmpty());//false

       // birthdays.clear(); ==> deletes the map keys and values

    }
}
