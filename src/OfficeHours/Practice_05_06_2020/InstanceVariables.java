package OfficeHours.Practice_05_06_2020;

public class InstanceVariables {

    int a = 100;//instance variables, declared outside class, goes to Heap memory
                // instance variables can be shared
                //belongs to object, each object has its own copy

    public static void main(String[] args) {

        int a = 100;//local variable, goes to Stack memory


        InstanceVariables obj1 = new InstanceVariables();//one copy of instance variable
        obj1.a = 100;

        System.out.println(300);

        InstanceVariables obj2 = new InstanceVariables();//another copy of instance variable
        obj2.a = 200;

        System.out.println(obj2.a);









    }
}
