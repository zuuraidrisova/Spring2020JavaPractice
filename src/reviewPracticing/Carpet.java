package reviewPracticing;

import java.util.ArrayList;

public class Carpet {
     /*
    create a custom class for the carpet class that should contain the following:
    instance variables:
    width, length, unitPrice, isPersian (boolean)
    instance methods:
    customOrder(): sets the carpet' width, length, unitprice, & isParsian
    calcCost(): should be able to calculate the total cost of the carpet and return it as double
    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
    total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
     */
     double width;
     double length;
     double unitPrice;
     boolean isPersian;

     public void customOrder(double width, double length, double unitPrice, boolean isPersian){

         this.width = width;
         this.length = length;
         this.unitPrice = unitPrice;
         this.isPersian = isPersian;
     }

     public double calcCost(){


         double result = (width+length) * unitPrice;

         if (isPersian){

             return  result + 200;

         }

         return  result;

     }

     public String toString(){

         return "The carpet's width is "+ width + " and carpet's length is "

                 + length + " and total price is $"+ calcCost();

     }
}

class CarpetObjects{


    public static void main(String[] args) {


        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();
        Carpet carpet3 = new Carpet();
        Carpet carpet4 = new Carpet();

        carpet1.customOrder(3,5,250,true);
        carpet2.customOrder(5,2,135,false);
        carpet3.customOrder(10,2,80,false);
        carpet4.customOrder(10,10,200,true);

        Carpet [] carpets = {carpet1,carpet2,carpet3,carpet4};

        for (int i = 0; i < carpets.length; i++){

            System.out.println(carpets[i]);
        }

        for (Carpet each : carpets){

           double price =  each.calcCost();

            System.out.println("price = " + price);
        }

        ArrayList<Carpet> carpets1 = new ArrayList<>();

        for (Carpet each : carpets){

            if (each.isPersian){

                carpets1.add(each);
            }
        }


        for (int i = 0; i < carpets1.size(); i++){

            System.out.println(carpets1.get(i));
        }


    }


}
