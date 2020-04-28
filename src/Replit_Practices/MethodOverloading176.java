package Replit_Practices;

public class MethodOverloading176 {
    /*
    In this task, you need to write 2 methods findMax() that will find a maximum
    number in the array. First method should work with array of integers (int[])
    and return int, and second method should work with an array of doubles
     (double[]) and return double as a result.
Methods must have the same name and different parameters.

Comment: Methods should be non static and with a return type.
     */
    public void main(String[] args) {

        int [] arr = {1,5,8,22,3,4,89};


    }

    public static int findMax(int [] arr){

        int max = arr[0];

        for(int i = 0;  i < arr.length; i++){

            if(max < arr[i]){

                max = arr[i];
            }
        }

        return max;
    }
    public double findMax(double [] arr){

        double max = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(max < arr[i]){

                max = arr[i];
            }
        }


        return max;
    }
}
