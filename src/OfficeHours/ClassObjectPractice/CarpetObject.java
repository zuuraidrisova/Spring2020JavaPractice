package OfficeHours.ClassObjectPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {

        public static void main(String[] args) {

            Carpet order1 = new Carpet();

            order1.customOrder(3.4,2.1,100,true);

            System.out.println(order1);

            Carpet order2 = new Carpet();

            order2.customOrder(2.2,3.1,122,true);

            System.out.println(order2);

            Carpet order3 = new Carpet();

            order3.customOrder(3.5,7.8,90,false);

            System.out.println(order3);

            Carpet order4 = new Carpet();

            order4.customOrder(3.4,2.3,130, true);

            System.out.println(order4);

            System.out.println("=================================");


            Carpet [] orders = {order1, order2, order3, order4};

            for(int i = 0; i < orders.length; i++){

                System.out.println(orders[i]);
            }
            System.out.println("==================================");

            for(Carpet each :  orders){

                System.out.println(each);
            }

            System.out.println("===================================");

            for(Carpet each : orders){

                System.out.println("total of each carpet is : "+ each.calcCost());
            }

            System.out.println("=======================================");

            ArrayList<Carpet> listCarpet = new ArrayList<>();

            listCarpet.addAll(Arrays.asList(orders));

            for(Carpet each :  listCarpet){

                System.out.println(each);
            }

            System.out.println("===================================");

            listCarpet.removeIf(p -> p.isPersian == false);

            for(int i = 0; i < listCarpet.size(); i++){

                System.out.println(listCarpet.get(i));
            }


        }
}

