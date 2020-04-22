package WarmUp_Practices;

public class gradingStudents {
    public static void main(String []args){
        int mark = 90;
        if(mark<60){
            System.out.println("Fail");
        }else if(mark >= 60 && mark <90){
            System.out.println("Pass");
        }else{
            System.out.println("Passed with Distinction");
        }

        System.out.println("================");

        int mark2 =56;
        String result = (mark2<60)? "Fail" :(mark2>=60 && mark2<90)? "Pass" : "Passed with Distinction";
        System.out.println(result);

    }
}
