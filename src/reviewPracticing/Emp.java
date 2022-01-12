package reviewPracticing;

public class Emp {

     /*
    create a  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
			*/

     public String name;
     public double salary;
     public long id;
     public String jobTitle;
     public char gender;

     public String toString(){

         return "Name: "+name+", JobTitle: "+jobTitle+", Salary: "+salary+", ID: "+
                 id+", Gender: "+gender;
     }

}
    /*
    create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			creata a constructor that can initialize all the attributes of Tester
     */

class Tester extends Emp{

    public Tester(String name,double salary,long id, String jobTitle, char gender ){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.gender = gender;

    }

    public void test(){

        System.out.println(name+" is testing");
    }

    public void reportBug(){

        System.out.println(name+ " is creating bug ticket");
    }
}

/*
       create subclass of employee name it developer:
        variables: salary, name, id, jobTitle, gender
        action: fixingBug, coding
        create a constructor that can initialize all the attributes of developer
    */

class Developer extends Emp{

    public Developer(String name,double salary,long id, String jobTitle, char gender ){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.gender = gender;

    }

    public void fixBug(){

        System.out.println(name+" is fixing bug");

    }

    public void code(String programmingLanguage){

        System.out.println(name+" is coding in "+programmingLanguage);
    }

}

/*
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst
     */

class BusinessAnalyst extends Emp{

    public BusinessAnalyst(String name,double salary,long id, String jobTitle, char gender ){

        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
        this.gender = gender;

    }

    public void writeRequirements(){

        System.out.println(name+" is writing requirement documents");
    }

    public void gather(){

        System.out.println(name+" is gathering Info");
    }
}