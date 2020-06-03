package day45_Exceptions;

class BreakTimeException extends RuntimeException{ // custom unchecked exception

        public BreakTimeException(){

            super("It is break time, we should take break");
        }

        public BreakTimeException(String str){

            super(str);
        }


}

public class customException {

    /*
    Custom Exceptions:

    how to create custom unchecked(Runtime)exception?

        a: by extending RuntimeException class

    how to create custom checked(CompileTime)exception?

        a: by extending Exception class
     */

    public static void main(String[] args) {

        boolean breakTime = true;

        if(breakTime){

            throw new BreakTimeException("let's have a break");

        }else{

            System.out.println("continue the class");
        }

    }
}
