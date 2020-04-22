package JavaTPoint;

public class MaxOf3NumbersMethod {
    public static void main(String[] args) {


        int max= maxNumber(200000,1212,222);
        System.out.println(max);
    }
    //create a function that returns max of 3 numbers

    public static int maxNumber(int num1, int num2, int num3){

        int max = 0;

        if(num1 > num2 && num1 > num3){
            max = num1;
            return max;
        }else if(num2 > num1 && num2 > num3) {
            max = num2;
            return max;
        }else{
            max= num3;
            return max;
        }
    }
}
