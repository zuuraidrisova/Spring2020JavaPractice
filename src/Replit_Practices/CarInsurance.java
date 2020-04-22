package Replit_Practices;
import java.util.Scanner;
public class CarInsurance {
    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String license = scan.next();

        if(!license.equalsIgnoreCase("Yes")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        if(zipCode==20910 || zipCode==20740){
            premium+=60;
        }else if(zipCode==22102 || zipCode==22103){
            premium+=30;
        }else{
            premium+=50;
        }

        System.out.println("Is this vehicle Owned,Financed, or Leased?");
        vehicleOwnership = scan.next();
        if(vehicleOwnership.equalsIgnoreCase("Owned")){
            premium+=10;
        }else{
            premium+=20;
        }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if(vehicleUsage.equalsIgnoreCase("Business")){
            premium+=50;
        }else if(vehicleUsage.equalsIgnoreCase("Pleasure")){
            premium+=10;
        }else if(vehicleUsage.equalsIgnoreCase("Commute")){
            premium+=20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            premium +=daysDrivenToWorkOrSchool*5;

            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium+=milesToWorkOrSchool*1;

        }

        System.out.println("How old are you?");
        int age = scan.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if(age>=16 && age<18){
            premium*=20;//premium = premium*20;
        }else if(age>=18 && age<=21){
            premium*=6;
        }else if(age>21 && age<25){
            premium*=2;
        }

        System.out.println("How long  you've been driving?");
        int drivingExperience = scan.nextInt();

        if((drivingExperience+16) > age || age<=0){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
            premium= premium-(drivingExperience*5);
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String answer = scan.next();
        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium=premium+((premium*0.20)*accidentsAmount);

        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance=scan.next();
        if(continuousInsurance.equalsIgnoreCase("No")){
            premium=premium*2;

        }

        System.out.println("What is the highest level of education you have completed?");
        education=scan.nextLine();
        if(education.equalsIgnoreCase("PHD")){
            premium = premium-(premium*0.05);
        }else if(education.equalsIgnoreCase("Bachelor's")){
            premium = premium-premium*5/100;
        }else if(education.equalsIgnoreCase("Masters")){
            premium = premium-premium*5/100;
        }else if(education.equalsIgnoreCase("Doctors")){
            premium = premium-premium*10/100;
        }else  if(education.equalsIgnoreCase("less than High School")){
            premium = premium+premium*5/100;
        }

        scan.nextLine();
        String Education1 = "";
        for(int i=0; i<education.length();i++){
            if (String.valueOf(education.charAt(i)).equals(" ")) {
                continue;
            } else {
                Education1 += String.valueOf(education.charAt(i));
            }
        }

        referenceNumber = (name.substring(0,2)+""+age+name.substring(name.length()-2,name.length())
                +zipCode+Education1).toUpperCase();

        System.out.println(name+" ,here's your quote!");
        System.out.println("Start Your Policy Today For: "+premium+"$");
        System.out.println("Reference number: "+referenceNumber);




    }//closing curly braces of main method
}//closing curly braces of class
