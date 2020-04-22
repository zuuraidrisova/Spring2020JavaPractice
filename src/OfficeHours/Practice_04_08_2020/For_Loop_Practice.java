package OfficeHours.Practice_04_08_2020;

public class For_Loop_Practice {
    public static void main(String[] args) {
        /*
        for(initialization;condition;iterator){}
        condition based on initialization==>mandatory
         */
        for(int i =0;i<=5;i++){//0,1,2,3,4,5==>6 times execution
            System.out.println("Hello world "+i);
        }
        for(int i =0;i<=5;i+=2){//0,2,4==>3 times execution because we increment by 2
            System.out.println("Hello world "+i);
        }

        for(int i =1;i<=5;i+=2){//1,3,5==>3 times execution, because we start from 1
            System.out.println("Hello world "+i);
        }
        /*
        execution order: compiler first checks initialization
                        then it checks condition
                        if condition is true, whatever u place in body will be printed
                        if condition is false it will never run//stops the loop
                        then iterator will increment or decrement
         */

        System.out.println("===================");
        for(int i=1;i<=5;i++){//1,after executing first it will go and
            // check condition again, this job will be repeated until condition gets false 2,3,4,5
            System.out.println("Hey, World");
        }
        //if condition is true, it will print what is in the body


        System.out.println("================");
        for(int i=1;i<=5;){//statement will not get printed immediately.
            // because we have increment right away before statement
            i++;//it will immediately change the value
            System.out.println(i);//2,3,4,5,6...6 is also printed one more time because it increments once again
        }


        for(int i=1;i<=5;){//statement will get printed immediately.
            // because we have statement and condition is true
            System.out.println(i);//1,2,3,4,5
            i++;//it will immediately change the value
        }

    }
}
