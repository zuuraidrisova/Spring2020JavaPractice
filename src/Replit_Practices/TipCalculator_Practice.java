package Replit_Practices;
import java.util.Scanner;
public class TipCalculator_Practice {
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int NumberOfPeople = scan.nextInt();

        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("Service Quality:");
        String serviceQuality = scan.next();

        double totalTip = 0;

        if(serviceQuality.equalsIgnoreCase("Excellent")){
            totalTip= checkAmount*0.25;
        }else if(serviceQuality.equalsIgnoreCase("Great")){
            totalTip = checkAmount*0.20;
        }else if(serviceQuality.equalsIgnoreCase("Good")){
            totalTip =checkAmount*0.15;
        }else if(serviceQuality.equalsIgnoreCase("Fair")){
            totalTip = checkAmount*0.10;
        }else if(serviceQuality.equalsIgnoreCase("Poor")){
            totalTip=checkAmount*0.05;
        }

        double totalToPay = checkAmount+totalTip;
        double totalPerPerson = totalToPay/NumberOfPeople;
        double tipPerPerson = totalTip / NumberOfPeople;

        String  numberOfPeopleEntered = "";

        switch(NumberOfPeople){
            case 1:
                numberOfPeopleEntered = "&";
                break;
            case 2:
                numberOfPeopleEntered = "&&";
                break;
            case 3:
                numberOfPeopleEntered= "&&&";
                break;
            case 4:
                numberOfPeopleEntered="&&&&";
                break;
            case 5:
                numberOfPeopleEntered="&&&&&";
            default:
                numberOfPeopleEntered="Invalid";

        }


        if(split.equalsIgnoreCase("Yes")){
            System.out.println("Number of people entered: "+numberOfPeopleEntered);
            System.out.println("Total to pay: "+totalToPay);
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total per person: "+totalPerPerson);
            System.out.println("Tip per person: "+tipPerPerson);
        } else {
            System.out.println("Total to pay: "+totalToPay);
            System.out.println("Total to tip: "+totalTip);
        }







    }
}
