package day24_MethodsContinue;


public class ReturnMethod {

    public static void maxNumber(int a, int b){

        if(a > b){

            System.out.println(a);
        }else{

            System.out.println(b);
        }
    }

    public static int add(int a,int b){

        int sum = a + b;
        return sum;
    }




    public static void main(String[] args) {

     //  maxNumber(10,20);

       int result =  add(10,20);

        System.out.println(result);
    }



}
