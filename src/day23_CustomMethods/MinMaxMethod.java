package day23_CustomMethods;

public class MinMaxMethod {
    public static void main(String[] args) {

        int [] arr1 = {8126,1927,71,10,176,182};

        printMaxFromArray(arr1);

        printMinFromArray(arr1);

    }

    /*
     create a function that can print the maximum number from any given array
     */
    public static void printMaxFromArray(int [] arr){

        int maxNumber = arr[0];

        for(int i = 0;  i < arr.length; i++){

            if(arr[i] > maxNumber){

                maxNumber = arr[i];
            }
        }
        System.out.println("Maximum Number is: "+maxNumber);

    }



    /*
	 create a function that can print the minimum number from any given array
     */

    public static void printMinFromArray(int [] arr){

        int minNumber = arr [0];

        for(int i =0; i < arr.length; i++){

            if(arr[i] < minNumber){

                minNumber = arr[i];
            }
        }

        System.out.println("Minimum Number is: "+minNumber);
    }


}
