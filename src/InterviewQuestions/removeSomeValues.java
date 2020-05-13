package InterviewQuestions;
import java.util.ArrayList;
import java.util.Arrays;

public class removeSomeValues {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        System.out.println(list);

        System.out.println("=====================================");


/*
        for(int i = 0; i < list.size(); i++){

            if(list.get(i) >=  100){

                list.remove(list.get(i));
            }
        }

 */

        ArrayList<Integer> list2 = new ArrayList<>();

        for(Integer each : list){

           if(each >= 100) {

               list2.add(each);
           }
        }

        System.out.println(list2);



       // System.out.println(list);

        System.out.println("=====================================");

      list.removeIf(p -> p > 100);

      System.out.println(list);
    }
}
