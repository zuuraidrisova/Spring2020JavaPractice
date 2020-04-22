package JavaTPoint;

import java.util.Arrays;

public class copyFromOneArrayToAnother {

    public static void main(String[] args) {

        /*
        In this program, we need to copy all the elements of one array into another.
         This can be accomplished by looping through the first array and store the
         elements of the first array into the second array at the corresponding
         position.
         */

        int [] arr1 = {1,2,3,4,5};

        int [] arr2 = new int [arr1.length];

        int j = 0;

        for(int i = 0; i < arr1.length; i++){

            arr2 [j] = arr1 [i];

            j++;

        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr1, arr2));


        System.out.println("Elements of first array: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(+ arr1[i]+" ");
        }
        System.out.println();
        System.out.println("====================");

        System.out.println("Elements of second array: ");

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
