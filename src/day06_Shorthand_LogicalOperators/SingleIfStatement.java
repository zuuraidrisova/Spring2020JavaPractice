package day06_Shorthand_LogicalOperators;

public class SingleIfStatement {
    public static void main(String []args){

        boolean coldWeather = true;
        if(coldWeather) {
            //condition is true so statements will be executed
            System.out.println("Wear you jacket");
            System.out.println("Wear your hat");
        }


        boolean coronaDetected = false;
        //this statement will not  be executed  because condition is not true
        if(coronaDetected){
            System.out.println("Buy more toilet papers!");
            System.out.println("Buy more water");
            System.out.println("Stay at home!");
            System.out.println("Do more java coding");
        }

        System.out.println("==========================");
        int a =101;//(100 is even) (101 is odd)
        boolean EvenNumber = a%2==0;//if number can be divided by 2 without remainder
        boolean oddNumber = a%2 !=0;//number cannot be divided by 2 evenly
        if(EvenNumber){
            System.out.println(a + " is even number");
        }
        if(oddNumber){
            //we can also do--> if(!EvenNumber)
            System.out.println(a+ " is odd number");
        }







    }
}
