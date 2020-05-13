package day36_StaticBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class Carpet {

    /*
    create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitprice,
						 & isParsian
						calcCost(): should be able to caculate the total cost of the
						carpet and return it as double
						toString(): should be able to display all the info of the carpet
						 including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the
			 totalPrice
     */

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public  void setCarpetInfo(double width, double length, double unitPrice, boolean isPersian){

        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }

    public  double calcCost(){

        if(isPersian){

            return (width * length)* unitPrice + 200;

        }else{

            return (width * length) * unitPrice;
        }
    }

    public  String toString(){

        return "Width is "+width+" Length is "+length+" UnitPrice is "
                +unitPrice+" Persian is "+isPersian+" Total Cost  is "+calcCost();
    }

}

class CarpetObject{

    public static void main(String[] args) {

        Carpet order1 = new Carpet();
        Carpet order2 = new Carpet();
        Carpet order3 = new Carpet();
        Carpet order4 = new Carpet();

        order1.setCarpetInfo(2.3,5.5, 120,true);
        order2.setCarpetInfo(4.4,1.3,300, false);
        order3.setCarpetInfo(1.4,5.2,900, true);
        order4.setCarpetInfo(4.1,7.6,700, true);

        Carpet [] orders = {order1,order2,order3,order4};

        for(Carpet each : orders){

            System.out.println(each);
        }

        System.out.println("===================================");


        for(int i = 0; i < orders.length; i++){

            System.out.println(orders[i].calcCost());
        }

        System.out.println("===================================");

        int total = 0;

        for(Carpet each : orders){

            total += each.calcCost();

        }

        System.out.println(total);

        System.out.println("===================================");

        ArrayList<Carpet> listCarpet = new ArrayList<>(Arrays.asList(orders));

        listCarpet.removeIf(p -> p.isPersian == false);

        for(int i = 0; i < listCarpet.size(); i++){

            System.out.println(listCarpet.get(i));
        }

    }

}
