package reviewPracticing.OOP_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class EmpAbst {

    /*
    	1. create an abstract class named Employees
			private variables: employeeName, employeeId, salary, ssn, JobtiTle, isFullTime, hasPTO
			encapsulate all private variables

			abstract methods: work(), meeting()
			instance Methods: toString()
     */

    private String name;
    private long id;
    private double salary;
    private long ssn;
    private String jobTitle;
    private boolean isFullTime;
    private boolean hasPTO;

    public String getName(){

        return name;
    }

    public long getId(){

        return  id;
    }

    public double getSalary(){

        return  salary;
    }

    public long getSsn(){

        return ssn;
    }

    public String getJobTitle(){

        return jobTitle;
    }

    public boolean getIsFullTime(){

        return isFullTime;

    }

    public boolean getHasPTO(){

        return hasPTO;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setId(long id){

        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public void setHasPTO(boolean hasPTO) {
        this.hasPTO = hasPTO;
    }


    public abstract void work();

    public abstract void meeting();

    @Override
    public String toString() {

        return "EmpAbst{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", ssn=" + ssn +
                ", jobTitle='" + jobTitle + '\'' +
                ", isFullTime=" + isFullTime +
                ", hasPTO=" + hasPTO +
                '}';
    }

}

/*
2. create an interface named ScrumTeam
			variable: has_ScrumMaster
			abstract methods: dailyStandUp()
 */

interface  ScrumTeam{

    public static  final boolean hasScrumMaster = true;

    public abstract void  dailyStandUp();

}

/*
	3. create an interface named WorkRemotely
			abstract method: workFromHome();
 */

interface WorkRemoteLy{

    public abstract void workFromHome();

}

/*
4. create a final class named Tester that can inherit Employees, ScrumTeam, and WorkRemotely
			actions: findingBug(), creatingTicket()

 */

final  class Testers extends EmpAbst implements  ScrumTeam, WorkRemoteLy{


    public Testers(String name, long id, double salary, long ssn, String jobTitle, boolean hasPTO, boolean isFullTime){

        setName(name);
        setId(id);
        setSalary(salary);
        setSsn(ssn);
        setFullTime(isFullTime);
        setHasPTO(hasPTO);
        setJobTitle(jobTitle);

    }
    @Override
    public void work(){

        System.out.println(getName()+" works every day");
    }

    @Override
    public void meeting(){

        System.out.println(getName()+" attends meeting every day");
    }

    @Override
    public void dailyStandUp(){

        System.out.println(getName()+" attends daily standUp every day");

    }

    @Override
    public void workFromHome(){

        System.out.println(getName()+" works from home every other week");

    }

    public void createBugTicket(){

        System.out.println(getName()+" creates bug ticket every day");

    }

    public void findsBug(){

        System.out.println(getName()+" finds a bug  every day");

    }


}
/*
5. create a final class named Developer that can inherit Employees, ScrumTeam, and WorkRemotely

			set a constructor that can initialize fields (instance variables)

 */

final  class Developers extends EmpAbst implements  ScrumTeam, WorkRemoteLy{

    public Developers(String name, long id, double salary, long ssn, String jobTitle, boolean hasPTO, boolean isFullTime){

       setName(name);
       setId(id);
       setSalary(salary);
       setSsn(ssn);
       setFullTime(isFullTime);
       setHasPTO(hasPTO);
       setJobTitle(jobTitle);

    }

    @Override
    public void work() {

        System.out.println(getName()+" works every day");
    }

    @Override
    public void meeting() {

        System.out.println(getName()+" attends meeting every day");

    }

    @Override
    public void dailyStandUp() {

        System.out.println(getName()+" attends daily standUp every day");

    }

    @Override
    public void workFromHome() {

        System.out.println(getName()+" works from home every other day");

    }

}
/*
	6. create a class named AppleInc:

			create 2 Tester' and 3 Developer' objects
			create a list of ScrumTeam and store all Tester's and Developer's objects

			Iterator the list of scrum team to display the information of the full time employees

 */
class AppleInc{

    public static void main(String[] args) {


        Testers tester1 = new Testers("Zuura",32165,100000,92987812,"SDET",true,true);
        Testers tester2 = new Testers("Zara",321621,90000,929878381,"QA",false,false);

        Developers developer1  = new Developers("Sary",392712, 130000, 8322181,"Developer",true, true);
        Developers developer2  = new Developers("Kanikey",932729,140000,3716587,"Senior Developer",true ,true);
        Developers developer3  = new Developers("Nazerke",8288272, 100000,9192,"Developer",true,false);


        ArrayList<ScrumTeam> scrumTeam = new ArrayList<>(Arrays.asList(tester1,tester2,developer1,developer2,developer3));

        for (ScrumTeam each: scrumTeam){

            System.out.println(each);
        }

        System.out.println("=======================================");


        ArrayList<EmpAbst> employees = new ArrayList<>(Arrays.asList(tester1,tester2,developer1,developer2,developer3));

        for (int i = 0; i < employees.size(); i++){

            System.out.println(employees.get(i));
        }

        System.out.println("=======================================");

        employees.removeIf(p -> p.getIsFullTime() == false);

        for (EmpAbst each : employees){

            System.out.println(each);
        }

        System.out.println("=======================================");

        boolean isEmployee = tester1 instanceof EmpAbst;

        System.out.println("isEmployee = " + isEmployee);
    }
}
