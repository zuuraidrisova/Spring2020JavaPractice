package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicatedValuesArrayList {

    public static void main(String[] args) {

        /*
        write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]

         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "D"));

        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();

        for(String each : list){

            int count = 0;

            for(String each2 : list){

                if(each == each2){

                    count++;

                }

            }

            if(count > 1){

                duplicates.add(each);
                break;

            }

        }


        System.out.println(duplicates);

    }
}
