package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class WarmUp_CountryNames {

    public static void main(String[] args) {

/*


 1. create an ArrayList of string called country names
 2. write a program that can remove all the country names
  that have length of 10 or greater


 */
        ArrayList<String> countryNames = new ArrayList<>();

        countryNames.addAll(Arrays.asList("Kyrgyzstan","Italy","Netherlands",
                "United States Of America", "Canada","South Korea","Russian Federation"));

        System.out.println(countryNames);

        Predicate<String> moreThan10 = country -> country.length() >= 10;

        countryNames.removeIf(moreThan10);

        System.out.println(countryNames);


    }
}
