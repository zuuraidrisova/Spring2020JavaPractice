package day27_DateTime;

public class frequency2 {
    /*
     write a return method called frequency that accepts two parameters:
     string str and char ch, the method returns the frequency of the ch from
      the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2

            Note: MUST use Arrays and for each loop

     */
    public static void main(String[] args) {

        String str = "zuuuura";
        char ch = 'u';

        int count = frequency(str, ch);

        System.out.println(count);

        String uniques = unique(str);

        System.out.println(uniques);
    }
    public static int frequency(String str, char ch){

        int count = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == ch){

                count++;
            }
        }


        return count;
    }
    /*
    use the above method to create another called uniques that accepts
    a string paramter and returns it's unique characters as String


            Ex: uniques("ABBC");      	==> "AC"
                uniques("Cybertek");    ==> "cybrtk"

     */

    public static String unique(String str){

        String uniques = "";

        for(int i = 0; i < str.length(); i++){

            int count = frequency(str, str.charAt(i));

            if(count == 1){

                uniques += str.charAt(i);
            }
        }


        return uniques;


    }
}
