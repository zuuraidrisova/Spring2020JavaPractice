package WarmUp_Practices;

public class DuplicateArray {

    public static void main(String[] args) {

        int arr [] = {3,4,5,1,1,6,8,4};

        for(int i = 0; i < arr.length; i++){

            for (int j = 1; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    System.out.println(arr[i]);
                    return;

                }
            }
        }







    }
}
