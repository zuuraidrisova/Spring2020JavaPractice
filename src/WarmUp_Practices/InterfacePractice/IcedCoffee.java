package WarmUp_Practices.InterfacePractice;

public class IcedCoffee implements Drinkable {

    /*
    4. create another class called IceCoffee  that can inherit from Drinkable
				variable: size
				method: toString()

			create constructor that can set the size

	fix any error might come up
     */

    public String size;


    public IcedCoffee(String size){

        this.size = size;
    }


    @Override
    public void drink(){

        System.out.println("drinking "+size);
    }


    public String toString(){

        return size;
    }

    @Override
    public void eat() {

        System.out.println("eating");
    }

}
