package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysScannerLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] arr =  new int[5];

        for(int i = 0; i < 5; i++){

            System.out.println("Please enter a number "+ (i+1));
            arr[i] = scan.nextInt();

        }

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){

            System.out.println("Please enter a number "+(i+1));

            list.add(scan.nextInt());

        }

        System.out.println(list);




    }
}
