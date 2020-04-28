package day29_Wrapper_ArrayList;

public class removeDup {

    public static void main(String[] args) {

        String str = "zuuuuuura";

        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++){

            if(! noDuplicates.contains(""+str.charAt(i))){

                noDuplicates += str.charAt(i);
            }
        }

        System.out.println(noDuplicates);


    }
}
