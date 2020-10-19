package day15_For_Loop;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("+==================+");

        for(int i=0;i<5; i++){//i=1 true ,i=2 true,i=3 true,i=4 true,i=5 false, stops.
            System.out.println("Hello World");
        }
        //i =0 --> initialization
        // i>5 --> condition
            // if condition is true, it will print statement
        // i++ --> iterator(helps to stop the loop)

        System.out.println("==============");
//print numbers from 1 to 10 inclusive
        for(int a = 1; a <= 10; a+=1 ){ //a++ is also possible for iterator
            //a++ will be 1,2,3,4,5,6,7,8,9,10
            //a+=2 will be 1,3,5,7,9
            System.out.println(a);
            System.out.println(a+" : "+(a*a));
        }


    }
}
