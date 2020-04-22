package WarmUp_Practices;

public class AverageOfSubjects {
    public static void main(String []args){
        double subject1 = 100;
        double subject2 = 89;
        double subject3 = 93;
        double totalOfSubjects = subject1+subject2+subject3;
        double StudentGrade = totalOfSubjects/3.0;
        if(StudentGrade>=90){
            System.out.println(" A");
        }else if(StudentGrade>=80 && StudentGrade<90){
            System.out.println(" B");
        }else if(StudentGrade>=70 && StudentGrade<80){
            System.out.println(" C");
        }else if(StudentGrade>=60 && StudentGrade<70){
            System.out.println(" D");
        }else{
            System.out.println(" F");
        }

    }
}
