package reviewPracticing;

public class ConstructorCalls_Tasks {
    /*
            1. create a class called Car:
        instance variable:
        brand, model, year, price
        add a constructor that can initialize brand of car
        add a constructor that can initialize brand and model of
        the car
        (apply constructor call to initalize the
        brand)
        add a constructor that can initialize the brand, model,
        year of the car
        (apply constructor call to initialize
        brand, model)
        add a constructor that can initialize brand, model, year
        and price of the car
        (apply constructor call to initialize
        brand, model, year)

        2. create a class called Employee:
        instance variables:
        name, jobTitle, ID, salary
        add a constructor that can initialize name of employee
        add a constructor that can initialize name, jobTitle of
        the employee
        (apply constructor call to initialize the
        name)
        add a constructor that can initialize name, jobTitle, ID
        of the employee
        (apply constructor call to initialize the name
        and jobTitle)
        add a constructor that can initialize name, jobTitle, ID,
        salary of employee
        (apply constructor call to initialize the
        name, jobTitle, ID)
     */
}

class Cars{

    String model;
    String brand;
    int year;
    double price;

    public Cars(String brand){

        this.brand = brand;
    }

    public Cars(String brand, String model){

        this(brand);
        this.model = model;

    }

    public Cars(String brand, String model, int year){

        this(brand, model);
        this.year = year;
    }

    public Cars(String brand, String model, int year, double price){

        this(brand,model,year);
        this.price = price;
    }

}

class Employees{

    String name;
    long id;
    String jobTitle;
    double salary;

    public Employees(String name){

        this.name = name;

    }

    public Employees(String name, long id){

        this(name);
        this.id = id;

    }

    public Employees(String name, long id, String jobTitle){

        this(name, id);
        this.jobTitle = jobTitle;
    }

    public Employees(String name, long id, String jobTitle, double salary){

        this(name,id,jobTitle);
        this.salary = salary;
    }

}