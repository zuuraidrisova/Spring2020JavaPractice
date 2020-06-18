package day48_AbstractionInterface;

public class Iphone2 extends Phone2 {

    static{// static block is used to initialize static variables
        brand = "Iphone";
    }
    public Iphone2(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;


    }

    public void faceTiming(long phoneNumber){

        System.out.println(brand+" is facetiming "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber){

        System.out.println(brand+" is calling "+phoneNumber);
    }

    public void texting(long phoneNumber){

        System.out.println(brand+" is texting "+phoneNumber);
    }


}
