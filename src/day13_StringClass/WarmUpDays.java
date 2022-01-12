package day13_StringClass;
import java.util.Scanner;
public class WarmUpDays {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number between 0 ~ 9: ");
        int num = scan.nextInt();


        String result ="";

        switch(num){
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result ="Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result = "Invalid entry";

        }

        System.out.println(result);


        String output = (num==0) ? "Zero" : (num==1) ? "One" :(num==2) ? "Two"
                :(num==3) ? "Three": (num==4) ? "Four": (num==5) ? "Five"
                :(num==6) ? "Six" : (num==7) ? "Seven" : (num==8) ? "Eight"
                :(num==9) ? "Nine" : "Invalid";

        System.out.println(output);

        scan.close();
    }
}
