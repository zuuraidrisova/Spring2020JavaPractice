package day25_MethodsRecap;

public class return_methods {

    public static int maxValue(int num1, int num2){

        int max = 0;

        if(num1 > num2){

            max = num1;

        }else{

            max = num2;
        }

        return max;
    }

    public static int maxValue2(int num1, int num2){


        if(num1 > num2){

            return num1;

        }else{

            return num2;
        }
    }


    public static void main(String[] args) {

       int max =  maxValue(2,90);

        System.out.println(max);

        int max2 = maxValue2(2,90);

        System.out.println(max2);

    }
}
