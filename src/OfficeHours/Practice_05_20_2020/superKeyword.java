package OfficeHours.Practice_05_20_2020;

public class superKeyword {
    /*

    super:  refers to object instances

    super(): to call super class constructor

    only a constructor can call another constructor

    1. at least one parent class constructor must be called in child class
    2. parent class default constructor  is called automatically, by default
    3. parent class constructor with prmtrs is called manually
    4. constructor must be called at first step
    5. constructor call is one at a time

     */
    public superKeyword(int a){

        System.out.println("A");
    }
}
class Constructor extends superKeyword{

    public Constructor(){

        super(10);//calling parent class constructor
        //if parent class constructor  is default, it is called automatically

        System.out.println("B");

    }

    public static void main(String[] args) {

        Constructor obj = new Constructor(); //  AB


    }

}