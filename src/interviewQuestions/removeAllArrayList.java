package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAllArrayList {

    public static void main(String[] args) {

        //remove anyone names with Ahmad


        String [] arr = {"Ahmad","John","Aron","Ahmad","Daniel","Ahmad"};
        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));
                                                    // add all items from arr to list

        System.out.println(names);

        names.removeAll(Arrays.asList("Ahmad"));

        System.out.println(names);



    }
}
