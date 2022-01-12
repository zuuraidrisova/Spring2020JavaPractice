package day08_Multi_branch_If_Staements;


public class Multi_Branch_IfStatements_Practice {
    public static void main(String []args){

        double score =74;

        boolean AGrade = score>=90 && score<=100;
        boolean BGrade = score>=80 && score<90;
        boolean CGrade = score>=70 && score<=80;
        boolean DGrade = score>=60 && score<70;

        if(AGrade){

            System.out.println('A');

        }else if(BGrade){

            System.out.println("B");

        }else if(CGrade){

            System.out.println("C");

        }else if(DGrade){

            System.out.println("D");

        }else{

            System.out.println("F");
        }


        //another way doing it, with declaring a local  variable and initializing it

        char grade= ' ';


        if(AGrade){
            grade = 'A';
        }else if(BGrade){
            grade = 'B';
        }else if(CGrade){
            grade ='C';
        }else if(DGrade){
            grade = 'D';
        }else{
            grade= 'F';
        }
        System.out.println(score + " score is: "+ grade);

    }

}

