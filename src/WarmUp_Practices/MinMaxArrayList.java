package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinMaxArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list =  new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,3,4,5,6,7,8,9,99,45,34,233,76,233));

        System.out.println(list);

        ArrayList<Integer> noDup = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){

            if(! noDup.contains(list.get(i))){

                noDup.add(list.get(i));
            }

        }

        System.out.println(noDup);

        Collections.sort(noDup);

        System.out.println(noDup);

        int max =  Collections.max(noDup);

        System.out.println(max);

        int max2 = noDup.get(noDup.size()-2);

        System.out.println(max2);

        int min = Collections.min(noDup);

        System.out.println(min);

        int min2 =noDup.get(1);

        System.out.println(min2);

    }
}
