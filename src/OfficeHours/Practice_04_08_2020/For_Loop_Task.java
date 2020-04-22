package OfficeHours.Practice_04_08_2020;

public class For_Loop_Task {
    public static void main(String[] args) {
        /*
        print all the numbers between 1~100 that can be divisible by 3 or 5
         */
        for(int i=1;i<=100;i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("======================");

//ur name is palindrome or not?
        //chartAt()

        String name = "Hannah";//01234
        int lastIndex = name.length()-1;
        String reversed = "";//aruuz
        for(int i = lastIndex;i >= 0;i--){
            reversed +=name.charAt(i);

        }
        boolean result = reversed.equalsIgnoreCase(name);

        if(result){
            System.out.println(name+" is a palindrome");
        }else{
            System.out.println(name+ " is not a palindrome");
        }

        //ur name is palindrome or not?
        //substring()

        String str = "Zuura";
        String reversed1 = "";
        int index = str.length()-1;
        for(int i=index;i>=0;i--){
            reversed1 =reversed1 + str.substring(i,i+1);
            //                beginning          3,4  ending
            //               beginning           2,3  ending
            //               beginning           1,2  ending
            //               beginning           0,1  ending
        }

        System.out.println(reversed1);
        boolean result1 = reversed1.equalsIgnoreCase(str);
        if(!str.isEmpty()){//pre-condition
        if(result1){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
        }else{
            System.out.println("The name is empty");
        }
    }
}
