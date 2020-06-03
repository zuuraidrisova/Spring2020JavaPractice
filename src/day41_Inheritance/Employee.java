package day41_Inheritance;

public class Employee {
    /*
    create a  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
			*/

    public String name;
    public String jobTitle;
    public  char gender ;
    public double salary;
    public long ID;


    public String toString(){

        return "Name: "+name+", JobTitle: "+jobTitle+", Salary: "+salary+", ID: "+
                ID+", Gender: "+gender;
    }


}
class Tester extends Employee{

    /*
    create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			creata a constructor that can initialize all the attributes of Tester
     */
    public Tester(String name, String jobTitle, char gender, double salary, long ID){

        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.ID = ID;


    }
    public void reportBug(){

        System.out.println(name+" is reporting a Bug");
    }
    public void  test(){

        System.out.println(name+" is testing");
    }
}

class Developer extends Employee{
    /*
    	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     create a constructor that can initialize all the attributes of developer
     */
    public Developer(String name, String jobTitle, char gender, double salary, long ID){

        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.ID = ID;

    }

    public void fix(){

        System.out.println(name+" is fixing a bug");
    }
    public void code(String programmingLanguage){

        System.out.println(name+" is coding "+programmingLanguage);
    }

}
class BA extends Employee{
    /*
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst
     */
    public BA(String name, String jobTitle, char gender, double salary, long ID){

        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.ID = ID;

    }
    public void writeSRS(){

        System.out.println(name+" is writing Requirement Document");
    }
    public void gatherInfo(){

        System.out.println(name+" is gathering Requirement Information");
    }
}