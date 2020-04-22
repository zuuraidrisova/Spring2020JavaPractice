package day22_ArraysLoopsRecap;

public class JavaPython {
    public static void main(String[] args) {

        /*
        write a program that can return the number of appearances of "java" and "python"
         anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST
                use arrays and for each loop)
         */


        String sentence = "Java is fun, I like Java and Javascript, Python is easy";

        int countJava = 0;
        int countPython = 0;

        String [] words = sentence.split(" ");

        for(String each : words){

            if(each.contains("Java")) {
                countJava++;
            }
            if(each.contains("Python")){
                countPython++;
            }

        }

        System.out.println(countJava);
        System.out.println(countPython);
        System.out.println(countJava == countPython);



    }

}
