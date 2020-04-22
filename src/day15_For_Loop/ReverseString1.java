package day15_For_Loop;

public class ReverseString1 {
    public static void main(String[] args) {
        String name = "Kubanychbek";

        int lastIndex = name.length()-1;

        System.out.println(name);

        String reversed = "";

        for(int i = lastIndex; i >= 0;i-- ){
            reversed+= name.charAt(i);
        }
        System.out.println(reversed);
    }
}
