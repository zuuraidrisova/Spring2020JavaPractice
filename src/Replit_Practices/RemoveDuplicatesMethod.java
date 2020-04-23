package Replit_Practices;

public class RemoveDuplicatesMethod {
    /*
    uniqueChars is a method that you will code now, should be able to accept
     any string in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
     */
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("spoon") ) ;

        String names = "Zuuuura";
        String uniques = uniqueChars2(names);
        System.out.println(uniques);
    }

    public static String uniqueChars(String str) {
        //TODO: write your below

        String uniqueChars = "";

        for(int i = 0; i < str.length(); i++){

            if(! uniqueChars.contains("" + str.charAt(i))){

                uniqueChars += str.charAt(i);
            }
        }


        return uniqueChars;
    }

    public static String uniqueChars2(String str){

        String uniques = "";

        for(int i = 0; i < str.length(); i++){

            if(! uniques.contains(""+str.charAt(i))){

                uniques += str.charAt(i);
            }
        }

        return uniques;

    }
}
