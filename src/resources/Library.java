package resources;

import java.util.Arrays;

public class Library {

    public static int[] sortDescending2(int [] arr2){

        Arrays.sort(arr2);

        int [] arr3 = new int[arr2.length];
        int z = 0;

        for(int x = arr2.length-1; x >= 0; x--) {

            arr3[z] = arr2[x];

            z++;
        }
        return arr3;
    }
    public static String reverse(String reverse){


        String reversed = "";

        for(int i = reverse.length()-1; i >= 0; i--){

            reversed += reverse.charAt(i);
        }

        return reversed;
    }

    public static String removeDuplicates(String str){

        String noDuplicates = "";//to store the result

        for(int i = 0; i < str.length(); i++){//to loop thru every single character in string

            char ch =  str.charAt(i);//we can assign it to a new char variable

            if(! noDuplicates.contains(""+ch)){//to check if result contains the particular character

                noDuplicates += ch; //concatenates character to string

            }

        }

        return noDuplicates;
    }
    public static int frequency(String str1, String str2){

        int count = 0;

        while(str1.contains(str2)){

            count++ ;

            str1 = str1.replaceFirst(str2,""); //we need to make sure that we are not counting the same index over again
        }

        return count;

    }
    public static String frequencyOfCharacters(String str){

        String result = "";//expected result A2B2C2

        String noDup =  Library.removeDuplicates(str);

        for(int i = 0; i < noDup.length(); i++){

            String ch = ""+ noDup.charAt(i);//"A"
            int count = Library.frequency(str, ch);

            result += ch + count;

        }
        return result;

    }

    public static void uniqueElements(int [] arr){

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    count++;
                }
            }

            if(count == 1){

                System.out.println(arr[i]);
            }
        }
    }

    public static void uniqueElements(double [] arr){

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr [j]){

                    count ++;
                }
            }

            if(count == 1){

                System.out.println((double)i);
            }
        }


    }

    public static void uniqueChar(String str){

        for(int i = 0; i < str.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }
            if(count == 1){

                System.out.println(str.charAt(i));
            }
        }


    }
}
