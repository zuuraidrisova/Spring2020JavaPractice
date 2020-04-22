package Replit_Practices;

public class Return7_3Locks {
    /*
    This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

     */
    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        if((a && b) || c){

            return true;

        }else{

            return false;
        }


    }

    public static void main(String[] args) {

       boolean a =  threeLocks(true, true, true);

        System.out.println(a);
    }
}
