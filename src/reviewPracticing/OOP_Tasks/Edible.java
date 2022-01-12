package reviewPracticing.OOP_Tasks;

import WarmUp_Practices.InterfacePractice.IcedCoffee;

public interface Edible {
    /*

    Task01:
	1. create an interface named Edible
			abstract method: eat();

	2. create an interface named Drinkable that can inherit from Edible
			abstract method: drink();

	3. create a class named Burger that can inherit from Edible
			variables: name, size
			method: toString();

			create a constructor that can initialize instance variables

	4. create another class called IceCoffee  that can inherit from Drinkable
				variable: size
				method: toString()

			create constructor that can set the size

	fix any error might come up
     */

    public abstract void eat();


}

interface Drinkable extends Edible{

    public abstract void drink();

}

class Burger implements Edible{

    public String name;
    public String size;

    public Burger(String name, String size){

        this.name = name;
        this.size = size;

    }

    @Override
    public void eat(){

        System.out.println("eating "+name+" of size "+size);
    }

    public String toString(){

        return name+" "+size;
    }
}

class IceCoffee implements Drinkable{

    public String size;

    public IceCoffee(String size){

        this.size = size;

    }

    @Override
    public void eat(){

    }

    @Override
    public void drink(){

        System.out.println(size);
    }

    public String toString(){

        return size;
    }
}