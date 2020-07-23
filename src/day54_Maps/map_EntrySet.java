package day54_Maps;

import com.sun.tools.classfile.ConstantPool;

import java.util.LinkedHashMap;
import java.util.Map;

public class map_EntrySet {

    public static void main(String[] args) {

        LinkedHashMap<String, String> countries = new LinkedHashMap<>();

        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("USA","Washington");
        countries.put("Russia", "Moscow");
        countries.put("East Turkistan", "Urumqi");
        countries.put("Pakistan", "Islamabad");


        for( Map.Entry<String, String> each : countries.entrySet()){

            System.out.println( "Country Name is: "+each.getKey() +", City Name is:"+each.getValue() );

        }

        System.out.println("============================================");

        String country = "Kyrgyzstan";


        for(Map.Entry<String, String> each : countries.entrySet()){

            String eachCountry = each.getKey();
            String eachCapitol = each.getValue();

            if(eachCountry.equalsIgnoreCase(country)){

                System.out.println(true);

            }

            if(eachCapitol.equalsIgnoreCase("Bishkek")){

                System.out.println(true);
            }

        }


    }
}
