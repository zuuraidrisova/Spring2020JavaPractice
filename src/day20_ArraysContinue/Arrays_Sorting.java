package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {

    public static void main(String[] args) {

        int [] arr = {200,7,-1,0,33,92};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("first minimum number is: "+arr[0]);
        System.out.println("second minimum number is: "+arr[1]);
        System.out.println("the maximum number is: "+arr[arr.length-1]);
        System.out.println("second maximum number is: "+arr[arr.length-2]);


        char [] ch = {'A','Y','D','B','C','Z','W',};

        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));//in ASCII table A comes before B and then goes on
        System.out.println("the maximum character is: "+ch[ch.length-1]);
        System.out.println("the minimum character is: "+ch[0]);

        String [] str = {"Zuura","Sary","Asan","Alina"};
        Arrays.sort(str);

        System.out.println(Arrays.toString(str));//in ASCII table it goes alphabetical

        int [] num = {3,1,0,100,155,-1};

        Arrays.sort(num);

        int [] numDescending = new int [arr.length];

        System.out.println(Arrays.toString(num));

        int j = 0;

        for( int i = num.length-1; i >= 0; i--){

           numDescending [j] = num[i];

           j++;

        }

        System.out.println(Arrays.toString(numDescending));

    }
}
