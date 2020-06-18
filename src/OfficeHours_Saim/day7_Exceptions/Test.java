package OfficeHours_Saim.day7_Exceptions;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(2000);// causes execution for a little while

        try{

            String s = "abc";

            System.out.println(s.charAt(4));

          // Exception obj = new Exception();

        }catch (StringIndexOutOfBoundsException e){//child comes first

            System.out.println("String is out of bound");

        }catch (RuntimeException e){

            System.out.println("It is Runtime Exception,");

        }catch (Exception e){

            System.out.println("General, parent Exception");

        } finally {

            System.out.println("finally block gets executed no matter what");
            System.out.println("It is like final action");
        }





    }

}
