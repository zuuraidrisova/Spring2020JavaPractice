package day21_MultiDimensionalArray;

public class Day21_notes {
            /*
            04/13/2020
        Topics: String methods (toCharArray & split)
        For each
        Multi-Dimensional Arrays
        package name: day21_MultiDimensionalArrays
        warmup tasks:
        1. write a program that can return the average number from an array
        of integers
        ex:
        [1,2,3]
        average: 2
        [10, 15, 5, 6]
        average: 9
        [4, 5, 6, 7, 8, 10, 20, 30, 0]
        average: 10
        2. write a program that can return the logest string of text from an
        array
        3. write a program that can return the shortest string of text from
        an array
        DecimalFormat: used for rounding the decimals
        presented in "java.text"
        DecimalFormat  DF = new
        DecimalFormat("0.00");  // rounds to the second decimal
        DecimalFormat  DF = new
        DecimalFormat("0.000"); // rounds to the Third decimal
        String methods:
        toCharArray(): returns char array from string, returns
        char array
        split(Value): splits the string with given value, returns
        String array
        go to -> canvas -> java - > modules - > day21 -> pelase complete "Arrays
        short quiz"
        come back at 12:15
        please use chrome or firefox browsers
        for each loop: loop that's already been iterated
        for(DataType variableName : ArrayName ){
        }
        variable name represents each of the data in the array
        DataType MUST be matched with Array's data type
        number of execution times of the loop depends on teh size
        of the Array
        iteration is always started from index 0 of the Array
        When do we use it:  first we MUST have a data structure
        whenver we
        dont need to proide the index numbers
        Task:
        given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com",
        "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
        print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
        multi-dimentional array: a variable that can contain arrays
        n dimensional array MUST conatin (n-1) dimensional arrays
        2 dimensional array contains 1 dimensional arrays:
        int[] arr1D = {1,2,3}
        int[][]  arrayName = {
        {1,2,3} , {4,5,6}  };
        //
        0  ,    1
        each single
        dimensional arrays are index of the 2D array
        [index numer of
        each 1Darray] [index num of each value in 1D array]
        arrayName[0][1]  ==> 2
        arrayName[1][2]  ==> 6
        arrayName[0] ==> {1,2,3}
        3 dimensional array can contain 2 diemntional arrays:
        int[][][]  arr3D =  {            };
        [index num of 2D
        Array][index num of 1D array][index num of Elements]
        Arrays.ToString(arrayName): only for single dimensional array
        Arrays.deeptoString(array): for multidimensional arrays
        Tomorrow: applying nested loop to multi-dimensional arrays
         Loops & Arrays
        Wednesday: Strings, loops, arrays   2pm ~ 5pm
        Thursday: Custom method
             */
}
