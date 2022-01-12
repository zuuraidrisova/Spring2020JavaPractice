package day24_MethodsContinue;

public class MaxNumberMethod {

    public static void main(String[] args) {

      int max =   maxNumber(10,20);

        System.out.println(max);
    }

    //write a method that can return the max number between 2 numbers

    public static int maxNumber(int num1, int num2){

        if(num1 > num2){

           return  num1;

        }else{

            return num2;
        }

    }

}
