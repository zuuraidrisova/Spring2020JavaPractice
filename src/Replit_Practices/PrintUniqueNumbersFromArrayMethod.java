package Replit_Practices;

public class PrintUniqueNumbersFromArrayMethod {
    /*
    Write a void method printUniqueNumbers that will print unique numbers
    from an array of ints.

Example:

input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34


     */
    public static void main(String[] args) {

        int [] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        printUniqueNumbers(nums);
        printUniqueNumbers2(nums);

    }
    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE



        for(int each : nums) {

            int count = 0;

            for (int each1 : nums) {

                if (each == each1) {

                    count++;
                }
            }
            if (count == 1) {

                System.out.println(each);
            }

        }


    }

    public static void printUniqueNumbers2(int [] numbers){

        for(int i = 0; i < numbers.length; i++){

            int count = 0;

            for(int j = 0; j < numbers.length; j++){

                if(numbers[i] == numbers[j]){

                    count++;
                }
            }

            if(count == 1){

                System.out.println(numbers[i]);
            }
        }

    }
}
