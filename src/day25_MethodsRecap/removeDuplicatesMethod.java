package day25_MethodsRecap;

public class removeDuplicatesMethod {
    /*
     write a return method that accepts a String and removes duplicate values
     from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
     */


    public static String removeDuplicates(String str){

        String noDuplicates = "";

        for(int  i = 0; i < str.length(); i++){

            if(! noDuplicates.contains(str.substring(i,i+1))){

                noDuplicates += str.substring(i, i+1);
            }
        }

        return noDuplicates;
    }

    public static void main(String[] args) {


        String str = "AAABBBBCCCDDD";

        String unique = removeDuplicates(str);

        System.out.println(unique);
    }
}
