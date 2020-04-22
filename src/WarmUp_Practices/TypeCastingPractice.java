package WarmUp_Practices;

public class TypeCastingPractice {
    public static void main(String []args){
        int pies =10, people =4;
        double piesPerson;
        piesPerson = pies/people;
        System.out.println(piesPerson);

        piesPerson= pies/(double)people;
        System.out.println(piesPerson);

        piesPerson=(double)pies/people;
        System.out.println(piesPerson);

       // piesPerson= double(pies/people);
       // System.out.println(piesPerson);



    }
}
