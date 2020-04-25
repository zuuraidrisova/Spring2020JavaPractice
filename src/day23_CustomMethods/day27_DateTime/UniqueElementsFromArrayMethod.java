package day23_CustomMethods.day27_DateTime;

public class UniqueElementsFromArrayMethod {
    /*
    write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
     */
    public static void main(String[] args) {

        int [] arr = {6,6,7,7,8,9};

        uniqueElements(arr);

        System.out.println("========================");

        uniqueElements2(arr);

        System.out.println("========================");

        String str = "zuuuura";

        uniqueChar(str);

        System.out.println("========================");

        uniqueChars2(str);

        System.out.println("========================");

        double [] arr1 = {1.0, 1.0, 2.2, 3.3, 3.3, 4.4,4.4};

       uniqueElements(arr1);

        System.out.println("========================");

        uniqueElements2(arr1);
    }

    public static void uniqueElements(int [] arr){

        for(int each : arr){

            int count = 0;

            for(int each2 :  arr){

                if(each == each2){

                    count++;
                }
            }
            if(count == 1){

                System.out.println(each);
            }

        }

    }

    public static void uniqueElements2(int [] arr){

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    count++;
                }
            }

            if(count == 1){

                System.out.println(arr[i]);
            }
        }
    }
    /*
    write a method that can print out the unique elements from a double array
					Note: Apply method overloading
     */
    public static void uniqueElements(double [] arr){

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr [j]){

                    count ++;
                }
            }

            if(count == 1){

                System.out.println((double)i);
            }
        }


    }
    public static void uniqueElements2(double [] arr){

        for(double each : arr){

            int count = 0;

            for(double each2 : arr){

                if(each == each2){

                    count++;
                }
            }

            if(count == 1){

                System.out.println(each);
            }
        }

    }

    public static void uniqueChar(String str){

        for(int i = 0; i < str.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }
            if(count == 1){

                System.out.println(str.charAt(i));
            }
        }


    }

    public static void uniqueChars2(String str){

       char [] ch =  str.toCharArray();

        for(char each : ch){

            int count = 0;

            for(char each2 : ch) {

                if (each == each2) {
                    count++;
                }
            }

            if(count == 1){

                System.out.println(each);
            }
        }
    }

}
