package day34_CustomClass;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class carpetObjects {

    public static void main(String[] args) {

        Carpet [] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(3.3,2.0,203,false);
        carpets[1].customOrder(1.1,4,57,false);
        carpets[2].customOrder(3.0,6,89,true);
        carpets[3].customOrder(5.0,6.7,100, true);
        carpets[4].customOrder(2.1,8.1,200,false);


        for(int i = 0; i < carpets.length; i++){

            System.out.println(carpets[i]);
        }

        System.out.println("====================================");

        ArrayList<Carpet> persian =  new ArrayList<>();

        for(int i = 0; i < carpets.length; i++){

            if(carpets[i].isPersian){

                persian.add(carpets[i]);

            }
        }

        System.out.println(persian);

        System.out.println("===========================");

        System.out.println(persian.size());

        System.out.println("============================");

        System.out.println(persian.get(0));

        System.out.println("=============================");

        double totalPrice = persian.get(1).calcCost();

        System.out.println(totalPrice);

        System.out.println("=============================");

        ArrayList<Carpet> noPersian = new ArrayList<>();

        noPersian.addAll(Arrays.asList(carpets));

        // noPersian.removeAll(persian);

        Predicate<Carpet> persianOnes = p -> p.isPersian;

        noPersian.removeIf(persianOnes);

        System.out.println(noPersian);

        System.out.println(noPersian.size());

        System.out.println("=======================================");

        for(int i = 0; i < persian.size(); i++){

            System.out.println(persian.get(i).calcCost());
        }

        System.out.println("==============================");

    }
}
