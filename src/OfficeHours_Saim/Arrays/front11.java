package OfficeHours_Saim.Arrays;

public class front11 {
    /*

Given 2 int arrays, a and b, of any length, return a new array with the first
element of each array. If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
     */
    public int[] front11(int[] a, int[] b) {

        int[] front;

        if(a.length >= 1){

            if(b.length >= 1){

                front = new int[2];
                front[0] = a[0];
                front[1] = b[0];

            }else{

                front = new int[1];
                front[0] = a[0];
            }

        } else if(b.length >= 1){

            front = new int[1];
            front[0] = b[0];

        }

        front = new int[0];
        return front;
    }
}
