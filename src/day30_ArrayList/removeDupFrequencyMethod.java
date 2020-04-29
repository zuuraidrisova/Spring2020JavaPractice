package day30_ArrayList;

import java.util.Arrays;

public class removeDupFrequencyMethod {

    public static void main(String[] args) {

        //practice of all unique task, frequency task, removeDuplicates task

        String str = "zuura zuura zuura Asan";

        String str1 = "zuura";

        int count = frequency(str, str1);

        System.out.println(count);

        String noDuplicates = removeDuplicates(str);

        System.out.println(noDuplicates);

        String uniques = unique(str);

        System.out.println(uniques);


        int [] arr = {1,2,3,4,5,6};

        int [] reversed = reversed(arr);

        System.out.println(Arrays.toString(reversed));

        int [] arr2 = {9,7,5,1,0,6,2,4,};

        int [] sortDescending = sortDescending(arr2);

        System.out.println(Arrays.toString(sortDescending));

    }

    public static int frequency(String str, String str1){

        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            if (str.contains(str1)) {

                count++;

                str = str.replaceFirst(str1, "");
            }
        }


        return count;

    }


    public static String removeDuplicates(String str){


        String noDuplicates = "";

        for(int i = 0; i < str.length(); i++){

            if(! noDuplicates.contains(""+ str.charAt(i))){

                noDuplicates += str.charAt(i);

            }
        }



        return noDuplicates;
    }

    public  static  String unique(String str){

        String uniques = "";

        for(int i = 0; i < str.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }


            if(count == 1){

                uniques += str.charAt(i);
            }
        }






        return uniques;
    }

    public static int [] reversed(int [] arr){

        int [] reversed = new int [arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0; i --){


            reversed[j] = arr[i];

            j++;
        }

        return reversed;
    }

    public static int [] sortDescending(int [] arr){

        Arrays.sort(arr);

        int [] sortDescending = new int [arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

          sortDescending[j] = arr[i];
          j++;

        }

        return sortDescending;
    }
}
