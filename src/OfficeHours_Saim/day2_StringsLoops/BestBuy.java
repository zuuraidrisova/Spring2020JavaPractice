package OfficeHours_Saim.day2_StringsLoops;

public class BestBuy {

        String EmployeeName;
        String location;
        int phoneNumber;
        int numberOfPeople;
        static int numberOfComputers;


    void close(){

        System.out.println("This best buy is closed");

    }

}
class BestBuyStores{


    public static void main(String[] args) {

        //           new  == > memory allocation
        BestBuy store1 = new BestBuy();
    //class  refVariable     object

        store1.numberOfComputers = 10;
        store1.numberOfComputers --;

        System.out.println( BestBuy.numberOfComputers --);

        store1.close();








    }
}