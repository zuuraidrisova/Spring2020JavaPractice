package day40_Encapsulation;

public class Encapsulation {

    /*
    Encapsulation ==> hiding instance variables==> marking them private

    private ==> makes limited access to its variables

    methods getter and setter ==> can help us access private data

    getter ==> read only or access data, returns private data
    setter ==> write only, change or set data

    these get and set methods should always be public

    getter and setter should always  be generated only in same class
                where private data is declared
     */

    private long SSN;

    //getter is for reading other private data
     public long getSSN(){

        return SSN;

    }
    //setter is for modifying private data or setting private data
    // void is return type because we dont want to return anything,
    // we just want to set value

    public void setSSN(long SSN){ // when we set value, we need external info
        //so we mainly pass parameter
        this.SSN = SSN;
    }

}
