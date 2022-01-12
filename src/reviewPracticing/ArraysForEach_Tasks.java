package reviewPracticing;

public class ArraysForEach_Tasks {

    public static void main(String[] args) {

        /*
          Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
         */

        String [] arr = { "A","B","A","C","D","E","F","B" };

        for (String each : arr){

            int count = 0;

            for (String item : arr){

                if (each.equals(item)){

                    count ++;
                }
            }

            if (count == 1){

                System.out.print(each+" ");
            }

        }

        System.out.println();

        System.out.println("================================");

        String [] arr2 = { "Ali","Ali","Sary","Zuura"};

        for (int i = 0; i <= arr2.length-1; i++){

            int count = 0;

            for (int j = 0; j <= arr2.length-1; j++){

                if (arr2[i] == arr2[j]){

                    count++;

                }
            }

            if (count == 1){

                System.out.print(arr2[i]+" ");
            }
        }

        System.out.println();


        System.out.println("=====================");

        //String str = "AAABBCC" ==>Frequency

        String str = "AAABBCC";

        char [] ch = str.toCharArray();

        String noDup = "";

        String result = "";

        for (char each : ch){

            if (!noDup.contains(each+"")){

                noDup += each;
            }
        }

        System.out.println(noDup);

        for (int i = 0; i <= noDup.length()-1; i++){

            int count = 0;

            for (int j = 0; j <= ch.length-1; j++){

                if (noDup.charAt(i) == ch[j]){

                    count++;
                }
            }

            result += noDup.charAt(i) + ""+count;

        }

        System.out.println(result);



    }
}
