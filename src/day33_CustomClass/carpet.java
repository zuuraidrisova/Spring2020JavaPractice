package day33_CustomClass;

public class carpet {

    /*
    create a custom class for the carpet class that should contain the following:
    instance variables:
    width, length, unitPrice, isPersian (boolean)
    instance methods:
    customOrder(): sets the carpet' width, length, unitprice, & isParsian
    calcCost(): should be able to calculate the total cost of the carpet and return it as double
    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
    total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice


     */

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double cost;


    public void customerOrder(double wide, double len, double price, boolean persian ){

        width = wide;
        length = len;
        unitPrice = price;
        isPersian = persian;

    }

    public double calculateCost(){

      if(isPersian == true){

         return cost = (width + length) * unitPrice + 200;

      }else{

          return  cost = (width + length) * unitPrice;
      }

    }

    public String toString(){

     String result = "The carpet's width is "+ width + " and carpet's length is "

             + length + " and total price is $"+ calculateCost();

     return result;

    }

}
