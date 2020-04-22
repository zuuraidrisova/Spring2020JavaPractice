package day17_WhileLoops;

public class FINRA {
    public static void main(String[] args) {

/*
 write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA
 */


         for(int i= 1; i<=30;i++){//printing numbers from 1  ~ 30

             if(i%3==0){//prints numbers divisible by 3 and not divisible by 5
                 System.out.println("FIN: "+ i);
             }else if(i%5==0){//prints numbers divisible by 5 and not divisible by 3
                 System.out.println("RA: "+ i);
             }else if(i%3==0 && i%5==0){//prints numbers divisible by both 3 and 5
                 System.out.println("FINRA: "+ i);
             }else{
                 System.out.println("No match: "+i);
             }
         }

        String result = " ";
         for(int i=1; i<=30; i++){
             if(i%3==0 && i%5==0){
                 result+="FINRA: "+i+" ";//concatenation
             }else if(i%3==0){
                 result+="FIN: "+i+" ";
             }else if(i%5==0){
                 result+="RA: "+i+" ";
             }else{
                 result+="No match: "+i+" ";
             }
         }

        System.out.println(result);









        }
    }

