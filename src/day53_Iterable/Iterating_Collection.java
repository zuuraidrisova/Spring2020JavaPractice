package day53_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));

        for(int i = 0; i < list.size(); i++){

            if(list.get(i) < 4){

                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));

        list2.removeIf(p -> p < 4);
        //removeIf uses iterator interface internally

        System.out.println(list2);


        System.out.println("================================");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));

        Iterator<Integer> iteratedList3  = list3.iterator();

        System.out.println(iteratedList3.hasNext());
        System.out.println(iteratedList3.next());

        System.out.println("================================");

        ArrayList<Integer> list4 = new ArrayList<>();

        Iterator<Integer> iteratedList4 = list4.iterator();

        while (iteratedList4.hasNext()){ // will always be false, because nothing in list4
            //never will get executed
            if(iteratedList4.next() < 4){

                iteratedList4.remove();
            }
        }

        System.out.println(list4);

        System.out.println("================================");

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));

        Iterator<Integer> iteratedList5  = list5.iterator();

        while(iteratedList5.hasNext()){

            if(iteratedList5.next() < 4){

                iteratedList5.remove();
            }
        }

        System.out.println(list5);

        System.out.println("================================");

        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6));

       for( Iterator<Integer> iteratedList6  = list6.iterator(); iteratedList6.hasNext(); ){

          int num =  iteratedList6.next();

          if(num < 4){

              iteratedList6.remove();;
          }

       }

        System.out.println(list6);



    }
}