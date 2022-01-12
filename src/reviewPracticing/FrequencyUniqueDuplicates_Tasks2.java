package reviewPracticing;

public class FrequencyUniqueDuplicates_Tasks2 {

    public static void main(String[] args) {

               /*
                Warm up task:
        1. write a program that can return the unique characters from a
        string
        Ex:  "AABCC" ==> "B"
        */

           String str = "AABCC";

           for (int i = 0; i <= str.length()-1; i++){

               int count = 0;

               for (int j = 0; j <= str.length()-1; j++){

                   if (str.charAt(i) == str.charAt(j)){

                       count++;

                   }
               }


               if (count == 1){

                   System.out.println(str.charAt(i)+"");
               }
           }


           //remove duplicates

        String str2 = "AABCC";

        String noDuplicate = "";

        for (int i = 0; i <= str2.length()-1; i++){

            if (!noDuplicate.contains(str2.charAt(i)+"")){

                noDuplicate += str2.charAt(i);

            }
        }

        System.out.println("noDuplicate = " + noDuplicate);



                /*
        2. write a program that can return the frequency of the characters
        in a string
        Ex: "AABCBCA" ==> "A3B2C2"
                 */

                String str3 = "AABCC";

         String noDup = "";

         for (int i = 0; i < str3.length()-1; i++){

             if (!noDup.contains(str3.charAt(i)+"")){

                 noDup += str3.charAt(i);

             }
         }

         String result = "";

         for (int i = 0; i <= noDup.length()-1; i++ ){

             int count = 0;

             for (int j = 0; j <= str3.length()-1; j++){

                 if (noDup.charAt(i) == str3.charAt(j)){

                     count++;

                 }
             }

             result += noDup.charAt(i)+""+count;

         }


        System.out.println("result = " + result);
    }
}
