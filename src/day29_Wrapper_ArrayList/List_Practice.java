package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {

        ArrayList<String> groceryList  = new ArrayList<String>();

        System.out.println(groceryList);//now it is empty, so size is 0

        groceryList.add("Carrot");//size 1
        groceryList.add("Milk");//size 2
        groceryList.add("Rice");//size 3

        System.out.println(groceryList);//now it has 3 objects, so size is 3

        String item1 =  groceryList.get(0);//objects inside ArrayList can be retrieved by index numbers
        String item2 =  groceryList.get(1);//since ArrayList of String type, we can assign it to String
        String item3 =  groceryList.get(2);

        System.out.println("===================");

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

        System.out.println("===================");

        for(int i = 0; i < groceryList.size(); i++){

            System.out.println(groceryList.get(i));

        }

        System.out.println("===================");

        for(String each : groceryList){

            System.out.println(each);
        }

        System.out.println("===================");

        int size = groceryList.size();//return size of ArrayList as an int

        System.out.println(size);

        System.out.println("===================");

        groceryList.add("Coffee");//now size will be re-adjusted

        System.out.println(groceryList);

        System.out.println("===================");

        for(int i = 0; i <= groceryList.size()-1; i++){

            System.out.println(groceryList.get(i));
        }

        System.out.println("===================");

        int lastIndex = groceryList.size()-1;
        //groceryList has 0 1 2 3 indexes now, so 3 is lastIndex

        System.out.println(lastIndex);//returns last index as an int

        System.out.println(groceryList.get(lastIndex));//returns last item due to last index


    }
}
