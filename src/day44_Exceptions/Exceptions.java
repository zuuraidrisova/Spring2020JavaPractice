package day44_Exceptions;

public class Exceptions {

    /*
    Agenda:

    Exceptions:

       =>    unchecked and checked exceptions

       =>   try and catch block

       =>   multi catch block

       =>   finally block

       =>    throws and throw

ArrayIndexOutOfBoundsException. ...
ClassNotFoundException. ...
FileNotFoundException. ...
IOException. ...
InterruptedException. ...
NoSuchFieldException. ...
NoSuchMethodException.

        There are two types of exceptions:

       1. unchecked: unexpected event ==> occurs only when you run, so during runtime exceptions,
       compile is ok with it, because it does not show up until we run

       Runtime exception is parent of all unchecked exceptions, only occurs during runtime

      2. checked: unwanted event ==> occurs while we write the code, it does not compile,
      compile is not ok with it, wants us to correct it right away

      during compile time,  needs to be handled immediately


      Exception Handling:

            try and catch block {}:  can handle both checked and unchecked exceptions

            MUST be declared together, try must always have catch, together only

            when we are not sure about our code, we can use try and catch

            try{

                ==> to store exception code

            }catch(ExceptionClass variableName){



            }

    Try block gets executed for all checked exceptions

    Catch block gets executed for all unchecked exceptions


    printStackTrace(); ==> used for printing the stack trace of the exception

    getMessage(); ==> used for printing description of the exception


        multi-Catch block:

        try{ ==> tries to fix, if not it will jump to first catch block

        //the exception code

        }catch(){ ==> it will catch if it can handle,


        }catch(){ ==>if first catch cannot handle, it will jump to the next catch

        }


        //parent exception cannot come before child exception, it should always come after

        finally block:

            finally block will get executed regardless of the exception
            no matter what, whether it is handled or not, finally will run

            always needs to have try and catch blocks before finally

            finally must come after all try block and catch block


     */
}
