package reviewPracticing.collectionsFramework;

import java.util.*;

public class RemoveDuplicatesFromStringArray {

    public static void main(String[] args) {

        String names [] = {"Asan","Asan","Sary", "Sary","Shamil","Ozgur","Osman","Mehmet"};

        System.out.println(Arrays.toString(names));

        Set<String> noDupNames = new LinkedHashSet<>(Arrays.asList(names));

        System.out.println(noDupNames);

        noDupNames.removeIf(p -> p.contains("m"));

        System.out.println(noDupNames);

        Iterator<String> iterator = noDupNames.iterator();

        iterator.hasNext();

        System.out.println(iterator.next());

        ArrayList<String> namesNoDup = new ArrayList<>(noDupNames);

        System.out.println(namesNoDup);
    }
}
