package reviewPracticing.OOP_Tasks;


public class Device {
     /*
    create a class called device:
				attributes: brand, model, price, country, type,size
				methods: toString, setInfo

				one class can extend only one class
				one class can be inherited by multiple subclasses
     */

     public String brand;
     public String model;
     public double price;
     public String country;
     public String color;
     public String size;

     public void setDeviceInfo(String brand, String model, double price,
                               String country, String color, String size){

         this.brand = brand;
         this.model = model;
         this.price = price;
         this.country = country;
         this.size = size;
         this.color = color;

     }

     public String toString(){


         return "Brand: "+brand+", Model: "+model+", Price: "+price+
                 ", Country: "+country+", Color: "+color+", Size: "+size;
     }

}

class Phone extends Device{

      /*
    create sub class called phone:
				attributes: brand, model, price, country inherited all
				methods: call, text, constructor should be declared

				toString is inherited

				phone is a device relationship

     */

      public Phone(String brand, String model, double price, String country, String color,String size){

          setDeviceInfo(brand,model,price,country,color,size);
      }

     public void call(long number){

        System.out.println(brand+" "+model+" is calling "+number);
    }

    public void text(long number){

        System.out.println(brand+" "+model+" is texting "+number);
    }

}

class PhoneObject{

    public static void main(String[] args) {

        Phone phone = new Phone("Iphone","XR",800,"USA","gold","medium");

        System.out.println("phone = " + phone);

        phone.call(39829327);
        phone.text(382112);
    }
}

class TV extends Device{

      /*
    create a class called TV:

				attributes: brand, model, price, country, type, size inherited all
				setDeviceInfo() is inherited
				methods: watch no inherited, should be declared

                Constructor() to initialize variables, cannot be created in super class
                because constructor should have same name as class
				method toString inherited

				TV is a device relationship
     */

      public void watch(){

          System.out.println(brand+" "+model+" watching");
      }

    public TV(String brand, String model, double price, String country, String color,String size){

        setDeviceInfo(brand,model,price,country,color,size);
    }

}

class TVObjects{

    public static void main(String[] args) {

       TV tv = new TV("Vizio","Classic",200, "China","black","small");

        System.out.println(tv);

        tv.watch();
    }
}