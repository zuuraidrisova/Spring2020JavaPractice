package day07_IfStatements;
/*
3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
 */
public class MinimumNumber {
    public static void main(String []args){
        int a =34;
        int b =23;
        int c= 45;
        boolean aMin = a<b && a<c;// if a is less than both b and c, then a is min num
        boolean bMin = b<a && b<c;//if b is less than both a and c, then b is min num
        boolean cMin = c<a && c<b;//if c is less than both a and b, then c is min num
        if(aMin){
            System.out.println(a + " is minimum number");
        }
        if(bMin){
            System.out.println(b + " is minimum number");
        }
        if(cMin){
            System.out.println(c + " is minimum number");
        }


    }
}
