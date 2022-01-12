package reviewPracticing;

public class Switch_Tasks {

    public static void main(String[] args) {

         /*
        2. write a program that can display the days based on the numbers 1 ~ 7
        MUST USE SWITCH
        precondition: valid number for the day
        */

         int day = 5;

         String output = "";

         if(day >= 1 && day <= 7){

             switch (day){

                 case 1:
                     output = "Monday";
                     break;
                 case 2:
                     output = "Tuesday";
                     break;
                 case 3:
                     output = "Wednesday";
                     break;
                 case 4:
                     output = "Thursday";
                     break;
                 case 5:
                     output = "Friday";
                     break;
                 case 6:
                     output = "Saturday";
                     break;
                 case 7:
                     output = "Sunday";
                     break;
                 default:
                     output = "Invalid day of week";
                     break;
             }

         }else{

             output = "Invalid entry";

         }

        System.out.println("output = " + output);

         /*
        3. write a java program that can convert numbers between 0 ~ 9 to
        words, if the number is greater than 9 or less than zero, out put
        should be "Invalid".
         */

         int number = 3;

         String word = "";

         if(number >= 1 && number <= 9){

             switch (number){

                 case 1:
                     word = "One";
                     break;
                 case 2:
                     word = "Two";
                     break;
                 case 3:
                     word = "Three";
                     break;
                 case 4:
                     word = "Four";
                     break;
                 case 5:
                     word = "Five";
                     break;
                 case 6:
                     word = "Six";
                     break;
                 case 7:
                     word = "Seven";
                     break;
                 case 8:
                     word = "Eight";
                     break;
                 case 9:
                     word = "Nine";
                     break;
                 default:
                     word = "It is wrong number";
                     break;
             }

         }else{

             word = "It is invalid number";

         }

        System.out.println("word = " + word);

                                    /*
    200, OK
    201, Created
    202, Accepted
    301, Moved Permanently
    303, See Other
    304, Not Modified
    307, Temporary Redirect
    400, Bad Request
    401, Unauthorized
    403, Forbidden
    404, Not Found
    410, Gone
    500, Internal Server Error
    503, Service Unavailable
             */


        int code = 404;
        String message = "";

        switch (code){

            case 200:
                message = "OK";
                break;
            case 201:
                message = "Created";
                break;
            case 202:
                message = "Accepted";
                break;
            case 301:
                message ="Moved Permanently";
                break;
            case 303:
                message = "See other";
                break;
            case 304:
                message = "Not modified";
                break;
            case 307:
                message = "Temporary Redirect";
                break;
            case 400:
                message = "Bad Request";
                break;
            case 401:
                message = "Unauthorized";
                break;
            case 403:
                message = "Forbidden";
                break;
            case 404:
                message = "Not Found";
                break;
            case 410:
                message = "Gone";
                break;
            case 500:
                message = "Internal Server Error";
                break;
            case 503:
                message = "Service unavailable";
                break;
            default:
                message="Invalid code";
                break;

        }

        System.out.println("message = " + message);


        //§Create a new switch statement using char instead of int.
        //§Create a new char variable
        //§Create a switch statement testing for A, B, C, D or E
        //§Display a message if any of these are found and then break
        //§Add a default which displays a message saying not found.

        char ch = 'B';
        String result = "";

        switch (ch){

            case 'A':
                result = "A";
                break;

            case 'B':
                result = "B";
                break;

            case 'C':
                result = "C";
                break;

            case 'D':
                result ="D";
                break;

            case 'E':
                result = "E";
                break;

            default:
                result = "Invalid";
                break;

        }

        System.out.println("result = " + result);


        /*
 3. write a program that can display the selected browser
  1. declare a String variable called browserName
 2. Assume that the valid browsers are: chrome, firefox, opera, safari.
 3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
 Note: Do Not use scanner or if statement or ternary for this task
 */
        String browser = "Chrome";

        switch (browser){

            case "Firefox":
                System.out.println("Firefox is opening");
                break;

            case "Safari":
                System.out.println("Safari is opening");
                break;
            case "Opera":
                System.out.println("Opera is opening");
                break;
            case "IE":
                System.out.println("IA is opening");
                break;
            case "Chrome":
                System.out.println("Chrome is opening");
                break;
            default:
                System.out.println("Invalid browser name");
                break;
        }
    }
}
