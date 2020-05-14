package OfficeHours.Practice_05_13_2020;

public class Instances {

    /*

    CLASS AND OBJECT

    instances: belong to object, each object has its own copy of instances, created outside {}
            variables
            methods
            blocks

            { ==> instance block is used to initialize instance variables



            this ==> keyword is used only in instance variables, to refer to objects

     static: class member, has one copy shared by all objects
            variables
            methods
            block
     */

    String name;

    {
        name = "Zuura";
    }

    public void printName(){

        System.out.println("Name is : "+this.name);

    }

}
