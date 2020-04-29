package OfficeHours.Practice_11_03_2020;

public class Practice_Variables {

    public static void main(String [] args){
    /* brand,year,price,model,miles, color
        variables that are declared in a block,
        must be initialized before use
        or assigned a value
     */
    String brand = "BMW";
    int year = 2020;
    double price = 20000.5;
    String model = "x6";
    String color = "black";
    short miles = 32767;

    System.out.println("My favourite car is: " + brand);
    System.out.println("My car's year is: "+ year);
    System.out.println("I bought it for: "+ price);
    System.out.println("The model of my car is: " + model);
    System.out.println("The color of my car is: "+ color);
    System.out.println("The mileage of my car is: "+miles);

    System.out.println("The vehicle "+ year+", " +brand+", "+ model+", "+"has "+ miles+", "+"and price is "+ price +"$");


    }
}
