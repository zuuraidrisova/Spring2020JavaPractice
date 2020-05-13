package day37_Constructors;

public class CybertekStudents {

    static String schoolName;//we dont have to provide it because it is common for all
    String name;
    int groupNumber;
    String batch;


    public CybertekStudents(String name, int groupNumber, String batch){

        schoolName = "Cybertek";//compiles fine because static is global
        //static belongs to class, and all instance variables also belong to class
        this.name  = name;
        this.groupNumber = groupNumber;
        this.batch = batch;

    }

    public String toString(){

        return "Name: "+name+" GroupNumber: "+groupNumber+" Batch: "+batch+" SchoolName: "+schoolName;
    }



}

class CybertekObjects{

    public static void main(String[] args) {

        CybertekStudents student1 = new CybertekStudents("Zuura",7,"Batch18");
        CybertekStudents student2 = new CybertekStudents("Madina",11, "Batch17");
        CybertekStudents student3 = new CybertekStudents("Gulya",1,"Batch18");

        student1.schoolName = "Harvard School";//we can change it here, but all instances will be changed
        CybertekStudents[] students = {student1,student2,student3};


        for(CybertekStudents each : students){

            System.out.println(each);
        }

    }

}