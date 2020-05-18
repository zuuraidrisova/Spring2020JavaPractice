package OfficeHours_Saim.day2_StringsLoops;

public class xyzThere {
    /*

Return true if the given string contains an appearance of "xyz" where the xyz
 is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
     */

    public boolean xyzThere(String str) {

        if (str.startsWith("xyz")) return true;

        for (int i = 0; i < str.length() - 3; i++) {

            String word = str.substring(i, i + 4);

            if (!word.startsWith(".") && word.substring(1).equals("xyz")) {

                return true;

            }

        }

        return false;
    }

}
