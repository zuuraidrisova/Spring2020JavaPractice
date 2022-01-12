package reviewPracticing;

import java.util.Arrays;

public class MethodOverloading_Tasks {

    public static void main(String[] args) {

        int count = frequency("ABABABBA",'A');

        System.out.println("count = " + count);

        String str = uniques("ABSAADANCC");

        System.out.println("str = " + str);

        String str2 = uniques1("ABSAADANCC");

        System.out.println("str2 = " + str2);

        int [] arr = {1,3,7,2,4,9,8,5,0,-3};

        int min = minNumber(arr);

        System.out.println("min = " + min);

        int [] array = sortDescending(arr);

        System.out.println(Arrays.toString(array));

        char [] arr2 = {'A', 'B','E','W','T','P','L','K','H'};

        char [] ch = sortDescending(arr2);

        System.out.println(Arrays.toString(ch));

        int a = minNumberFromArray(arr);

        System.out.println(a);

        double [] arr1 = {1.1,2.3,9.0,4.5,8.9,5.6};

        double d = minNumberFromArray(arr1);

        System.out.println(d);

        int [] un = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,3};

        uniqueElementsFromArray(un);

        double [] un2 = {1.1,2.3,2.2,1.1,2.2};

        uniqueElementsFromArray(un2);

        String [] names = {"Zuura", "Sary", "Sary", "Asan","Asan"};

        uniqueElementsFromArray(names);

    }

     /*
     write a return method called frequency that accepts two parameters:
     string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
     */

     public static int frequency(String str, char ch){

         char [] arr =  str.toCharArray();

         int count = 0;

         for (char each : arr){

            if (each == ch){

                count++;
            }
        }

         return count;
     }

     /*
        use the above method to create another called uniques that accepts
        a string paramter and returns it's unique characters as String
        Ex: uniques("ABBC");      ==> "AC"
        uniques("Cybertek");    ==> "cybrtk"
      */

     public static String uniques(String str){

         String uniques = "";

         for (int i = 0; i <= str.length()-1; i++){

             int count = 0;

             for (int j = 0; j <= str.length()-1; j++){

                 if (str.charAt(i) == str.charAt(j)){

                     count++;
                 }
             }

             if (count == 1){

                 uniques += str.charAt(i);
             }
         }

         return uniques;
     }

     public static String uniques1(String str){

         String result = "";

         for (int i = 0; i <= str.length()-1; i++){

            int count = frequency(str,str.charAt(i));

            if (count == 1){

                result += str.charAt(i);

            }
         }

         return result;
     }


       /*
 3. write a method that can return the minimum number from an int array
4. write a method that can return the minimum number from a double array
    NOTE: MUST apply method overloading

   */

    public static int minNumber(int [] arr){

        int min = arr[0];

        for(int each : arr){

            if(each < min){

                min = each;
            }
        }

        return min;
    }

    public static double minNumber(double [] arr){

        double min = arr[0];

        for(double each : arr){

            if(each < min){

                min = each;
            }
        }

        return min;
    }

        /*
    	5. write an int[] return method that can sort an int array in descending order
	6. write a double[] return method that can sort a double array in descending order
	7. write a char[] return method that can sort a char array in descending order
			NOTE: MUST apply method overloading
     */


    public static int [] sortDescending(int [] arr){

        Arrays.sort(arr);

        int [] descending = new int [arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            descending[j] = arr[i];
            j++;

        }

        return descending;

    }

    public static double [] sortDescending(double [] arr){

        Arrays.sort(arr);

        double [] descending = new double[arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            descending[j] = arr[i];

            j++;

        }

        return descending;

    }

    public static char [] sortDescending(char [] arr){

        Arrays.sort(arr);

        char [] descending = new char [arr.length];

        int j = 0;

        for(int i = arr.length-1; i >= 0; i--){

            descending[j] = arr[i];

            j++;

        }

        return descending;

    }

    /*
            1. write a return method that can return the minimum
        number from an int array
        */

    public static int minNumberFromArray(int [] array){

        int min = array[0];

        for (int i = 0; i <= array.length-1; i++){

            if (min > array[i]){

                min = array[i];
            }
        }

        return min;
    }
    /*
        2. write a return method that can return the minimum
        number from a double array
        NOTE: apply method
        overloading,  DO NOT USE SORT METHOD.
        */

    public static double minNumberFromArray(double [] array){

        double min = array[0];

        for (int i = 0; i <= array.length-1; i++){

            if (min > array[i]){

                min = array[i];
            }
        }

        return min;
    }
    /*
        3. write a method that can print out the unique elements
        from an int array
        Ex: {1,1,2,3,3} ==> 2
        {6,6,7,7,8,9} ==>
        8 9
        */

    public static void uniqueElementsFromArray(int arr[]){

        for (int each : arr){

            int count = 0;

            for (int eachItem : arr){

                if (each == eachItem){

                    count++;
                }
            }

            if (count == 1){

                System.out.println(each);
            }
        }
    }

    /*
        4. write a method that can print out the unique elements
        from a double array
        Note: Apply method overloading
     */

    public static void uniqueElementsFromArray(double arr[]){

        for (double each : arr){

            int count = 0;

            for (double eachItem : arr){

                if (each == eachItem){

                    count++;
                }
            }

            if (count == 1){

                System.out.println(each);
            }
        }
    }

    //unique values from an array of string

    public static void uniqueElementsFromArray(String [] arr){

        for (String each : arr){

            int count = 0;

            for (String eachItem : arr){

                if (each == eachItem){

                    count++;
                }
            }

            if (count == 1){

                System.out.println(each);
            }
        }
    }

}
