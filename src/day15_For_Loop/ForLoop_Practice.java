package day15_For_Loop;

public class ForLoop_Practice {

    public static void main(String [] args){

        //odd number between 0~100 a single line separated by space
        String result = "";

        for(int i = 1; i<=100; i+=2){//odd numbers
           // result += i+" ";

            result= result.concat(i+ " ");
        }
        System.out.println(result);


        for (int a=2; a < 100; a+=2){//even numbers

            System.out.print(a+" ");
        }

    }
}
