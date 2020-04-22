package Replit_Practices;

public class UnqueStringValuesFromArray {
    public static void main(String[] args) {
        /*
         Write a program that can print out the unique values from  String Array
         */
        String [] arr = {"apple","hello","apple","please","hello"};

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr [i] == arr [j]){
                    count++;
                }

            }
            if(count == 1){
                System.out.println(arr[i]);
            }
        }




    }
}
