package day15_For_Loop;

public class ReverseForloop {

    public static void main(String[] args) {

        String str = "Kubanychbek";

        int lastIndexNum = str.length()-1;

        String reverse = "";

        for(int i = lastIndexNum; i >= 0;i--){

           // System.out.print(str.charAt(i));
            reverse += str.charAt(i);

        }
        System.out.println(reverse);
    }
}
