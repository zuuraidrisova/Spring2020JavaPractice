package OfficeHours.ClassObjectPractice;

public class Date {

    // The private instance variables
    private int year;
    private int month;
    private int day;


    /** Constructs a Date instance with the given year, month and day. No input validation */

    public Date(int year, int month, int day) {

        this.year = year;
        this.month = month;
        this.day = day;


    }

    // The public getters/setters for the private variables
    /** Returns the year */
    public int getYear(){

        return this.year;
    }
    //returns the month
    public int getMonth(){

        return this.month;
    }
    //returns the day
    public int getDay(){

        return this.day;
    }
    /* Sets the year. No input validation */

    public void setYear(short year){

       this.year = year;
    }
    //sets the month
    public void setMonth(int month){

        this.month = month;
    }
    //sets the day
    public void setDay(byte day){

        this.day =day;
    }
    /* Returns a descriptive String in the form "MM/DD/YYYY" with leading zero */
    public String toString(){

        return "Year: "+year+", month: "+month+", day: "+day;
    }
    //Sets year, month and day.
    public void setDate(short year, int month, byte day){

        this.year = year;
        this.month = month;
        this.day = day;

    }

}

class DateObject{

    public static void main(String[] args) {

        // Test constructor and toString()

       Date date1 = new Date(2020,5,13);

        System.out.println(date1);


    }
}