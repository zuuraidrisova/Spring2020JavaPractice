package day44_Exceptions;

public class multiCatch {

    public static void main(String[] args) {

        try { // it will try to fix, if not it will jump to first catch block
            System.out.println(100 / 0);

        }catch(ClassCastException e){//it will try to handle the exception, if not

            System.out.println("No Such Element Exception");

        }catch (ArithmeticException e){//it will come here, and it should handle it

            System.out.println("Arithmetic Exception");

        }catch (IndexOutOfBoundsException a){
            // it will not come here, because previous catch is handled

            System.out.println("IndexOutOfBound Exception");

        }catch (RuntimeException e){//top to bottom, so even if can handle ,
            // it will not be executed since it has already been caught
        //parent exception cannot come before child exception, it should always come after

            System.out.println("Runtime Exception");

        }
        System.out.println("=========================");


        try {

            System.out.println("Hello"); // everything is good here, so it will be printed
            System.out.println(9/0);//here it goes to catch block
            System.out.println("Cybertek");
            System.out.println("Java");

        }catch (Exception e){

            System.out.println("something went wrong");
        }
    }
}
