package WarmUp_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeePolymorphismPractice {

}

/*
1. create an abstract class named Employees
			private variables: employeeName, employeeId, salary, ssn, JobtiTle,
			isFullTime, hasPTO
			encapsulate all private variables

			abstract methods: work(), meeting()
			instance Methods: toString()
 */
abstract class Employee{

    private String employeeName;
    private long employeeID;
    private double salary;
    private String jobTitle;
    private long ssn;
    private boolean isFullTime;
    private boolean hasPTO;

    public String  getEmployeeName(){

        return employeeName;
    }

    public long getEmployeeID(){

        return employeeID;
    }

    public double getSalary(){

        return salary;
    }

    public String getJobTitle(){

        return jobTitle;
    }
    public long getSsn(){

        return ssn;

    }

    public boolean getIsFullTime(){

        return isFullTime;
    }

    public boolean getHasPTO(){

        return hasPTO;
    }

    public void setEmployeeName(String employeeName){

        this.employeeName = employeeName;

    }

    public void setEmployeeID(long employeeID){

        this.employeeID = employeeID;
    }

    public void setSalary(double salary){

        this.salary = salary;
    }

    public void setJobTitle(String jobTitle){

        this.jobTitle = jobTitle;
    }

    public void setSsn(long ssn){

        this.ssn = ssn;
    }
    public void setFullTime(boolean isFullTime){
        this.isFullTime = isFullTime;
    }
    public void setHasPTO(boolean hasPTO){
        this.hasPTO = hasPTO;
    }
    abstract void work();

    abstract void meeting();

    public String toString(){

        return "Employee Name: "+getEmployeeName()+", Employee Job Title: "+getJobTitle()
                +", Employee salary: "+getSalary()+", Employee SSN: "+getSsn()
                +", Employee is full time: "+getIsFullTime()+", Employee has PTO: "+getHasPTO()
                +", Employee id: "+getEmployeeID();
    }
}
/*
2. create an interface named ScrumTeam
			variable: has_ScrumMaster
			abstract methods: dailyStandUp()
 */

interface  ScrumTeam{

    boolean hasScrumMaster = true;//public static and final by default

    void dailyStandUp();//public abstract by default

}
/*
3. create an interface named WorkRemotely
			abstract method: workFromHome();
 */
interface  workRemotely{

    void workFromHome();//public abstract by default
}
/*
4. create a final class named Tester that can inherit Employees,
 ScrumTeam, and WorkRemotely
			actions: findingBug(), creatingTicket()
 */

final class Tester extends Employee implements ScrumTeam, workRemotely{


    public Tester(String emloyeeName, long employeeID, double salary, String jobTitle, long ssn,
                     boolean isFullTime, boolean hasPTO){

        setEmployeeName(emloyeeName);
        setEmployeeID(employeeID);
        setSalary(salary);
        setSsn(ssn);
        setJobTitle(jobTitle);
        setFullTime(isFullTime);
        setHasPTO(hasPTO);

    }
    @Override
    public void work() {
        System.out.println(getEmployeeName()+" is working");
    }

    @Override
    public void meeting() {

        System.out.println(getEmployeeName()+" has meeting everyday");
    }

    @Override
    public void dailyStandUp() {

        System.out.println(getEmployeeName()+" has daily stand up meeting every day for 15 minutes.");
    }

    @Override
    public void workFromHome() {

        System.out.println(getEmployeeName()+" works from home during COVID19!");
    }

    public void findBugs(){

        System.out.println(getEmployeeName()+" finds bugs");
    }

    public void createTicket(String tool){

        System.out.println(getEmployeeName()+" creates tickets on "+tool);
    }
}
/*
	5. create a final class named Developer that can inherit Employees, ScrumTeam, and WorkRemotely

			set a constructor that can initialize fields (instance variables)

 */
final class Developer extends  Employee implements  ScrumTeam, workRemotely{

    public Developer(String emloyeeName, long employeeID, double salary, String jobTitle, long ssn,
                     boolean isFullTime, boolean hasPTO){

        setEmployeeName(emloyeeName);
        setEmployeeID(employeeID);
        setSalary(salary);
        setSsn(ssn);
        setJobTitle(jobTitle);
        setFullTime(isFullTime);
        setHasPTO(hasPTO);

    }

    @Override
    public void work() {
        System.out.println(getEmployeeName()+" works 8 hours a day");
    }

    @Override
   public void meeting() {

        System.out.println(getEmployeeName()+" has meeting every day");
    }

    @Override
    public void dailyStandUp() {

        System.out.println(getEmployeeName()+" has daily stand up meeting every day for 15 minutes");
    }

    @Override
    public void workFromHome() {

        System.out.println(getEmployeeName()+"  works from home during COVID19");
    }
}
/*
	6. create a class named AppleInc:
		create 2 Tester' and 3 Developer' objects
		create a list of ScrumTeam and store all Tester's and Developer's objects

		Iterator the list of scrum team to display the informations of the
		 full time employees

 */

class AppleInc{

    public static void main(String[] args) {

        Tester tester1 = new Tester("Zuura", 10381, 100000, "SDET", 1382463719, true, true);
        Tester tester2 = new Tester("Sary", 90123, 120000,"SDET",93129811, true, false);

        Developer dev1 = new Developer("Kiki",78131,130000,"Senior Developer",90182761, true, false);
        Developer dev2 = new Developer("Lili", 83714, 134000, "Developer", 938237223, false, false);
        Developer dev3 = new Developer("Ali", 81324, 140000, "Senior Developer",9128392, true, true);

        ArrayList<ScrumTeam> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(tester1,tester2,dev1,dev2,dev3));

        for(ScrumTeam each :  employees){

            System.out.println(each);
        }

        System.out.println("=================================================");

        for(int  i = 0;  i < employees.size(); i++){

            employees.get(i).dailyStandUp();
        }

        System.out.println("===============================================");


    }
}