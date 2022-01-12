package day29_Wrapper_ArrayList;


import java.util.ArrayList;

public class OddEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        boolean a = list.isEmpty();

        System.out.println(a);

        for(int i = 0; i < 10; i++){

            list.add(i + 1);//adding elements 1 to 10 to ArrayList
        }

        System.out.println(list);//prints ArrayList as a string

        for(int i = 0; i < list.size(); i++){//loops thru each element of ArrayList

            if(list.get(i) % 2 == 0 ){//checks if number is even or not

                continue;//if even skips it
            }

            System.out.print(list.get(i)+" ");//else prints one line with space

        }

        System.out.println();

        for(Integer each : list){//loops thru each element in ArrayList

            if(each % 2 != 0){//checks if number is even or odd

                continue;//if odd skips
            }

            System.out.print(each+" ");//else prints
        }

    }
}
