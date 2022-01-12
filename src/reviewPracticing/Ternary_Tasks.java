package reviewPracticing;

public class Ternary_Tasks {

    public static void main(String[] args) {

        int num1 = 45;
        int num2 = 78;

        int maxNumber = (num1 >  num2) ? num1 : num2;

        System.out.println("maxNumber = " + maxNumber);

        System.out.println("=======================");

        String str = "";

        str = true ? "Hello" : "Hola";

        System.out.println("str = " + str);

        System.out.println("=======================");

        //which one is greater

        String result = (9 > 10) ? "9 is greater" : "10 is greater";

        System.out.println("result = " + result);

        System.out.println("=======================");

        //even or odd number

        int num = 100;

        String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("evenOrOdd = " + evenOrOdd);

        System.out.println("=======================");

        //can buy alcohol

        int age = 13;

        String eligible = (age >= 21) ? "You can buy alcohol" : "You cannot buy alcohol";

        System.out.println("eligible = " + eligible);

        System.out.println("=======================");
        //u can vote

        boolean citizenship = true;

        String canVote = (citizenship) ? "You can vote" : "You cannot vote";

        System.out.println(canVote);

        System.out.println("=======================");

         /*
        write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
         */

         int ages = 6;

         String group = (ages < 3) ? "Baby" :  (ages >= 3 && ages <= 5) ? "Toddler":

                 (ages >= 6 && ages <= 9)? "Kid" :(ages >= 10 && ages <= 12) ?"Pre-teen":

                 (ages >= 13 && ages <= 17)?"Teenager" : (ages >= 18 && ages <= 20)?"Young Adult":

                 (ages >= 21 && ages <= 39)?"Adult": (ages >= 40 && ages <= 49) ?"Young Middle-Aged Adult" :

                  (ages >= 50 && ages <= 54) ?"Middle Aged Adult":(ages <= 55 && ages <= 64)?"Very Young Senior Citizen":

                  (ages >= 65 && ages <= 74 )?"Young Senior Citizen":(ages >= 75 && ages <= 84)?"Senior Citizen":

                   (ages >= 85 && ages <= 120)?"Old Senior Citizen" : "Invalid Age";


        System.out.println("group = " + group);

            /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */

            int agePerson = 150;

        String output = "";

        if( !(agePerson < 0 || agePerson > 150)) {

              output  = (agePerson < 21) ? "Teenager" :

                        (agePerson >= 21 && agePerson < 55) ? "Adult" :

                        (agePerson >= 55 && agePerson <= 120) ? "Senior" : "Invalid";
            }else{

            System.out.println("Invalid Entry");
        }

        System.out.println(output);


                /*
     1 Jan - 31
    2 Feb - 28
    3 Mar - 31
    4 Apr - 30
    5 May - 31
    6 Jun - 30
    7 Jul - 31
    8 Aug - 31
    9 Sep - 30
    10 Oct - 31
    11 Nov - 30
    12 Dec - 31
    2. write a program that can find the number of days in a month
            (Assume that Feb has 28 days)
                byte month =  3
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12

         */

        byte month = 3;

        String output2 = (month == 1) ? "January has 31 days" : (month == 2) ? "February has 28 days":
                (month == 3)?"March has 31 days":(month == 4)?"April has 30 days":
                        (month == 5)?"May has 31 days":(month == 6)?"June has 30 days":
                                (month == 7)?"July has 31 days":(month == 8)?"August has 31 days":
                                        (month == 9)?"September has 31 days":(month == 10)?"October has 31 days":
                                                (month == 11)?"November has 31 days":(month == 12)?"December has 31 days":"Invalid month";

        System.out.println("output = " + output2);

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


     int code =  301;

     String message = (code == 200)?"OK":(code == 201)?"Created":(code == 202)?"Accepted":
             (code == 301)?"Moved Permanently":(code == 303)?"See other":
             (code == 304)?"Not Modified":(code == 307)?"Temporary Redirect":
             (code == 400)?"Bad Request":(code ==401)?"Unauthorized":
             (code == 403)?"Forbidden":(code == 404)?"Not Found":
             (code == 410)?"Gone":(code == 500)?"Internal Server Error":
             (code ==503)?"Service Unavailable":"Invalid code";

        System.out.println("message = " + message);


        //identifying student score as A, B,C,D, F

        int score = 66;

        String grade = "";

        if(!(score < 0 || score > 100)){

            grade = (score >= 90 && score <= 100)?"A":
                    (score >= 80 && score < 90)?"B":
                    (score >= 70 && score < 80)?"C":
                     (score >= 50 && score <70)?"D":"F";

        }else{

            grade = "Invalid score";
        }

        System.out.println("grade = " + grade);


        //greet depending on the time of day

        int time = 13;

        String greeting = (time < 12)?"Good morning":(time > 12 && time < 18)?"Good afternoon":"Good evening";

        System.out.println("greeting = " + greeting);


        //divisible by 3 & 5

        int n = 1503;

        boolean b = (n % 3 == 0 && n % 5 == 0)? true : false;

        System.out.println("b = " + b);


    }

}
