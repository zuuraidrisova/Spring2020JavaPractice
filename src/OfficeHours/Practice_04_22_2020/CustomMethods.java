package OfficeHours.Practice_04_22_2020;

public class CustomMethods {

    /*
    Methods are grouping block of codes to create functions that perform certain actions

    declare methods: Method must be declared in the class but not in MAIN method, or inside any other method

    AccessModifier  specifier   return type  methodName (parameter){

        Statements;

    }
       AccessModifiers : public ==> visible to everyone

       Specifier : static ==> can be called thru class name

       Return Type:   void ==>  no data will be returned
                      any data type ==> value returned can be assigned to a new variable so it is reusable

                      data type ==> must return value

      Parameter :   external info to complete method's functions

     */

    public static void eligibleToVote(boolean citizenship, int age){

        if(citizenship == true && age > 18){

            System.out.println("You are eligible to vote!");
        }else{

            System.out.println("You are not eligible to vote!");
        }

    }

}
