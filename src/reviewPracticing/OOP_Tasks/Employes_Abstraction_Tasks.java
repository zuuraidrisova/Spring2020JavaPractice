package reviewPracticing.OOP_Tasks;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class Employes_Abstraction_Tasks {
    /*
    	Task02:
		1. create an abstract class called Employee
				attributes: name, age, gender, salary, jobtitle
				methods:
						abstract methods: work()
						instance method: toString()
		2. create two sub classes of the Employee:
									1. Tester
									2. Developer
					each class MUST have constructors to initialize the attributes
     */

    public String name;
    public int age;
    public char gender;
    public double salary;
    public String jobTitle;

    public abstract void work(int hours);

    @Override
    public String toString(){

        return name + " "+age+" "+gender+" "+salary+" "+jobTitle;
    };
}

class Test extends Employes_Abstraction_Tasks{

    public Test(String name, int age, double salary, char gender, String jobTitle){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void work(int hours ){

        System.out.println(name+" works "+hours);
    }
}

class Develop extends Employes_Abstraction_Tasks{

    public Develop(String name, int age, double salary, char gender, String jobTitle){

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void work(int hours){

        System.out.println(name+" works "+hours);
    }

}

class EmpObjects{

    public static void main(String[] args) {

        Test t = new Test("Zuura",31,100000,'F',"SDET");

        System.out.println(t);
        t.work(8);

        Develop d = new Develop("Sary",30,100000,'M',"Developer");

        System.out.println(d);
        d.work(9);
    }
}