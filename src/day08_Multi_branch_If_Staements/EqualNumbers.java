package day08_Multi_branch_If_Staements;
/*
1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
 */
public class EqualNumbers {

    public static void main(String []args){

        double num1 =3005;
        double num2 =300;
        double num3 =300;

        boolean num1EqualNum2 = num1==num2 && num1!=num3;//only num1 and num2 are equal
        boolean num1EqualNum3 = num1==num3 && num1!=num2;//only num1 and num3 are equal
        boolean num2EqualNum3 = num2==num3 && num2!= num1;//only num2 and num3 are equal
        boolean AllEqual = num1==num2 && num1==num3;// all equal
        boolean NoneEqual = num1 != num2 && num1!= num3 && num2 !=num3;//none equal

        if(num1EqualNum2){
            System.out.println(num1+" & "+num2+" are equal");
        }
        if(num1EqualNum3){
            System.out.println(num1+" & "+num3+" are equal");
        }
        if(num2EqualNum3){
            System.out.println(num2+" & "+ num3+" are equal");
        }
        if(AllEqual){
            System.out.println("All are equal");
        }
        if(NoneEqual){
            System.out.println("None of them are equal");
        }

    }
}
