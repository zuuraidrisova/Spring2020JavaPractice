package day38_Constructors;

public class SalaryCalculator {

    /*
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
            add a constructor can initialize those fields

     */
    double hourlyRate;
    int weekLyHours;
    double stateTaxRate;
    double federalTaxRate;


    //every time we create an object that is the time constructor gets executed
    public SalaryCalculator(double hourlyRate, int weekLyHours, double stateTaxRate, double federalTaxRate) {

        this.hourlyRate = hourlyRate;
        this.weekLyHours = weekLyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }
    //    salary(): returns the total salary as double

    public double salary(){//annual income

        return hourlyRate * weekLyHours * 48;

    }
    //stateTax(): retuns the total state tax as double

    public double stateTax(){//total state tax

        return salary() * stateTaxRate;
    }
    // federalTax(): retuns the total federal tax as double

    public double federalTax(){//total federal tax

        return salary() * federalTaxRate;

    }
    // salaryAftertax(): retuns the salary after tax as double

    public double salaryAfterTax(){//net income

        return salary() - stateTax() - federalTax();

    }
    // toString(): returns the hourlyRate, weeklyHours and salary
    //                 info as calculated by salary()

    public String toString(){

        return   "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hours: "+weekLyHours+
                "\nGross Salary: $"+salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "\nNet Salary: $"+salaryAfterTax();
    }

}

class employeeSalary{

    public static void main(String[] args) {

        SalaryCalculator employee1 = new SalaryCalculator(50,40,0.08, 0.20);

        System.out.println(employee1);

        System.out.println("************************************************");

        SalaryCalculator employee2 = new SalaryCalculator(65, 40, 0.09,0.26);

        System.out.println(employee2);

    }
}