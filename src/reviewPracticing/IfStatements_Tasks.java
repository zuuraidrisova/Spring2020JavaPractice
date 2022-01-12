package reviewPracticing;

public class IfStatements_Tasks {

     /*
    1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
    Write a program that declares three integers as angles and check whether a triangle is valid or not.

	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)

	3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)

	4. write a java program that accepts three numbers and return the median number
				(assume that none of them are equal)

	5. write a java program that can identify if a person is eligible to vote for Donald Trump
	Note : use single if statements
     */


    public static void main(String[] args) {

        /*
   A triangle is valid if the sum of all the three angles is equal to 180 degrees.
    Write a program that declares three integers as angles
     and check whether a triangle is valid or not.
         */

        short angle1 = 30;
        short angle2 = 60;
        short angle3 = 9;

        int sumOfAngles = angle1 + angle2 + angle3;
        int validTriangle = 180;

        if(sumOfAngles == validTriangle){

            System.out.println("It is valid triangle");
        }else{

            System.out.println("It is not valid triangle");
        }


        /*
        2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
         */

        int num1 = 30;
        int num2 = 5;
        int num3 = 15;

        if(num1 > num2 && num1 > num3){

            System.out.println(num1 + " is the max number");

        }else if (num2 > num1 && num2 > num3){

            System.out.println(num2 + " is the max number");

        }else{

            System.out.println(num3 + " is the max number");
        }


        /*
        3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
         */

        if(num1 < num2 && num1 < num3){

            System.out.println(num1 +" is the min number");

        }else if(num2 < num1 && num2 < num3){

            System.out.println(num2+" is the min number");

        }else{

            System.out.println(num3+ " is the min number");
        }

        /*
        4. write a java program that accepts three numbers and return the median number
				(assume that none of them are equal)
         */

        boolean xMedian = (num1 < num2 && num1 > num3) || (num1 > num2 && num1 < num3);
        boolean yMedian = (num2 < num1 && num2 > num3) || (num2 > num1 && num2 < num3);
        boolean zMedian = (num3 < num1 && num3 > num2) || (num3 > num1 && num3 < num2);

        if(xMedian){

            System.out.println(num1+" is a median number");

        }else if(yMedian){

            System.out.println(num2+" is a median number");
        }else if(zMedian){

            System.out.println(num3+" is a median number");

        }else{

            System.out.println("Invalid entry");
        }


        /*
        5. write a java program that can identify if a person is eligible to vote for Donald Trump
	Note : use single if statements
         */

        int age = 21;

        if(age >= 18){

            System.out.println("u r eligible to vote for DT");
        }else{

            System.out.println("u r not eligible to vote for DT");
        }

        /*
        warmup task:
	1. write a java program that converts gallons to liters
	 					1 gallon = 3.785 liters
	 					1 litter = 1 * 3.785

	2. write a java program that converts litters to gallons
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785
         */

        double gallon = 3;
        double liters = gallon * 3.785;

        System.out.println(gallon +" is equal to "+ liters);

        double litersToGallons = 9;
        double gallons = litersToGallons / 3.785;

        System.out.println(litersToGallons+" is equal to "+ gallons);

       /*
           1.  write a program that can check the equality of the three given
    numbers
    declare 3 numbers n1, n2, n3
    if n1 and n2 are equal  => n1&n2 are equal
    if n2 and n3 are equal ==> n2&n3 are equal
    if n3 and n1 are qual ==>n3&n1 are equal
    if all equal ==> all equal
    if none of them are euqal ==> none of them
    are equal
        */
        int n1 = 10;
        int n2 = 25;
        int n3 = 25;

        if(n1 == n2 && n1 != n3){

            System.out.println(n1 + " and "+ n2+" are equal");

        }else if(n2 == n3 && n2 != n1){

            System.out.println(n2 + " and "+ n3+" are equal");

        }else if(n3 == n1 && n3 != n2){

            System.out.println(n1 + " and "+ n3+" are equal");

        }else if(n1 == n2 && n2 == n3 && n1 == n3){

            System.out.println("All numbers are equal");

        }else if(n1 != n2 && n2 != n3 && n1 != n3){

            System.out.println("All numbers are not equal");
        }else{

            System.out.println("Invalid entry");
        }



       /*

    2. write a program that can find the number of days in a month
     (Assume that Feb has 28 days)
     byte month =  3
    28 days: 2
    30 days: 4,6,9,11
    31 days: 1,3,5,7,8,10,12
        */

       byte month = 3;

       boolean a = month == 2;
       boolean b = month == 4 || month == 6 || month == 9 || month == 11;
       boolean c = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

       if (a){

           System.out.println("This month has 28 days");

       }else if(b){

           System.out.println("This month has 30 days");

       }else if(c){

           System.out.println("This month has 31 days");

       }else{

           System.out.println("It is invalid month");
       }


       // identify if a number is a positive number

        int number = 2;

       if(number >= 0){

           System.out.println(number + " is a positive number");
       }else{

           System.out.println(number + " is a negative number");
       }


       //identify if a number is even or odd

        int number1 = 5;

       if(number1 % 2 == 0){

           System.out.println(number1+" is even number");

       }else{

           System.out.println(number1+" is odd number");
       }


       //identify if a person can buy vodka

        int actualAge = 16;
        int ageForVodka = 21;

        if(actualAge < ageForVodka){

            System.out.println("You cannot buy vodka");

        }else{//otherwise

            System.out.println("You can buy vodka");
        }


        //identifying student score as A, B,C,D, F

        int score = 88;

        boolean gradeA = score >= 90 && score <= 100;
        boolean gradeB = score >= 85 && score < 90;
        boolean gradeC = score >= 70 && score < 80;
        boolean gradeD = score >= 60 && score < 70;

        if(gradeA){

            System.out.println("A");

        }else if(gradeB){

            System.out.println("B");

        }else if(gradeC){

            System.out.println("C");

        }else if (gradeD){

            System.out.println("D");

        }else{

            System.out.println("F");
        }


        //above task using char

        char grade = ' ';

        if (gradeA){

            grade = 'A';

        }else if(gradeB){

            grade = 'B';

        }else if(gradeC){

            grade = 'C';

        }else if(gradeD){

            grade = 'D';

        }else{

            grade = 'F';

        }

        System.out.println("grade = " + grade);


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

         String result = "";

         int days = 8;

         if(days == 1){

             result = "January has 31 days";

         }else if(days == 2){

             result = "February has 28 days";

         }else if(days == 3){

             result = "March has 31 days";

         }else if( days == 4){

             result = "April has 30 days";

         }else if(days == 5){

             result = "May has 31 days";

         }else if( days == 6){

             result = "June has  30 days";

         }else if(days == 7){

             result = "July has 31 days";

         }else if(days == 8){

             result = "August has 31 days";

         }else if( days == 9){

             result = "September has 30 days";

         }else if(days == 10){

             result = "October has 31 days";

         }else if(days == 11){

             result = "November has 31 days";

         }else if( days == 12){

             result = "December has 31 days";

         }else{

             result = "Invalid month";

         }

        System.out.println(result);

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

                 int agePerson = 12;
                 String ageGroup = "";

                 if(agePerson <  3 && agePerson > 0){

                     ageGroup = "Baby";

                 }else if(agePerson >= 3 && agePerson <= 5){

                     ageGroup = "Toddler";

                 }else if(agePerson >= 6 && agePerson <= 9){

                     ageGroup = "Kid";

                 }else if(agePerson >= 10 && agePerson <= 12){

                     ageGroup = "Pre-Teen";

                 }else if(agePerson >= 13 && agePerson <= 17){

                     ageGroup = "Teenager";

                 }else if(agePerson >= 18 && agePerson <= 20){

                     ageGroup = "Young Adult";

                 }else if(agePerson >= 21 && agePerson <= 39){

                     ageGroup = "Adult";

                 }else if(agePerson >= 40 && agePerson <= 49){

                     ageGroup = "Young Middle Aged Adult";

                 }else if(agePerson >= 50 && agePerson <= 54){

                     ageGroup = "Middle Aged Adult";

                 }else if(agePerson  >= 55 && agePerson <= 64){

                     ageGroup = "Very Young Senior Citizen";

                 }else if(agePerson >= 65 && agePerson <= 74){

                     ageGroup = "Young Senior Citizen";

                 }else if(agePerson >= 75 && agePerson <= 84){

                     ageGroup = "Senior Citizen";

                 }else if(agePerson >= 84 && agePerson <= 120){

                     ageGroup = "Old Senior Citizen";

                 }else{

                     ageGroup = "Invalid Entry";
                 }

        System.out.println("ageGroup = " + ageGroup);


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

        int code = 202;
        String message = "";

        if(code == 200){

            message = "Ok";

        }else if(code == 201){

            message = "Created";

        }else if(code == 202){

            message = "Accepted";

        }else if(code == 301){

            message = "Moved Permanently";

        }else if(code == 303){

            message = "See Other";

        }else if(code == 304){

            message = "Not Modified";

        }else if(code == 307){

            message = "Temporary Redirect";

        }else if(code == 400){

            message = "Bad Request";

        }else if(code == 401){

            message = "Unauthorized";

        }else if(code == 403){

            message = "Forbidden";

        }else if(code == 404){

            message = "Not Found";

        }else if(code == 410){

            message = "Gone";

        }else if(code == 500){

            message = "Internal Server Error";

        }else if( code == 503){

            message = " Service Unavailable";

        }else{

            message = "Invalid Entry";

        }

        System.out.println("message = " + message);

    }

}

