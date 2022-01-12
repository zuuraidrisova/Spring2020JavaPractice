package day09_NestedIfStatements_Ternary;

public class Ternary {
    public static void main(String []args){

        int num=100;

        String result =" ";

        if(num%2==0){

            result ="Even";
        }else{
            result = "Odd";
        }
        System.out.println(result);
        //if the if statement is only returning value and assigning it to variable then we can apply ternary

        // in ternary ? means the IF,  : means else keyword

        String result2 = (num%2==0)? "Even":"Odd";

        System.out.println(result2);

        System.out.println("=======================");

        int num1 = 100;
        int num2 = 200;
        int max = 0;

        if(num1>num2){
            max = num1;
        }else{
            max = num2;
        }

        System.out.println(max);

    //ternary
        int maximum = (num1>num2)? num1 : num2;
        System.out.println(maximum);

        System.out.println("======================");
       String str = " ";
        if(true){
            str = "Hello";
        }else{
            str = "Hola";
        }
        System.out.println(str);

        String str2 = (true)? "Hello": "Hola";
        System.out.println(str2);

        System.out.println("=============================");

    }
}
