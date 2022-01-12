package day44_Exceptions;

public class Day44_notes {
            /*
            05/27/2020
        Topics: Exceptions
        package name: day44_Exceptions

        warmup task:

        1. create a class called Browsers
        actions: openBrowser():prints "opens the default browser"
        closeBrowser(): closes the default browser
        2. create a class called ChromeBrowser
        actions: openBrowser(): opens the chrome browser
        closeBrowser(): closes the chrome browser
        3. creata a class called FirefoxBrowser
        actions: openBrowser(): opens the Firefox browser
        closeBrowser(): closes the Firefox browser
        4. create a class called Opera browser
        actions: openBrowser(): opens the Opera browser
        closeBrowser(): closes the Opera browser
        5. create a class called Test:
        create an object of each browsers and call the openBrowser &
        closeBrowser actions
        create all those classes in one java file

        Exceptions topic:
            unchecked & checked exception
            try & catch blocks
            multi-catch blocks
            finally block
            throws
            throw
            Custom Exception

        next topic: final keyword

        Exceptions: unexpected or unwanted events

                    there two types of exception:

         unchecked (unexpected event): occures during run time
         RuntimeException class is the parent of all exceptions

        checked (unwanted events): occurs during the
        compile time. needs to be handled IMMEDIATELY

        exception handling: try & catch: blocks, used for handling the exception

        try{

            exception statements/code

        }catch(ExceptionClass  VariableName){

        }


        printStackTrace(): prints the stack trace of exception
        getMessage(): description of exception

        try{

        }catch(Runtime){

        }catch(Arithmetic){

        }
        ...
        multi-catch block: parent exception class CANNOT be placed before its child exception

        finally: always gets executed regardless of the exception

        try{

        }catch(){

        }finally{

        }

        Task:
        1. Write a method called "wait" that causes the current executing
        thread to sleep for the specific number of seconds
             parameters: double seconds
        HINT: Thread.sleep()
        Thread.sleep(long millisecond): makes the currecnt execution thread to
        wait for specific amount of time
     */
}
