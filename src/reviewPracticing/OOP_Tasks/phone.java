package reviewPracticing.OOP_Tasks;

public abstract class phone {
    /*
         Warmup tasks:
        1. create an abstract class called Phone
        attributes: brand, model, price, size
        abstract methods: calling(), texting()
        instance method: toString()
        2. create the following subclasses of phone:
        1. iPhone
        2. Samsung
        create constructors in each sub class that can initialize the
        instance variables
     */

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void call(int phoneNumber);

    public abstract void text(int phoneNumber);

    public String toString(){

        return brand+" "+model+" "+price+" "+size;
    }
}

final class Samsung extends phone{


    static {

        brand = "Samsung";
    }
    public Samsung(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void call(int phoneNumber) {

        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }

    @Override
    public void text(int phoneNumber) {

        System.out.println(brand+" "+model+" is texting  "+phoneNumber);

    }
}

final class Iphone extends phone{


    static {

        brand = "Iphone";

    }
    public Iphone(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void call(int phoneNumber){

        System.out.println(brand+" "+model+" is calling "+phoneNumber);

    }

    @Override
    public void text(int phoneNumber){

        System.out.println(brand+" "+model+" is texting "+phoneNumber);

    }
}

class PhoneObjects{

    public static void main(String[] args) {

        Samsung samsung = new Samsung("wp",730,"medium");

        samsung.call(9322232);
        samsung.text(2018093);
        System.out.println(samsung);

        System.out.println("= ======================================= =");
        Iphone iphone = new Iphone("xr",750,"small");

        iphone.call(3275113);
        iphone.text(4373323);
        System.out.println(iphone);


    }

}