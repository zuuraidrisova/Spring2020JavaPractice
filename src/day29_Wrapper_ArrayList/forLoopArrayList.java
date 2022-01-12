package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class forLoopArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1); list.add(4); list.add(7); list.add(2);

        for(int i = 0; i < list.size(); i++){

            System.out.print(list.get(i) +" ");
        }

        System.out.println();

        for(Integer each : list){

            System.out.print(each+" ");

        }

        System.out.println();

        for(int i = 0; i < list.size(); i++){

            System.out.print(list.get(i) +" ");
        }

        System.out.println();

        System.out.println(list);//prints ArrayList as a string

        //adding values inside ArrayList using for loop

        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){

            list3.add(i+1);
        }

        System.out.println(list3);

       for(int i = 0; i < list3.size(); i++){//loops thru each element in ArrayList list3

           if(list3.get(i) % 2 == 0){//checks the conditions whether element is even or not

               continue;//if yes, skips the iteration
           }

           System.out.println(list3.get(i));//prints the odd elements
       }


    }
}
