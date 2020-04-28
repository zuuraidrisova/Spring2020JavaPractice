package Replit_Practices;

import java.util.Arrays;

public class Merging2Arrays {
        /*
    mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
     */
        public static void main(String[] args) {

            int [] a = {0,1,2,3};
            int [] b = {4,5,6,7,8,9,10};

            int [] result = merge(a,b);

            System.out.println(Arrays.toString(result));


        }


        public static  int [] merge(int [] arr1, int [] arr2){

            int [] merged = new int [arr1.length + arr2.length];


            for(int i = 0; i < arr1.length; i++){

                merged[i] = arr1[i];
            }

            for(int i = 0; i < arr2.length; i++){

                merged[arr1.length+i] = arr2[i];
            }

            return merged;
        }

}
