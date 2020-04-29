package OfficeHours.Practice_03_25_2020;

public class IF_Else_Statements {
    public static void main(String[] args) {
        //two conditions, two options
        //only one of the conditions gets executed
        //but no way that none of them gets executed
        //one will always be true no matter what
        /* if(condition){    ==> if condition is true, it gets executed
                Statement A;
            } else{         ==> if condition is false, it gets executed
                Statement B;
            }
         */
        int num = 200;
        //if i am sure that there are only two possibilities
        if(num%2==0){//if this condition true, it will run
            System.out.println(num+ " is an even number");
        }else{//if the above condition false, it will run
            System.out.println(num+" is an odd number");
        }


        int age =21;
        //there is only one possibility which is true
        //so only one option will get executed
        if(age>=21){//if this is true, the below code will run
            System.out.println("You are allowed to buy alcohol");
        }else{//if above condition is false, it will get run
            System.out.println("You are not allowed to buy alcohol");
        }

       boolean maleFemale = true;
        if(maleFemale){
            System.out.println("You will be Dad");
        }else{
            System.out.println("You will be Mom");
        }

        boolean smart = true;
        boolean generous = true;
        int age1= 30;
        if(smart== true && generous==true && age1>= 30){
            System.out.println("I can marry you!!!");

        }else{
            System.out.println("Don't bother me!!!");
        }




    }
}
