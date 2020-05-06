package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {
    public static void main(String[] args) {

        /*
        create a class called MyOffers
	Create 5 offer objects, and add them into the list of offers, and then:
			1. use for loop to print out the info of each offer
			2. write a program that can only retain the offers if:
					1. the offer is for fulltime position
					2. offer is from your local area
					3. salary is greater than 100K
         */




        Offer offer1 = new Offer();

        offer1.setOfferInfo("Seattle","Oracle",150000, true);

        System.out.println(offer1);

        Offer offer2 = new Offer();

        offer2.setOfferInfo("Chicago", "Bank of America", 120000, true);

        System.out.println(offer2);

        Offer offer3 = new Offer();

        offer3.setOfferInfo("Chicago", "Deloitte", 105000, false);

        System.out.println(offer3);

        Offer offer4 = new Offer();

        offer4.setOfferInfo("San Francisco", "Apple Inc.", 160000, true);

        System.out.println(offer4);

        Offer offer5 = new Offer();

        offer5.setOfferInfo("Florida", "Disney World", 130000, true );

        System.out.println(offer5);

        System.out.println("=====================================");

        ArrayList<Offer> myOffers = new ArrayList<>();

        myOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));

        System.out.println(myOffers);

        System.out.println("=====================================");

        // using for each loop

        for(Offer each : myOffers){

            if(each.location == "Chicago" && each.isFullTime == true && each.salary > 100000 ){

                System.out.println(each);
            }
        }



    }
}
