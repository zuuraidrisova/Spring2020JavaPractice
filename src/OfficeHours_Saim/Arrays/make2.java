package OfficeHours_Saim.Arrays;

public class make2 {
    /*

Given 2 int arrays, a and b, return a new array length 2 containing,
 as much as will fit, the elements from a followed by the elements from b.
 The arrays may be any length, including 0, but there will be 2 or more elements
 available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
     */

    public int[] make2(int[] a, int[] b) {

        int[] comb = new int[2];

        if(a.length >= 2){

            comb[0] = a[0];
            comb[1] = a[1];

        } else if(a.length == 1){

            comb[0] = a[0];
            comb[1] = b[0];

        } else {

            comb[0] = b[0];
            comb[1] = b[1];
        }

        return comb;
    }
}
