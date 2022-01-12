package day06_Shorthand_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        // !
        // !true = false && !false =true
        boolean result = true;
        System.out.println(!result);//false

        boolean result2 = !(10+15>15);
        System.out.println(result2);//false

        boolean result3=!true ==!false;
        System.out.println(result3);//false

        // && mean 'and' logic
        boolean r1 ="Coronavirus"!= "End of the World" && "Toilet paper"=="Cure";
                        //true                                  false
        System.out.println(r1);//false
        boolean r2 = 10>15 && 15<13;
        //  false &&    false
        System.out.println(r2);//false

        boolean r3 = 'a'=='b'-1 && 'b'+1 =='c';
        //            97==98-1 &&   98+1 ==99-----> true
        System.out.println(r3);

        // ||:or logic

        boolean r4 = true!=false || false!=true;
        //              true     ||  true ---> true
        System.out.println(r4);

        boolean r5 = true!= false && !false != true;
        //              true      &&       false ---> false
        System.out.println(r5);

        System.out.println(8 * 2 - 7 / 4);


    }
}
