package day02_Variables;

public class variablesPractice {

    public static void main(String [] args){
        /* salary, federal tax rate,state tax, loan,SSN
         */
        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;
        // salary after tax = salary (1-sum of taxes)

        double sumTaxes = federalTax + stateTax;
        double salaryAfterTax = salary * (1 - sumTaxes);
        System.out.println(salaryAfterTax);
        System.out.println("===============================");


        //area of the circle  = r *r * pi
        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println(area);

        int kg = 58;
        double pound = kg * 2.25;
        System.out.println(pound);

        double som = 1000;
        double KyrgyzDollar = som * 72;
        System.out.println(KyrgyzDollar);


        double liter = 10000;
        double literInGallons = 1000/3.7;
        System.out.println(literInGallons);


    }

}
