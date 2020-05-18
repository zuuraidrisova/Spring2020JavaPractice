package Replit_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylIstSearch2 {
            /*
        search method accepts ArrayList of Strings and String find.
and returns a String.
It will look for an element within ArrayList that contains value of find
if it finds it, methods needs to return whole Element value.
if  an instance of find doesn't exist return:"search failed"

for example:

search(["one apple","two orange","four banana"],"four")
returns:
"four banana"
("four banana" contains "four" so method returns "four banana")

search(["hello","world"],"goodbye")
returns:
"search failed"
(no "goodbye" in any element)

hint:
use contains string method to test if element has word value in it.
  */
     public static void main(String[] args) {

                ArrayList<String> list = new ArrayList<>();
                list.addAll(Arrays.asList("one apple","two orange","four banana"));

                String find = "four";

                String k = search(list,find);

                System.out.println(k);


     }
     public static String search(ArrayList<String> list, String find){

         for(String each : list){

             if(each.contains(find)){

                 return each;

             }

         }

         return "search failed";

     }

}
