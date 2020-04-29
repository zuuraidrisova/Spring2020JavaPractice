package OfficeHours.Practice_18_03_2020;

public class Single_If_Practice2 {
    public static void main( String[]args){

        byte age = 20;
        boolean eligibleToBuy = age>21 || age==21;//age>==21;
        if(eligibleToBuy){//(age>=21)
            System.out.println("Here is your alcohol");
        }
        if(!eligibleToBuy){//(age<21)
            System.out.println("Go drink your milk");
        }

        boolean feeling = true;
        if(feeling==false){
            System.out.println("dont be sad");
        }
        if(feeling!=false){
            System.out.println("stay happy");
        }


    }
}
