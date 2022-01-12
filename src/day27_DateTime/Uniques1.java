package day27_DateTime;

public class Uniques1 {

    //unique values from an array

    public static void main(String[] args) {

        String [] names = {"Zuura", "Sary", "Sary", "Asan","Asan"};

        String unique =  unique(names);

        System.out.println(unique);

        String str = "zuuuu";

        System.out.println(unique(str));


    }

    public static String unique(String [] arr){

        String unique = "";

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    count++;
                }
            }

            if(count == 1){

                unique = arr[i];
            }

        }


        return  unique;
    }

    public static char unique(String str){

        char ch = 0;

        for(int i = 0; i < str.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            if(count == 1){

               ch = str.charAt(i);

            }

        }

        return ch;
    }
}
