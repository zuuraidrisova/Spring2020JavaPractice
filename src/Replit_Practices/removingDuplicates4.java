package Replit_Practices;

public class removingDuplicates4 {

     /*
    uniqueChars is a method that you will code now, should be able to accept
     any string in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
     */

    public static void main(String[] args) {

        String s = "javaaa";

        uniqueChars(s);

    }

    public static void uniqueChars(String word){

        String uniques = "";

        for(int i = 0; i < word.length(); i++) {


            while (!uniques.contains(""+word.charAt(i))){

                uniques += word.charAt(i);
            }
        }

        System.out.println(uniques);
    }
}
