package day45_Exceptions;

public class Day45_notes {
    /*

            05/29/2020
        Topics:

        Exceptions Continue:
                     throws
                     throw
                     thorws vs try&catch vs throw
                     Custom Exception

        Package name: day45_Exceptions
        warmup tasks:
        do 20 pushups

        throws: used for handling checked exceptions. indicates that the methods
                 throws an exception
                 MUST be used in method signature
                 public static void method() throws Exception
                 the caller of the method is responsible for handling the  exception

        we can throw multiple exception.
        order: child first, then parent

        throw: manually throwing the exception, DOES NOT HANDLE

        object: new ExceptionClass();
        throw Object;

        Ex:
        throw new RuntimeException();

        custom exception:

        how to create custom unchecked exception?
        A: by extending RunTimeException class

        how to create custom checked exception?
        A: by extending Exception class

             */
}
