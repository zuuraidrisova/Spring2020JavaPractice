package day49_Ploymorphism_Intro;
/*
    1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
 */
interface Downloadable {

   public static final  boolean downloadable = true;
   //by default

    void download(); //public and abstract by default


}
/*
    1. create an interface named AndroidApps that can inherit from downloadable
    interface
            variable: AppStoreName

 */

interface AndroidApps extends Downloadable{ //2 variables and 1 method now

    String appStoreName = "Androids Store";//public static and final by default
           // when final we have to initialize right away

}
/*
    2. create an interface named AppleApps that can inherit from downloadable
     interface
            variable: AppStoreName
 */
interface AppleApps extends Downloadable{

    String appStoreName = "Apple Store";//public static and final by default
    // when final we have to initialize right away
}
/*
    3. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
            toString method
 */
public abstract class Phone{

    static String brand; //only one name
    String model;
    double price;
    String size;

    public abstract void texting(long phoneNumber);
    // it is mandatory to give abstract in abstract class

    public abstract void calling(long phoneNumber);

    public String toString(){

        return "brand = " + brand + ", model = " + model + ", price = " + price + ", size = " + size;
    }

}
/*
    4. create a class named iPhone that can inherit from AppleApps interface
    and Phone abstract class actions that every iphone can do: texting(),
     calling(), faceTiming(), selfie()
 */

 final class Iphone extends Phone implements  AppleApps{//we mark it final
                                                  //   it cannot be inherited

    static {

        brand = "Iphone";
    }

    public Iphone(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;
    }
    @Override
    public void download() {

        if(downloadable) {
            System.out.println(brand + " is downloading from " + appStoreName);
        }
    }
    @Override
    public void texting(long phoneNumber){

        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber){

        System.out.println(brand+" "+model+" calling "+phoneNumber);
    }
    public void facetiming(long phoneNumber){

        System.out.println(brand+" is facetiming "+phoneNumber);
    }
    public void selfie(){

        System.out.println(brand+ " is taking a  beatiful selfie");
    }


}
/*
   5. create a class named Nokia that can inherit from AndroidApps interface
            actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()
    in each sub classes of phone, create a constructor to initialize the instances
 */
final class Nokia extends Phone implements AndroidApps{

    static {

        brand = "Nokia";
    }

    public Nokia(String model, double price, String size){

      this.model = model;
      this.price = price;
      this.size = size;
    }
    @Override
    public void download() {

        System.out.println(brand+" is downloading from "+appStoreName);
    }

    @Override
    public void texting(long phoneNumber) {

        System.out.println(brand+" "+model+ " is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {

        System.out.println(brand+" "+model+ " is calling "+phoneNumber);
    }

    public void breakTheFloor(){

        System.out.println(brand+" breaks the floor");
    }

    public void freeze(){

        System.out.println(brand+ " freezes");
    }
}

class PhoneObjects{

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("XR", 830, "medium");

        System.out.println(iphone1);

        iphone1.calling(9112173);
        iphone1.texting(37261);
        iphone1.facetiming(821964);
        iphone1.selfie();
        iphone1.download();

        System.out.println("********************************************");

        Nokia nokia1 = new Nokia("Lumia", 69, "medium");

        System.out.println(nokia1);

        nokia1.texting(71364);
        nokia1.calling(81470);
        nokia1.download();
        nokia1.breakTheFloor();
        nokia1.freeze();
    }
}
