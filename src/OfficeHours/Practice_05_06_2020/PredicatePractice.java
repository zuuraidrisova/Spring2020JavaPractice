package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {


        ArrayList<Character> chars = new ArrayList<>();

        chars.addAll(Arrays.asList('A','2','C','3','B'));

        Predicate<Character> digits = n -> Character.isDigit(n);

        chars.removeIf(digits);

        System.out.println(chars);






    }
}
