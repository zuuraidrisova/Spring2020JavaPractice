package day10_Switch_Scanner;

public class Days_Switch {
    public static void main(String []args){
        byte day = 2;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;// break means case closed
            case 2://as soon as it finds its match, it will break the switch immediately
                System.out.println("Tuesday");
                break;//if we dont give the break, then the next available statement will be printed until it finds break
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Entry");
                break;//
        }
    }
}
