package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class map_setEntries {

    public static void main(String[] args) {

        LinkedHashMap<String,String> fb = new LinkedHashMap<>();

        fb.put("Tester1", "test1");
        fb.put("Tester2", "test2");
        fb.put("Tester3", "test2");
        fb.put("Tester3", "test3");//only the latest value will  be kept
        fb.put("Tester4", "test4");
        fb.put("Tester5", "test5");

        System.out.println(fb.size());//size is 5

        System.out.println("===============================================");

        for(String eachKey : fb.keySet()){//gets only keys

            System.out.println("Keys: "+eachKey);
        }

        System.out.println("===============================================");

        for(String eachValue: fb.values()){

            System.out.println("Values: "+eachValue);

        }

        System.out.println("===============================================");

        List<String> userNames = new ArrayList<>(fb.keySet());

        System.out.println(userNames);

        System.out.println("===============================================");

        List<String> passwords = new ArrayList<>(fb.values());

        System.out.println(passwords);

        System.out.println("===============================================");

       LinkedHashMap<String, Integer> students = new LinkedHashMap<>();

       students.put("Zuura", 100);
       students.put("Sary", 79);
       students.put("Anna",90);
       students.put("Namik",75);
       students.put("Rahman",93);

       for(Integer eachValue: students.values()){

           if(eachValue < 90){

               continue;
           }

           System.out.println("Grades: "+eachValue);
       }

        System.out.println("===============================================");

       for(String eachKey: students.keySet()){// eachKey is name of student

           int eachValue = students.get(eachKey);//eachValue is score of student

           if(eachValue > 90){

               System.out.println(eachKey);
           }
       }

        System.out.println("===============================================");

       LinkedHashMap<String, Integer> badStudent = new LinkedHashMap<>();

       LinkedHashMap<String, Integer> goodStudent = new LinkedHashMap<>();

       for(String eachKey: students.keySet()){

           int eachValue = students.get(eachKey);

           if(eachValue < 90){

               badStudent.put(eachKey,eachValue);

           }else{

               goodStudent.put(eachKey, eachValue);

           }

       }

        System.out.println(badStudent);
        System.out.println(goodStudent);

    }
}
