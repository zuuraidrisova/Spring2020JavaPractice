package day08_Multi_branch_If_Staements;

public class MultiBranchIf {
    public static void main(String[] args) {

        int a = -1;

        boolean zero = a ==0;
        boolean positive = a>0;
        boolean negative = a<0;

        if(zero){
            System.out.println("It is zero");
        }
        else if(positive){
            System.out.println("It is positive");
        }
        else{
            System.out.println("It is negative");
        }
    }
}
