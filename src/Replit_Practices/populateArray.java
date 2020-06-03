package Replit_Practices;
import java.util.Arrays;
public class populateArray {
    /*
populate method accepts an empty int array and populates it with numbers counting up.

for example:

populate(new int[3])
returns:[1,2,3]

populate(new int[5])
returns:[1,2,3,4,5]

hint:
use a for loop and use the iterator as the current elements value.
     */
    public static int[] populate(int[] r){

        int [] arr = new int[r.length];

        for(int i = 0; i < r.length; i++){

            arr[i] = i + 1;
        }


        return arr;
    }

    public static void main(String[] args){


        int [] i= new int[19];

        i= populate(i) ;

        System.out.println(Arrays.toString(i));

    }
}
