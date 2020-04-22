package Replit_Practices;

public class ForEachArray {
    public static void main(String[] args) {

        String [] friends = {"Chopa", "Nazira", "Shirin", "Jiyde"};

        for(String friend : friends){
            System.out.println("Friends: " +friend);
        }



        int  [] nums = {1,2,3,4,5,6,7,8};

        for(int i : nums) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        String [] str = {"aaa","bbb","ccc"};

        for(String item : str){
            if(item.contains("a")){
                System.out.println(item);
            }
        }

        for(int i = 0; i < str.length; i++){
            String letters = str[i];
            System.out.println(letters);
        }

    }
}
