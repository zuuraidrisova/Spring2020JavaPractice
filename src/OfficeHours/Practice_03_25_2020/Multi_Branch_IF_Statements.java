package OfficeHours.Practice_03_25_2020;

public class Multi_Branch_IF_Statements {
    public static void main(String[] args) {
        //if options, conditions are more than 2
        // only 1 block of code gets executed
        /*
        if(condition){   ==> if it is true, below statement will run
            Statement A;
            }else if(condition2){ ==>if above condition is false, and this one is true, it will run the below statement
                Statement B;
                }else if(condition){ ==> if above conditions are false, and this one is true, it will run below code
                    Statement C;
                    }else{         ==> if all previous conditions are false, it will run otherwise code
                        Statement D;
                    }
         */
        int number = 1;
        if(number>0){ // gets executed if it is true
            System.out.println("positive");
        }else if(number<0){  // gets executed if first is false, and this one is true
            System.out.println("negative");
        }else{           // gets executed if previous conditions are false
            System.out.println("zero");
        }

        int num1 = 45;
        int num2 = 450;
        if(num1>num2){
            System.out.println(num1+ " is greater than "+num2);
        }else if(num2>num1){
            System.out.println(num2+" is greater than "+num1);
        }else{
            System.out.println(num1+" is equal to "+num2);
        }

        String browserName = "Cybertek";
        if(browserName=="Firefox"){
            System.out.println("Firefox browser is opening");
        }else if(browserName=="Safari"){
            System.out.println("Safari browser is opening");
        }else if(browserName=="Chrome"){
            System.out.println("Chrome browser is opening");
        }else if(browserName=="Internet Explorer"){
            System.out.println("Internet Explorer browser is opening");
        }else if(browserName=="Opera"){
            System.out.println("Opera browser is opening");
        }else{
            System.out.println("Invalid browser name");
        }

    }
}
