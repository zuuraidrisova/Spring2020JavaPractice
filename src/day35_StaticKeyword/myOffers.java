package day35_StaticKeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {
    public static void main(String[] args) {

/*
    create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fullTime position
                    2. offer is from your local area
                    3. salary is greater than 100K
 */

        Offers offer1 = new Offers();

        offer1.setOfferInfo("VA","Cybertek", 100000, true);

        System.out.println(offer1);

        Offers offer2 = new Offers();

        offer2.setOfferInfo("KY","CapitalOne", 120000, false);

        System.out.println(offer2);

        Offers offer3 = new Offers();

        offer3.setOfferInfo("BayArea","Google",115_000,true);

        Offers offer4 = new Offers();

        offer4.setOfferInfo("MD","Chase",95000,true);

        System.out.println("+==================================================+");

        String myLocation = "VA";

        Offers [] offers  = {offer1, offer2, offer3, offer4};

        ArrayList<Offers> Accept = new ArrayList<>();

        Accept.addAll(Arrays.asList(offers));

        System.out.println(Accept.size());

        for(int i = 0; i <  Accept.size(); i++){

            System.out.println(Accept.get(i));
        }
        System.out.println("+==================================================+");

        for(Offers each : Accept){

            System.out.println(each);
        }

        System.out.println("+==================================================+");

        Accept.removeIf(p -> p.salary < 100000);

        for(Offers each :  Accept){

            System.out.println(each);
        }

        System.out.println("+==================================================+");

        System.out.println(Accept.size());

        System.out.println("+==================================================+");

        Accept.removeIf(p -> p.isFullTime == false);

        for(Offers each : Accept){

            System.out.println(each);
        }
        System.out.println("+==================================================+");

        System.out.println(Accept.size());

        System.out.println("+==================================================+");

        Accept.removeIf(p -> !p.location.equals(myLocation));

        for(int i = 0; i < Accept.size(); i++){

            System.out.println(Accept.get(i));
        }

       // Accept.removeIf(p -> p.salary < 100000 || p.isFullTime == false || !p.location.equals("VA"));
        // we can also put all our conditions in one removeIF


    }
}
