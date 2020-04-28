package day27_DateTime;

public class Uniques_Arrays {
    public static void main(String[] args) {

      /*
      3. write a method that can print out the unique elements from an int array

					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9

		4. write a method that can print out the unique elements from a double array

					Note: Apply method overloading
       */

      int [] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,3};

      unique(arr);

      double [] arr1 = {1.1,2.3,2.2,1.1,2.2};

      unique(arr1);

      for(int each : arr){

          int count = 0;

          for(int each1 : arr){

              if(each == each1){

                  count++;
              }
          }
          if(count == 1){

              System.out.println(each);
          }
      }

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

    public static void unique(int [] arr){

        for(int each : arr){

            int count = 0;

            for(int each2 : arr){

                if(each == each2){

                    count++;
                }
            }

            if(count == 1){

                System.out.println(each);
            }
        }

    }
    public static void unique(double [] arr){

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


}
