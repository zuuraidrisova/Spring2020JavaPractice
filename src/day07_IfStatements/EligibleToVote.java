package day07_IfStatements;
/*
5. write a java program that can identify if a person is eligible to vote for Donald Trump
	Note : use single if statements
 */
public class EligibleToVote {
    public static void main(String []args){
        int age = 18;
        boolean citizen = true;

        boolean eligible= age >=18 && citizen == true;

        if(eligible){
            System.out.println("You can vote for Trump");
        }
        if(! eligible){
            System.out.println("You cannot vote for Trump");
        }

    }
}
