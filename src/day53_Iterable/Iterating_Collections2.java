package day53_Iterable;

import java.util.*;

public class Iterating_Collections2 {

    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.addAll(Arrays.asList("Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"));

        System.out.println(names);//no duplicates

        Iterator<String > it = names.iterator();

        while(it.hasNext()){

            String str = it.next().toLowerCase();

            if(str.contains("m")){
             //remove all names which contain M or m
                it.remove();
            }
        }

        System.out.println(names);


        System.out.println("==========================================");

        LinkedHashSet<String> names2 = new LinkedHashSet<>();

        names2.addAll(Arrays.asList("Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"));

        System.out.println(names2);

        for(Iterator<String> it2 = names2.iterator(); it2.hasNext();){

            String str2 = it2.next().toLowerCase();

            if(str2.contains("m")){

                it2.remove();
            }

        }

        System.out.println(names2);

        System.out.println("===========================================");

        LinkedHashSet<String> students = new LinkedHashSet<>();

        students.addAll(Arrays.asList("Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"));

        students.removeIf(p -> p.contains("m") || p.contains("M"));
        //shorter and easier, because it uses iterator internally

        System.out.println(students);

        System.out.println("===========================================");

        LinkedHashSet<String> students2 = new LinkedHashSet<>();

        students2.addAll(Arrays.asList("Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"));

        students2.retainAll(Arrays.asList("Asan","Sary"));//removeAll()

        System.out.println(students2);

        System.out.println("===========================================");

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        boolean b = list.containsAll(Arrays.asList(5,2,9,8));

        System.out.println(b);

        System.out.println("======================================");

        Collections.swap(list,1,3);// we give collection type, and index i and index j

        System.out.println(list);




    }
}
