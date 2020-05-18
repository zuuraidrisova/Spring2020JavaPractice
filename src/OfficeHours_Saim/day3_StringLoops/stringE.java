package OfficeHours_Saim.day3_StringLoops;

public class stringE {

    /*
    Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false


&& means only if
|| means any is okay
     */


    public boolean stringE(String str) {

        int count = 0;

        for(int  i = 0; i < str.length(); i++){

            if(str.charAt(i) == 'e'){

                count++;

            }
        }

        if(count >= 1 && count <= 3){

            return true;
        }

            return false;
    }

    public static boolean stringE2(String str){

        int count = 0;

        while(str.contains("e")){

            count++;

            str = str.replaceFirst("e","");
        }

        return count >= 1 && count <= 3;

    }
}
