package day29_Wrapper_ArrayList;

public class unique {

    public static void main(String[] args) {


        String [] arr = {"Zuura", "Sary", "Sary"};

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){

               if( arr[i] == arr[j] ){

                   count++;
               }
            }

            if(count == 1){

                System.out.println(arr[i]);
            }

        }




    }
}
