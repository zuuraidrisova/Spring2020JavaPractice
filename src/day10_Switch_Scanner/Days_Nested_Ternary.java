package day10_Switch_Scanner;

public class Days_Nested_Ternary {
    public static void main(String[] args) {
        byte num=1;
        String days =" ";
        if(num>=1 && num <=7){
            days =(num==1)?"Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday"
                    :(num==5)?"Friday":(num==6)?"Saturday":"Sunday";
        }else{
            days = "Invalid";
        }
        System.out.println(days);
    }
}
