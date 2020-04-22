package JavaTPoint;

public class Frequency {
    public static void main(String[] args) {
        /*
        In this program, we have an array of elements to count the occurrence of its
         each element. One of the approaches to resolve this problem is to maintain
          one array to store the counts of each element of the array. Loop through
          the array and count the occurrence of each element as frequency and store
          it in another array fr.

1    2   8  3   2   2   2   5   1
In the given array, 1 has appeared two times so its frequency be 2 and 2 has appeared
 four times so have frequency 4 and so on.
         */

        int [] arr = {1,2,8,3,2,2,2,5,1};

        int [] frequency = new int [arr.length];


        for(int i = 0; i < arr.length; i++){
            frequency [i] = arr[i];

            for(int j = i+1; j < arr.length; j++){

                if(arr[i] == frequency[j]){

                    System.out.println(arr[i]);
                }
            }



        }



    }
}
