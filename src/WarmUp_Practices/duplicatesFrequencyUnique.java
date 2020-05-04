package WarmUp_Practices;

import java.util.Arrays;
import java.util.Scanner;

public class duplicatesFrequencyUnique {

    public static void main(String[] args) {

        int [] arr = {1,2,1,2,3,4,5,1,1,1,1,-1};

        int a = 1;

        int count = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == a){

                count++;
            }
        }

        System.out.println("frequency of 1 in an array "+count);

        System.out.println("======================");

        for(int j = 0; j < arr.length; j++){

            int count1 = 0;

            for(int k = 0; k < arr.length; k++){

                if(arr[j] == arr[k]){

                    count1++;
                }
            }

            if(count1 == 1){

                System.out.print(+arr[j]+" ");
            }
        }


        System.out.println();

        System.out.println("======================");

        for(int x = 0; x < arr.length; x++){

            int count2 = 0;

            for(int y = 0; y <arr.length; y++){

                if(arr[x] == arr[y]){

                    count2++;
                }
            }

            if(count2 > 1){

                System.out.print(arr[x] +" ");
            }
        }
        System.out.println();

        System.out.println("======================");

        int max = Integer.MIN_VALUE;

        for(int j = 0; j < arr.length; j++){

            if(max < arr[j]){

                max = arr[j];

            }

        }

        System.out.println(max);

        System.out.println("==================");


        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(min > arr[i]){

                min = arr[i];

            }
        }

        System.out.println(min);

        System.out.println("=====================");

        //reversing an array
        Scanner scan = new Scanner(System.in);

        int [] arr2 = new int[10];

        for(int i = 0; i < 10; i++) {

            System.out.println("Please enter a number: "+(i+1));
            arr2[i] = scan.nextInt();

        }

        System.out.println(Arrays.toString(arr2));

        int [] reversed = new int[arr2.length];

        Arrays.sort(arr2);

        int k = 0;

        for(int z = arr2.length-1; z >= 0; z--){

            reversed[k] = arr2[z];

            k++;

        }

        System.out.println(Arrays.toString(reversed));

        System.out.println("================================");


        //assigning values to array

        int [] arr3 = new int[5];

        for(int i = 0; i < 5; i++){

            arr3[i] = i + 1;

        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("========================");

        for(int i = 0; i < arr3.length; i++){

            if(arr3[i] % 2 != 0){

                System.out.print(arr3[i]+" ");
            }

        }

        System.out.println();

        System.out.println("========================");

        String str = "Zuura";

        String reverse = "";

        for(int i = str.length()-1; i >= 0; i --){

            reverse += ""+str.charAt(i);
        }

        System.out.println(reverse);

        if(str.equals(reverse)){

            System.out.println("It is palindrome");
        }else{

            System.out.println("it is not palindrome");
        }

        System.out.println("=====================");

        String z = "u";

        int countZ = 0;

        while(str.contains(z)){

            countZ++;

            str =str.replaceFirst(z,"");
        }

        System.out.println(countZ);

        System.out.println("======================");

        String uniques = "";

        for(int i = 0; i < str.length(); i++){

            int count4 = 0;

            for(int j = 0; j <str.length(); j++){

               if(str.charAt(i) == str.charAt(j)){

                   count4++;
               }

            }

            if(count4 == 1){

                uniques += ""+str.charAt(i);

            }
        }

        System.out.println(uniques);

        System.out.println("=====================");

        String noDuplicates = "";

        for(int i = 0; i <str.length(); i++){

            if(!noDuplicates.contains(""+str.charAt(i))){

                noDuplicates += ""+ str.charAt(i);

            }
        }

        System.out.println(noDuplicates);




    }



}
