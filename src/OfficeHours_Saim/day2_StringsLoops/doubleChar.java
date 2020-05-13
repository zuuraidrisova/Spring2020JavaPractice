package OfficeHours_Saim.day2_StringsLoops;

public class doubleChar {
    /*

Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public static void main(String[] args) {

        String str = "the";

      String d =   doubleChars(str);

        System.out.println(d);

        String c = doubleChars2(str);

        System.out.println(c);



    }


    public static String doubleChars(String str) {

        String doubled = "";

        for(int i = 0; i < str.length(); i++){

            doubled += ""+str.charAt(i)+str.charAt(i);
        }

        return doubled;
    }

    public static String doubleChars2(String str){

        String duplicated = "";

        for(int i = 0; i < str.length(); i++){

            duplicated += str.substring(i, i+1)+str.substring(i,i+1);
            //take one character at a time first char at i and then char next to i+1

        }

        return duplicated;
    }

}
