package reviewPracticing;

import java.util.Arrays;

public class Arrays_Tasks2 {

    public static void main(String[] args) {

        int [] arr = {3,100,-2,98,5,76};

        int [] arrDesc = new int[arr.length];

        Arrays.sort(arr);

        int j = 0;

        for (int i = arr.length-1; i >= 0; i--){

            arrDesc[j] = arr[i];

            j++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrDesc));


        String name = "Zuura Idrisova";

        char [] ch = name.toCharArray();

        System.out.println(Arrays.toString(ch));

        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));

    }
}
