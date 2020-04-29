package OfficeHours.Practice_18_03_2020;

public class Logical_Operators_Practice {
    public static void main(String []args){
        // || or, && and, ! opposite
        boolean r1 ="Muhtar" == "Bad Guy";//false
        System.out.println(r1);
        boolean r2 = "Muhtar" != "Good guy";//true
        System.out.println(r2);
        boolean r3 = 10>=9; //true
        System.out.println(r3);

        boolean r4 = !false == !true;
                //  true == false ==? false
        System.out.println(r4);

        // || or ==> as long as one condition is true, it will return true
        boolean r5 = 9!=8 || 9==8;//true
                //    true or false ==>true
        System.out.println(r5);//true
        boolean r6 = 'a'=='A' || 'b'=='A'; //false
                //    false   or   false ==>false
        System.out.println(r6);

        //  && and: as long as one condition is false, it will always return false
        boolean r7 = 6>5 && 6<4;//false
                //  true and false ==>false
        System.out.println(r7);

        boolean r8 = !false != false && !true ==false;
                    //   true !=false and false ==false;
                    //       true    and   true ==> true
        System.out.println(r8);


    }
}
