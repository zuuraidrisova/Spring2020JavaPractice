package day53_Iterable;


import java.util.*;

public class removeDuplicatesFromArray {

    //access-modifier specifier  return-type  methodsName(parameter){body}

    //access modifiers: public protected default private
    //specifiers: static, final, abstract, synchronized

    //4. how to achieve thread safety: using synchronized keyword

    /*
    3. what are the differences between List and Set

			List: Accepts duplicates, has index numbers and keep insertion order
			Set: does not accept duplicates, does not have index numbers, and does not keep insertion order

     */

    public static void main(String[] args) {

        //in order to make it synchronized, we can use Collections utility

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list2 =  Collections.synchronizedList(list2);//now it will return us synchronized list
                    //now it became thread safe
        System.out.println(list2);

        System.out.println("===============================================");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,3,5,7,9,11));

        set =  Collections.synchronizedSet(set);//synchronizes and returns the set
        //now it is thread safe

        System.out.println(set);

        System.out.println("===============================================");

        //	1. write a program that remove the duplicates from an array of String
        //and keep insertion order
        String[] arr = {"A","E","B", "A","D","D","C","A"};

        Set<String> noDuplicates = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(noDuplicates);

        System.out.println("===============================================");

        //2. write a program that can remove the duplicates from an arrayList of String

        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("A","E","B", "A","D","D","C","A"));

        Set<String> noDup = new LinkedHashSet<>();//we can also pass list into constructor

        for(String each: list){

            noDup.add(each);
        }

        System.out.println(noDup);

    }

    public synchronized void append(){
        //4. how to achieve thread safety: using synchronized keyword
    }

}
