package WarmUp_Practices;

public class EligibilityVote {
    public static void main(String[]args){
        int age = 29;
        boolean EligibleToVote =age>18 || age==18;
        if(EligibleToVote){
            System.out.println("You are eligible to vote!");
        }
        if(!EligibleToVote){
            System.out.println("You are not eligible to vote!");
        }

        System.out.println("++++++++++++++++++");
        int age2 = 17;
        String Eligibility = (age2>=18)? "You are eligible to vote":"You are not eligible to vote";
        System.out.println(Eligibility);

    }
}
