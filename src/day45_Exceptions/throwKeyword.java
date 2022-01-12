package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class throwKeyword {

    /*
    throw :  manually throwing the exception

            throw new ExceptionClass();

            creating a problem by us
     */

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

       // System.out.println(arr[100]);//unchecked exception, runtime

        // NoSuchElementException obj = new NoSuchElementException();
        //because we dont want to reuse anything, we can throw exception right away

       //throw obj;// manually simulating an exception

       // throw new NoSuchElementException();

        //anything comes after throw keyword cannot be executed, exception is there
/*
        boolean breakTime = true;

        if(breakTime){
            throw new RuntimeException("It is break time, we should take break");
        }

 */
        try{

            throw new IOException("please take break");

        }catch (Exception e){

        }
    }

}
