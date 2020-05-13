package day37_Constructors;

public class SalaryCalculator {
    /*

    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods.
     */

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){

        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;


    }

    //salary(): returns the total salary as double

    public double salary(){

        return hourlyRate * weeklyHours * 48;

    }


    // stateTax(): retuns the total state tax as double

    public double stateTax(){

       return stateTaxRate * salary();
    }

    //federalTax(): returns the total federal tax as double

    public double federalTax(){

        return federalTaxRate * salary();

    }

    //salaryAftertax(): retuns the salary after tax as double

    public double salaryAfterTax(){

        return  salary() - ((stateTaxRate * salary()) + (federalTaxRate * salary()));

    }

    //toString(): returns the hourlyRate, weeklyHours and salary
    // info as calculated by salary()

    public String toString(){

        return "The hourly Rate: "+hourlyRate
                +"\nThe weekly Hours: "+weeklyHours
                +"\nSalary: "+salary();
    }

}

class SalaryObject{

    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(56,40,0.10,0.20);


        System.out.println(salary1);
        System.out.println(salary1.stateTax());
        System.out.println(salary1.federalTax());
       System.out.println(salary1.salaryAfterTax());


    }
}