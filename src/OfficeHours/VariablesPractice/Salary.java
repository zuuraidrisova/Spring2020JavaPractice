package OfficeHours.VariablesPractice;

public class Salary {

    public static void main(String []args){

        int rate = 55;
        float stateTax = 0.04f;
        float federalTax = 0.22f;
        int weeklyHours = 40;
        int totalWeeks = 48;

        int salaryTotal = (rate * weeklyHours)* totalWeeks;
        double totalTax = (stateTax*salaryTotal) + (federalTax* salaryTotal);
        double incomeAfterTax = salaryTotal - totalTax;

        System.out.println(salaryTotal);
        System.out.println(totalTax);
        System.out.println(incomeAfterTax);

        System.out.println("=============================");
        float  rate2 = 45.25f;
        double stateTax2 = 0.045;
        double federalTax2 = 0.25;
        int weeklyHours2 = 45;
        float totalWeeks2 = 44.8176796f;

        double totalSalary2 = (rate2 * weeklyHours2) * totalWeeks2;
        double totalTax2 =(stateTax2*totalSalary2) + (federalTax2*totalSalary2);
        double  incomeAfterTax2 = totalSalary2 - totalTax2;


        System.out.println(totalSalary2);
        System.out.println(totalTax2);
        System.out.println(incomeAfterTax2);






    }
}
