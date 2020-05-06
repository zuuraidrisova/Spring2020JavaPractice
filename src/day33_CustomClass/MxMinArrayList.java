package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MxMinArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,3,4,5,6,7,6,9,9,8));

        Collections.sort(list);

        int secondMax = 0;
        int secondMin = 0;

        int max = Collections.max(list);

        list.removeAll(Arrays.asList(max));

        int min = Collections.min(list);

        list.removeAll(Arrays.asList(min));

        secondMax = Collections.max(list);

        secondMin = Collections.min(list);

        System.out.println(secondMax);
        System.out.println(secondMin);





    }
}
