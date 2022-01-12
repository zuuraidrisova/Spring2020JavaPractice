package day40_Encapsulation;
/*

creating an object:
        new Person(existing constructor);

 */

public class Person {

    String name;

    private long SSN;
    private int ID;

    public Person(String name){

        this.name = name;
    }

    public long getSSN(){

        return SSN;
    }

    public void setSSN(long SSN){

        this.SSN = SSN;
    }

    public int getID(){

        return ID;
    }

    public void setID(int ID){

        this.ID = ID;
    }

    public void setSSNAndID( long SSN, int ID){
       //it is possible to set both at once, but one by one is preferred
        setSSN(SSN);
        setID(ID);
    }

}

class PersonObject{

    public static void main(String[] args) {

        Person person1 = new Person("Zuura");

        System.out.println(person1.name);

        System.out.println(person1.name+"'s SSN: "+person1.getSSN());//here 0

        person1.setSSN(1236543);

        System.out.println(person1.name+"'s SSN: "+person1.getSSN());//here we set value

        person1.setID(90123);

        System.out.println(person1.name+"'s ID: "+person1.getID());

        System.out.println( "**********************************");

        Person person2 = new Person("Sary");

        person2.setSSNAndID(8296411, 90134);

        System.out.println(person2.name+"'s SSN: "+ person2.getSSN()

                +" and ID: "+person2.getID());

    }
}