package reviewPracticing;


import java.util.Arrays;

public class MethodsVoid_Tasks {

    public static void main(String[] args) {


        oddNumbers();

        evenNumbers();

        reverseString("zuura");

        int [] arr1 = {8126,1927,71,10,176,-1,182};

        maximumNumberFromAnyGivenArray(arr1);

        minimumNumberFromAnyGivenArray(arr1);

        arrayInDescendingOrder(arr1);

        kmToMiles(3);

        calculation(4,2,"+");

        grade(87);

        gallonsToLiters(90);

        int [] a = {1,2,3,4};
        int [] b = {5,6,7,8};

        mergeTwoArrays(a,b);

        String [] names = {"Ali", "Ali","Zuura","Safiya", "Zuura"};

        uniqueValuesFromStringArray(names);

        String str = "Helloooooooo";

        removeDuplicates(str);

        frequency(str);

        displayAge(1990);

        String palindrome = "level";

        palindrome(palindrome);

    }


    //1. write a method that can print all odd number between 1 ~ 100

    public static void oddNumbers(){

        for (int i = 1; i <= 100; i++){

            if (i % 2 != 0){

                System.out.print(i+" ");
            }
        }

        System.out.println();

    }

    //2. write a method that can print all even number between 1 ~ 100

    public static void evenNumbers(){

        for (int  i = 1; i <= 100; i++ ){

            if (i % 2 == 0){

                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    //3. create a function that can reverse any string

    public static void reverseString(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--){


            result += str.charAt(i);

        }

        System.out.println(result);
    }

    //4. create a function that can print the maximum number from any
    //given array

    public static void maximumNumberFromAnyGivenArray(int arr[]){

        int maxNumber = Integer.MIN_VALUE ;

        for (int i = 0; i <= arr.length-1; i++){


            if (maxNumber < arr[i]){

                maxNumber = arr[i];

            }
        }

        System.out.println(maxNumber);
    }


    //5. create a function that can print the minimum number from any
    //given array

    public static void minimumNumberFromAnyGivenArray(int arr[]){


        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length-1; i++){

            if (minNumber > arr[i]){

                minNumber = arr[i];
            }
        }

        System.out.println(minNumber);
    }

    //6. create a function that can print out the array in descending order
    //[1,2,3] == > [3,2,1]

    public  static  void arrayInDescendingOrder(int [] arr){

        int descending [] = new int[arr.length];

        int j = 0;

        for (int i = arr.length-1; i >= 0; i--){

            descending[j] = arr[i];

            j++;
        }

        System.out.println(Arrays.toString(descending));
    }

     /*
         write a method called KmToMiles that can convert km to miles
	 				1 km = 0.612 miles
         */

     public static void kmToMiles(int km){

         double miles =  0.612;

         System.out.println(km * miles);
     }

      /*
        write a method called Calculation, that can accepts 3 parameters:
         2 numbers and one operator, and prints out the calculation.
		if operator is not between [-, +, *, /, %] output should be
		Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;
         */

      public static void calculation(int a, int b, String operator){

          if (operator.equals("+")){

              System.out.println(a+b);

          }else if(operator.equals("-")){

              System.out.println(a-b);

          }else if(operator.equals("*")){

              System.out.println(a*b);

          }else if(operator.equals("/")){

              System.out.println(a/b);

          }else if(operator.equals("%")){

              System.out.println(a%b);

          }else{

              System.out.println("Invalid operator");
          }
      }

      /*
        write a method called Grade, that can print out the grade based on
        the score of the student
			if score is 100 ~ 90 ==> A
			if score is 89 ~ 80 ==> B
			if score is 79 ~ 70 ==> C
			if score is 69 ~ 60 ==> D
			if score is 0 ~ 59 ==> F
			otherwise ==> Invalid Score
		Ex:
			Grade(100); ==> A
			Grade(120); ==> Invalid
         */

      public static void grade(int score){

          if (score >= 90 && score <= 100){

              System.out.println("A");

          }else if(score <= 89 && score >= 80){

              System.out.println("B");

          }else if(score <= 79 && score >= 70){

              System.out.println("C");

          }else if (score <= 69 && score >= 60){

              System.out.println("D");

          }else if(score <= 59 && score >= 0){

              System.out.println("F");

          }else{

              System.out.println("Invalid score");
          }
      }

      /*
        write a method called GalonsToLitters, that can convert gallons to litters
	 			   1 G = 3.75 L
         */

      public static void gallonsToLiters(int gallon){

         double liters = gallon * 3.75;

          System.out.println(liters);

      }

      //merge two given int arrays

    public static void mergeTwoArrays(int [] arr1, int [] arr2){

          int merged [] = new int[arr1.length + arr2.length];

          for (int  i = 0 ; i <= arr1.length-1; i++){

              merged[i] = arr1[i];

          }

          for (int j = 0; j <= arr2.length-1; j++){

              merged[arr1.length + j] = arr2[j];

          }

        System.out.println(Arrays.toString(merged));
    }

    //unique values from array of String

    public static void uniqueValuesFromStringArray(String [] arr){

          for (String eachItem :  arr){

              int count = 0;

              for (String eachValue : arr){

                  if (eachItem.equals(eachValue)){

                      count ++;

                  }
              }

              if (count == 1){

                  System.out.print(eachItem+" ");
              }
          }

        System.out.println();//to break the line
    }


    // remove duplicates from any given string

    public static void removeDuplicates(String str){

          String noDuplicates = "";

          for (int i = 0; i <= str.length()-1; i++){

              if (!noDuplicates.contains(str.charAt(i)+"")){

                  noDuplicates += str.charAt(i);
              }
          }

        System.out.println(noDuplicates);
    }


    //frequency from any given string value

    public static void frequency(String string){

          String noDup = "";

          String result = "";

          for (int i = 0; i < string.length()-1; i++){

              if (!noDup.contains(string.charAt(i)+"")){

                  noDup += string.charAt(i);
              }
          }

          for (int i = 0; i <=  noDup.length()-1; i++){

              int count = 0;

              for (int j = 0; j <= string.length()-1; j++){

                  if (noDup.charAt(i) == string.charAt(j)){

                      count++;
                  }
              }

              result += noDup.charAt(i) +""+count;
          }

        System.out.println(result);
    }

     /*
        write a method that accepts birth year and displays the age in the console

        ex: calculate(1990) ==> 30
         */

     public static void displayAge(int year){

         System.out.println(2021 - year);
     }

     /*
         write a method that can identify if a string is palindrome
    ex: palindrom("level")  ==> true
    palindrome("Cybertek") ==> false
      */

     public static  void palindrome(String string){

         String reversed = "";

         for (int i = string.length()-1; i >= 0; i--){

             reversed += string.charAt(i);

         }

         if (reversed.equals(string)){

             System.out.println("palindrome");

         }else{

             System.out.println("not palindrome");
         }
     }
}
