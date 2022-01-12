package day30_ArrayList;


import java.util.ArrayList;

public class RemoveMethod2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");//0
        list.add("B");//1
        list.add("C");//2

        list.remove(1);//will remove B at the given index 1

        System.out.println(list);

        String str = "A";

        boolean a = list.remove(str);//will remove A object and return true, bcs it is removed

        System.out.println(a);
        System.out.println(list);

        String str2 = "F";

        boolean b = list.remove(str2);//will return false, bcs we do not have that object in list

        System.out.println(b);
        System.out.println(list);

        //clear() :  will erase everything from list and size become  0

        list.clear();

        System.out.println(list);

    }
}
