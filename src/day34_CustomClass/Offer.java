package day34_CustomClass;

public class Offer {
    /*
    Create a class called Offer that has:
	instance fields :
			location, company, salary , isFullTime
	instance methods :
		setOfferInfo: can set the location, company, salary , isFullTime of the offer
		toString -- return all info about offers

     */

    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setOfferInfo(String location, String company,
                             double salary, boolean isFullTime){

      this.company = company;
      this.location = location;
      this.salary = salary;
      this.isFullTime = isFullTime;


    }

    public String toString(){

      return "Company : " + company + " Location : " + location
              + " Salary : "+ salary +" FullTime : "+ isFullTime;

    }

}
