package OfficeHours.Practice_03_25_2020;

public class If_Single_Statements {
        public static void main(String[]args){
            //If statement==> used when we have one option, condition, one possibility
        /* if(condition){          ==>must be evaluated to boolean
               Statement A;        ==> if condition is true, then it will get executed
                                   ==> otherwise it will never get executed
               }
         */
            if(!true){
                System.out.println("If condition is true, it will run");
            }
            if(false){
                System.out.println("if condition is false, it will not run");
            }

            // all of them single independent if statements,
            // compiler checks every single possibility

            if(8>9){//if it is true, it will run below body
                System.out.println("8 is greater than 9");
            }
            if(8<9){//if it is true, it will run below body
                System.out.println("8 is less than 9");
            }
            if(8==9){//if it is true, it will run below body
                System.out.println("8 is equal to 9");
            }
            //if all is false, none of them gets executed
            //if all of them true, all of them gets executed
        }
    }

