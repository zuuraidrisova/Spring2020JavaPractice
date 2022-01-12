package day21_MultiDimensionalArray;

public class ShortestStringInArray {

    public static void main(String[] args) {
        /*
         write a program that can return the shortest string of text from an array
         */
        String [] str = {"Asan", "Zuura", "Alina","Kubanychbek","Zeynep"};

        int minLengthString = str[3].length();

        String shortest = "";

        for(int i = 0; i < str.length; i++){

            if(str[i].length() < minLengthString){

                minLengthString = str[i].length();

                shortest = str [i];

            }

        }

        System.out.println(shortest);

    }
}
