package day21_MultiDimensionalArray;

public class LongestStringinArray {
    public static void main(String[] args) {
        /*
         write a program that can return the longest string of text from an array
         */

        String [] names = { "Kubanychbek","Asan", "Zuura","Alina","Zeynep"};

        int maxLengthString = names [1].length();
        String longest = "";

        for(int i = 0; i < names.length; i++){

            if(names [i].length() > maxLengthString){
                maxLengthString = names[i].length();
                longest = names[i];

            }

        }


        System.out.println(longest);

    }
}
