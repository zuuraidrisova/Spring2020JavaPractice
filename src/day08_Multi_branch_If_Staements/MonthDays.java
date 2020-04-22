package day08_Multi_branch_If_Staements;
	/*
 1 Jan - 31
2 Feb - 28
3 Mar - 31
4 Apr - 30
5 May - 31
6 Jun - 30
7 Jul - 31
8 Aug - 31
9 Sep - 30
10 Oct - 31
11 Nov - 30
12 Dec - 31
2. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 		byte month =  3
			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12

	 */
public class MonthDays {
    public static void main(String []args){
        byte  month = 11;
        boolean days28 = month==2;
        boolean days30 = month ==4 || month ==6 || month ==9 || month ==11;
       // boolean days31 = month ==1 || month ==3 || month ==5 || month==7 || month ==8 ||month==10 || month==12;
        //boolean = days31 = !days28 && !days30;
        boolean days31 = days28==false && days30==false;
        if(days28){
            System.out.println("This month has 28 days");
        }
        if(days30){
            System.out.println("This month has 30 days");
        }
        if(days31){
            System.out.println("This month has 31 days");
        }



    }
}

