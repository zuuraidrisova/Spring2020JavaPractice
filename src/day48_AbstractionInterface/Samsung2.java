package day48_AbstractionInterface;

public class Samsung2 extends Phone2{

    static {

        brand = "Samsung";
    }

    public Samsung2(String model, String size, double price){

        this.model = model;
        this.size = size;
        this.price = price;

    }

    @Override
    public void calling(long phoneNumber){

        System.out.println(brand+" is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber){

        System.out.println(brand+" is texting "+phoneNumber);
    }

    public void freezing(){

        System.out.println("Samsung is freezing  when using ");
    }

}
