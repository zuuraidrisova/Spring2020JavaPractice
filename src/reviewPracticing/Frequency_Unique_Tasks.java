package reviewPracticing;

public class Frequency_Unique_Tasks {

    public static void main(String[] args) {

                /*
                Warm up task:
        1. write a program that can return the unique characters from a
        string
        Ex:  "AABCC" ==> "B"
        */

          String str = "AABCC";

          String unique = "";

        System.out.println("str = " + str);

        for (int i = 0; i <= str.length()-1; i++){

              int count = 0;

              for (int j = 0; j <= str.length()-1; j++){

                  if (str.charAt(i) == str.charAt(j)){

                      count++;

                  }
              }

              if (count == 1){

                  unique += str.charAt(i);
              }

          }

        System.out.println("unique = " + unique);


                /*
        2. write a program that can return the frequency of the characters
        ina string
        Ex: "AABCBCA" ==> "A3B2C2"
                 */

                String noDup = "";


          for (int i = 0; i <= str.length()-1; i++){


              if (!noDup.contains(str.charAt(i)+"")){

                  noDup += str.charAt(i);
              }

          }

        System.out.println("noDup = " + noDup);

        String result = "";

        for (int i = 0; i <= noDup.length()-1; i++){

            int count = 0;

            for (int j = 0; j <= str.length()-1; j++){

                if (noDup.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            result += noDup.charAt(i) + ""+count;

        }

        System.out.println("result = " + result);


    }
}
