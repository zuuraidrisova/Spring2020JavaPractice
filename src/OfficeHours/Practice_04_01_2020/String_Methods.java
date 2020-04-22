package OfficeHours.Practice_04_01_2020;

public class String_Methods {
    public static void main(String []args){
        //charAt()==>takes index and returns char primitive
        String str1 = "Java ";
        char ch1 = str1.charAt(0);
        System.out.println(ch1);

        char ch2 = str1.charAt(4);//returns space
        System.out.println(ch2);
        System.out.println("++++++++++++++");

        //length()==>  returns the total number fo characters as int
        String str2 = "Cybertek School";
        int total = str2.length();//length is always one unit above index
        System.out.println(total);

        int maxIndex = str2.length()-1;//to get max index number

        char ch3 = str2.charAt(maxIndex);
        System.out.println(ch3);//to get last index
        System.out.println(maxIndex);

        System.out.println("++++++++++++++");

        //concat(str)==> concatenation
        String str3 = "Cybertek";
               str3 = str3.concat(" School");
               //now str3 referencinf a new object "Cybertek School"
        System.out.println(str3);

        String str4 = "Java";
                str4 = str4.concat(" is fun");//returns a new string
        System.out.println(str4);

        System.out.println("++++++++++++++");
        //toLowerCase() ==> converts string to lower case
        //toUpperCase() ==>converts string to upper case

        String str5 = "CYBERTEK SCHOOL";
               str5 = str5.toLowerCase();//"cybertek school";
        System.out.println(str5);

        String str6 = "muhtar";
               str6 = str6.toUpperCase();
        System.out.println(str6);//"MUHTAR";

        System.out.println("++++++++++++++");
        //trim() ==> gets rid of unneccessary spaces form the string
        String str7 = "         Cybertek";
        System.out.println(str7.length());
                str7 = str7.trim();
        System.out.println(str7);

        String str8 = "               ";
               str8=str8.trim();
        System.out.println(str8.length());//0


        System.out.println("++++++++++++++");

        //substring(beginning index, ending index)==> creates a substring starting
        // from beginning index till ending index(NOT INCLUDED)
        String sentence1 ="I like Java";
        //                 012345678910
        //last index number = length()-1 // ending index 10+1  // ending index 11;
        String word1 = sentence1.substring(7,sentence1.length()-1);//Java
        String word2 =sentence1.substring(2,6);
        String word3 = sentence1.substring(2,6).concat(sentence1.substring(7,11));
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);


        //substring(beginning index)==> creates the substring from beginning index
        // till the end of the string, returns a new string
        String sentence2 = "I like to learn Java";
        String word4 = sentence2.substring(10);//"learn Java";
        System.out.println(word4);

        String r1 = "Java";//JaVa;
        String r2 = r1.substring(0,2);//Ja
        String r3 = r1.substring(2,3);//V
                r3 = r3.toUpperCase();//to convert it to upper V
        String r4 =r1.substring(3);//a
        System.out.println(r2.concat(r3).concat(r4));


        System.out.println("++++++++++++++");
        //replace(old value, new value)==> replaces all the matching ones,
        // returns a new string
        String str ="I like C#, C# is cool";
        str =  str.replace("C#","Java");// I like Java, Java is cool
        System.out.println(str);

        // replaceFirst(old str, new str)==> replaces the first matching one
        //returns new string
        String t1 = "Java is fun, Java is good";
        t1 = t1.replaceFirst(", Java",", C#");
        System.out.println(t1);

        System.out.println("++++++++++++++");
        //indexOf(str) ==> returns index of first matching character as an int
        String y ="Today W is Wednesday";
        int x = y.indexOf("W"); //first W 's index number
        System.out.println(x);
        int z =y.indexOf("Wed");//second W's index number. we try to make it as unique
        System.out.println(z);


        //lastIndexOf(str)==>returns index of last matching character as an int
        String y2 ="Cybertek School, School";
        int x1 =y2.lastIndexOf("S");//last occurred S
        System.out.println(x1);
















    }
}
