package InterviewQuestions;

public class findTheUniqueArray {

    public static void main(String[] args) {


        int[] arr = {1,1,1,2,3,4,5,5,6,6,7};

        for(int i = 0; i < arr.length; i++){

            int count = 0;

            for(int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    count++;
                }
            }

            if(count == 1){


                System.out.println(arr[i]);;

            }

        }

    }
}
