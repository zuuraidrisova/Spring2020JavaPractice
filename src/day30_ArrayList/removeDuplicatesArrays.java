package day30_ArrayList;

public class removeDuplicatesArrays {

    public static void main(String[] args) {

        //remove duplicates from string

        String str = "zuuuuuuuuuuuuuurrrrraaaa";

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++){

            if(! noDuplicates.contains(""+str.charAt(i))){

                noDuplicates += str.charAt(i);

            }
        }

        System.out.println(noDuplicates);



    }

}
