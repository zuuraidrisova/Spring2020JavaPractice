package day17_WhileLoops;

public class System_exit_ {
    public static void main(String[] args) {

        //System.exit(0);

        for(int i=0;i<=5;i++){

            if(i%2!=0){

                System.exit(0);//exits the program if  condition is met
                //break;//if the condition is met exits the loop immediately
                //continue; // it skips the current iteration of the loop
            }
            System.out.println(i);
        }
        System.out.println("test completed");
    }
}

