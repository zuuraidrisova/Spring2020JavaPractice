package day10_Switch_Scanner;
/*
	2. write a program that can display the days based on the numbers 1 ~ 7
 */

public class Days_NestedIf {
    public static void main(String []args){
        byte days = 8;
        String nameOfDays = " ";
        if(days>=1 && days<7){
            if(days==1){
                nameOfDays="Monday";
            }else if(days==2){
                nameOfDays="Tuesday";
            }else if(days==3){
                nameOfDays="Wednesday";
            }else if(days==4){
                nameOfDays="Thursday";
            }else if(days==5){
                nameOfDays="Friday";
            }else if(days==6){
                nameOfDays="Saturday";
            }else{
                nameOfDays="Sunday";
            }

        }else{
            nameOfDays="Invalid Entry";
        }
        System.out.println(nameOfDays);

    }
}
