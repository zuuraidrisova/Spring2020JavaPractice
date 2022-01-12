package reviewPracticing;

import java.util.ArrayList;
import java.util.Arrays;

public class Offer {
     /*
    Create a class called Offer that has:
	instance fields :
			location, company, salary , isFullTime
	instance methods :
		setOfferInfo: can set the location, company, salary , isFullTime of the offer
		toString -- return all info about offers

     */

     String location;
     String company;
     double salary;
     boolean isFullTime;

     public void setInfo(String location, String company, double salary, boolean isFullTime){


         this.location = location;
         this.company = company;
         this.salary = salary;
         this.isFullTime = isFullTime;

     }

     public String toString(){

          return "Company : " + company + " Location : " + location
                 + " Salary : "+ salary +" FullTime : "+ isFullTime;
     }
}

 /*
        create a class called MyOffers
	Create 5 offer objects, and add them into the list of offers, and then:
			1. use for loop to print out the info of each offer
			2. write a program that can only retain the offers if:
					1. the offer is for fulltime position
					2. offer is from your local area
					3. salary is greater than 100K
         */

 class MyOffers{

     public static void main(String[] args) {

         Offer offer1 = new Offer();
         Offer offer2 = new Offer();
         Offer offer3 = new Offer();
         Offer offer4 = new Offer();
         Offer offer5 = new Offer();

         offer1.setInfo("NY", "Oracle",120000, true);
         offer2.setInfo("Ohio","Cleveland Clinics", 100000, true);
         offer3.setInfo("Chicago", "Walgreens", 120000, true);
         offer4.setInfo("SF","Holywood", 150000, false);
         offer5.setInfo("Miami","Progressive",130000, true);

         ArrayList<Offer> offers = new ArrayList<>();

         offers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5));

         for (Offer each : offers){

             System.out.println(each);
         }
         offers.removeIf(p -> p.isFullTime == false);

         System.out.println("========================================================");

         for (Offer each : offers){

             System.out.println(each);
         }


         System.out.println("========================================================");


         offers.removeIf(p -> !p.location.equalsIgnoreCase("Ohio"));


         for (Offer each : offers){

             System.out.println(each);
         }

         System.out.println("========================================================");

         offers.removeIf(p -> p.salary < 100000);

         for (Offer each : offers){

             System.out.println(each);
         }

         System.out.println("========================================================");



     }
 }