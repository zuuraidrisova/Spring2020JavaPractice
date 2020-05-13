package Replit_Practices;

import java.util.Arrays;

public class combine2FullName {

    public static void main(String[] args) {
        /*
        Complete the combineNames method to return a new String array
         that is composed of the first name and last name of each of the parameters.

This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}

returns a new String array with {"bob jones", "joe smith"}
         */

        String [] first = {"bob", "joe"};
        String [] last = {"jones", "smith"};

        String [] together = combineNames(first, last);
       String [] combined =    combineNames2(first,last);

        System.out.println(Arrays.toString(together));
        System.out.println(Arrays.toString(combined));



    }

    public static String[] combineNames(String[] first_names, String[] last_names) {

        String first = first_names[0] +" "+ last_names[0];
        String last = first_names[1] +" "+ last_names[1];

      String [] first1 =  first.split(", ");
      String [] last1 = last.split(", ");

      String [] together = new String[first1.length + last1.length];

      for(int i = 0; i < first1.length; i++){

          together[i] = first1[i];
      }

      for(int j =0; j < last1.length; j++){

          together[j + first1.length] = last1[j];
      }


      return together;
    }

    public static String[] combineNames2(String[] first_names, String[] last_names){

      String [] combined ={first_names[0] +" "+ last_names[0], first_names[1]+" "+last_names[1]};

        return combined;
    }
}
