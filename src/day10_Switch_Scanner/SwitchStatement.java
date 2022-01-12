package day10_Switch_Scanner;

public class SwitchStatement {
    public static void main(String []args){

        byte a = 4;
        //switch is evaluated to a single expression
        //so no float, long, boolean, double
        switch (a){//cases must be matching with expression...
            // if it is int in switch
            //it must be int in case
            case 1:
                System.out.println("One");
                break;//used to exit from switch statement if it matches
            case 2:
                System.out.println("Two");
                break;
            case 3://Case value must be unique..cannot be duplicated
                System.out.println("Three");
                break;
            case 4://this is gonna execute because switch found its case
                System.out.println("Four");
                break;
            default://gets executed if none of case matching
                System.out.println("No Catch");
                break;

                // default and break statements are optional
        }
    }

}
