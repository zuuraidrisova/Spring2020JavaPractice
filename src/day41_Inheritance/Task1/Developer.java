package day41_Inheritance.Task1;

public class Developer extends Employee {
      /*
    	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     create a constructor that can initialize all the attributes of developer
     */

      public void fixingBug(){

          System.out.println(name+" is fixing  Bug");
      }
      public void coding(String progLang){

          System.out.println(name+" is coding "+progLang);
      }
      public Developer(String name, String jobTitle, char gender, double salary, long ID){

        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.ID = ID;


    }
}
