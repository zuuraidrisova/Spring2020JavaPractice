package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {

    public static void main(String[] args) {

        //removeAll(Collection type); ==> removes multiple matching objects

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("Hello","Hello","Hello",
                "Thanks","Sorry","Nice","Please","Please"));

        System.out.println(list);

        String a = "Please";

        list.remove(a);//removes first matching one

        System.out.println(list);

        list.removeAll(Arrays.asList("Hello","Sorry"));//removes all matching ones

        System.out.println(list);

        System.out.println("======================");

        //interview question ==> remove anyone with the name of Ahmad

        String [] arr = {"Ahmad","John","Aron","Ahmad","Daniel","Ahmad"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));

        System.out.println(names);

        names.removeAll(Arrays.asList("Ahmad"));

        System.out.println(names);

    }
}
