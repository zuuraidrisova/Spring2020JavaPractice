package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class duplicatesPredicate2 {

    public static void main(String[] args) {


         /*
         write a program that can return the duplicated objects from an
         ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};

		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. DO NOT use any sort method
			  4. Use predicate and collections methods only

		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency > 1)  can keep the duplicated objects in arrayList
         */

        ArrayList<Integer> list =  new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,3,4,5,5));

        System.out.println(list);

        Predicate<Integer> uniques = n -> Collections.frequency(list,n) > 1;

        list.removeIf(uniques);

        System.out.println(list);

         /*
         write a program that can return the unique objects from an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};

		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate and collections methods only

		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList
         */

         ArrayList<Integer> list2 = new ArrayList<>();

         list2.addAll(Arrays.asList(1,1,2,3,4,5,5));

        System.out.println(list2);

        Predicate<Integer> duplicates = d -> Collections.frequency(list2,d) == 1;

        list2.removeIf(duplicates);

        System.out.println(list2);



    }

}
