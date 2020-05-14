package day38_Constructors;

import java.util.ArrayList;

public class Renters {

    /*
    Write a program for apartment rental. It should add and
    remove renters and calculate their bills
     */
    String name;
    int numberOfHousehold;
    int typeOfApt;
    int floor;
    String aptNum;


    int numOfBed;
    int rent;
    double waterBill;
    double electricBill;

    public Renters(String name, int numberOfHousehold, int typeOfApt, int floor, String aptNum){

        this.name = name;
        this.numberOfHousehold = numberOfHousehold;
        this.typeOfApt = typeOfApt;
        this.floor = floor;
        this.aptNum = aptNum;


    }

    public double getBillInfo(String name, int numOfBed, int rent, double waterBill, double electricBill){

        this.name = name;
        this.rent =  rent;
        this.numOfBed = numOfBed;
        this.waterBill = waterBill;
        this.electricBill = electricBill;



      return totalRentCOst();

    }
    public double totalRentCOst (){

        double total= waterBill + electricBill + rent;

        if (numOfBed == 2){

            total += 50;

        }else if (numOfBed > 2){

            total += 75;
        }
        return total;
    }

    public String toString(){
        return "Name: "+name+", Family members: "+numberOfHousehold +
                ", Type of Apt rented: "+typeOfApt+", Floor: "+floor;
    }


}
class RenterObjects{

    ArrayList<Renters> renters = new ArrayList<>();
    ArrayList<Renters> exRenters = new ArrayList<>();

    //Adding new Residents
    public void addRenters(Renters renter){

        renters.add(renter);
    }

    public void RentersMove(String aptNum1){

       exRenters.removeIf(p -> p.aptNum.equals(aptNum1));

    }

}

class apartment{

    public static void main(String[] args) {

        Renters renter1 = new Renters("Sary", 2,1,4 , "B414");
        Renters renter2 = new Renters("Chopa", 1,1,7,"B712");
        Renters renter3 = new Renters("Sarah", 4,3,5 , "B514");
        Renters renter4 = new Renters("Chuck", 3,2,9,"A717");

        System.out.println(renter1);
        System.out.println(renter2);

        RenterObjects list = new RenterObjects();

        list.addRenters(renter1);
        list.addRenters(renter2);
        list.addRenters(renter3);
        list.addRenters(renter4);



    }
}