package day14_StringClassContinue;

public class StringManipulation {
    public static void main(String[]args){

        String str = "I like to J learn Java. I like to watch the movie Jumanji";
            int a1 = str.indexOf("J");
        System.out.println(a1);
            int a2 =str.indexOf("Jum");
        System.out.println(a2);
            int a3 = str.indexOf(" I")+1;//second I's index number
        System.out.println(a3);

        String str2 = "I like Java, and I like reading.";
            int a4 = str2.lastIndexOf("I");
        System.out.println(a4);
            int a5 =str2.lastIndexOf("l");
        System.out.println(a5);

        String z = "I like C#, C# is cool";
             int b1 =z.lastIndexOf("C");
        System.out.println(b1);

        String x ="I like Java, Java is fun, Java programming is fun";
         int d =x.indexOf(", Java")+ 2;//second J' index num
        System.out.println(d);
        int d1 =x.indexOf("Java is");//second J' index num
        System.out.println(d1);
        int d2 =x.lastIndexOf("J");//last J' index num
        System.out.println(d2);
        int d3 =x.indexOf("Java pr");//last J' index num
        System.out.println(d3);

        char ch = x.charAt(26);
        System.out.println(ch);



    }
}
