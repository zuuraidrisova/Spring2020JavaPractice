package OfficeHours_Saim.day2_StringsLoops;

public class bobThere {
    public static void main(String[] args) {

        /*

Return true if the given string contains a "bob" string, but where
 the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
         */

        String str = "bab";

        boolean b = bobThere(str);

        System.out.println(b);

    }

    public static boolean bobThere(String str) {

        String str1 = "bob";

        for (int i = 0; i < str.length(); i++) {

            if (str.contains(str1)) {

                return true;

            } else if (str.equals(str1.substring(0, 1) + "" + str.substring(2))) {

                return true;

            }
        }

            return false;


    }


}