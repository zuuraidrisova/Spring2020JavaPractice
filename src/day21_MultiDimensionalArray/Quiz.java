package day21_MultiDimensionalArray;

public class Quiz {

    public static void main(String[] args) {

        int wd = 0;

        String [] days = {"Sunday","Monday","Wednesday","Saturday"};

        for(int i = 0; i < days.length; i++){

            switch (days[i]){

                case "Saturday":
                case "Sunday":
                    wd -=1;
                    break;
                case "Monday":
                    wd++;
                case "Wednesday":
                    wd+=2;

            }

        }

        System.out.println(wd);

    }
}
