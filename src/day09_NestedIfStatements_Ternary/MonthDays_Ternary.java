package day09_NestedIfStatements_Ternary;

public class MonthDays_Ternary {
    public static void main(String []args){
        byte month = 2;
        String result= (month==1)?"January has 31 days":(month==2)?"February has 28 or 29 days"
                :(month==3)?"March has 31 days":(month==4)?"April has 3o days":(month==5)?"May has 31 days"
                :(month==6)?"June has 30 days":(month==7)?"July has 31 days":(month==8)?"August has 31 days"
                :(month==9)?"September has 30 days":(month==10)?"October has 31 days"
                :(month==11)?"November has 30 days":(month==12)?"December has 31 days":"Invalid Entry";
        System.out.println(result);

    }
}
