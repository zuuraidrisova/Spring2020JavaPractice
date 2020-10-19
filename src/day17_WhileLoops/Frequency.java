package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {

        String str = "Java is fun, is cool".toLowerCase();//abcd
        int count = 0;//

        while(str.contains("o")){

            count++;
            str = str.replaceFirst("o", "");

        }

        System.out.println(count);

    }
}
