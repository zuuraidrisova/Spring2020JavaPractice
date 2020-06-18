package day48_AbstractionInterface;

public abstract  class Phone {
    /*
    Warmup tasks:
	1. create an abstract class called Phone
			attributes: brand, model, price, size
			abstract methods: calling(), texting()
			instance method: toString()
	2. create the following subclasses of phone:
						1. iPhone
						2. Samsung
			create constructors in each sub class that can initialize the instance variables
     */
    public String brand;
    public String model;
    public double price;
    public String size;


    public abstract void calling(long phoneNumber);

    public abstract void texting(long phoneNumber);

    public String toString(){

        return brand+" "+model+" "+price+" "+size;

    }

}

class Iphone extends Phone{

    public Iphone(String brand, String model, double price, String size){

        this.model = model;
        this.brand = brand;
        this.price = price;
        this.size = size;
    }
    @Override
    public void calling(long phoneNumber){

        System.out.println(phoneNumber+" calling");
    }
    @Override
    public void texting(long phoneNumber){

        System.out.println(phoneNumber+" texted");
    }


}

class Samsung extends Phone{

    public Samsung(String brand, String model, double price, String size){

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;

    }
    @Override
    public void calling(long phoneNumber) {

        System.out.println(phoneNumber+" calling");
    }

    @Override
    public void texting(long phoneNumber) {

        System.out.println(phoneNumber+" texted");
    }
}