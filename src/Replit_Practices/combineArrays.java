package Replit_Practices;

import java.util.ArrayList;

public class combineArrays {

    public static void main(String[] args) {

        /*
 combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
         */


        String r1 [] = {"f","o","o"};

        String r2 [] = {" b","a","r"};

       String str =  combineRs(r1,r2);

        System.out.println(str);


    }
    public static String combineRs(String[] r1,String[] r2) {

        ArrayList<String>list = new  ArrayList<String>();

        for(int  i = 0; i < r1.length; i++ ){

            list.add(r1[i]);
        }

        for(int j = 0; j < r2.length; j++){

            list.add(r2[j]);
        }

        String str = "";

        for(int i = 0; i < list.size(); i++){

            str +=list.get(i);
        }

        return str;

    }
}
