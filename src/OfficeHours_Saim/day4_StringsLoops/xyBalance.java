package OfficeHours_Saim.day4_StringsLoops;

public class xyBalance {

    public boolean xyBalance(String str){

        for(int i = 0;i < str.length();i++){

            if(str.charAt(i) == 'x'){

                if(!str.substring(i).contains("y")) return false;
                //first find X and then look for Y after X?
//ohhhh ok
//its gonna keep looking for X and stop and look for Y after
//ok got it
//like a dog fetching
            }
        }
        return true;
    }
}
