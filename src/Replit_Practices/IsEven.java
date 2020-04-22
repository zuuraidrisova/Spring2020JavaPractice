package Replit_Practices;

public class IsEven {
    public static void main(String[] args) {
        /*
        isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true
         */
        boolean a = isEven(4);
        System.out.println(a);

    }
    public static boolean isEven(int num){

        boolean result = false;

        if(num % 2 == 0){

            result = true;
        }else{

            result =false;
        }

        return result;
    }
}
