package day36_StaticBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class Offer {

/*
Create a class called Offer that has:
    instance fields :
            location, company, salary , isFullTime
    instance methods :
        setOfferInfo: can set the location, company, salary , isFullTime of the offer
        toString -- print all info about offers

 */

       String location;
       String company;
       double salary;
       boolean isFullTime;

       public void setOfferInfo(String location, String company, double salary, boolean isFullTime){

           this.location = location;
           this.company = company;
           this.salary = salary;
           this.isFullTime = isFullTime;



       }
       public String toString(){


           return "Location : "+location+" Company : "+company+" Salary : "+salary
                   +" Fulltime : " +isFullTime;
       }


}
/*
  create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
 */
class MyOffers{

    public static void main(String[] args) {

        Offer [] offers = {new Offer(), new Offer(), new Offer(), new Offer()};

        offers[0].setOfferInfo("VA", "Apple",120000, true);
        offers[1].setOfferInfo("KY", "Microsoft",130000,true);
        offers[2].setOfferInfo("Seattle","Oracle",140000,false);
        offers[3].setOfferInfo("Chicago","Deloitte",110000,true);


        ArrayList<Offer> listOffers = new ArrayList<>();

        listOffers.addAll(Arrays.asList(offers));

        for(Offer each : listOffers){

            System.out.println(each);
        }

        System.out.println("===========================================");

        for(int i = 0; i < listOffers.size(); i++){

            System.out.println(listOffers.get(i).location);
        }

        System.out.println("=============================================");

        listOffers.removeIf(each -> each.isFullTime == false);

        for(int i = 0; i< listOffers.size(); i++){

            System.out.println(listOffers.get(i));
        }

        System.out.println("=============================================");

        listOffers.removeIf(p -> p.salary < 120000);

        for(Offer each :  listOffers){

            System.out.println(each);
        }

        System.out.println("=============================================");

        listOffers.removeIf(p -> p.location.equals("Chicago"));

        for(Offer each : listOffers){

            System.out.println(each);
        }

    }
}