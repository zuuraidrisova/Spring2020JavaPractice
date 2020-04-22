package day16_ForLoopContinueBreak;

public class RemoveDuplicatesFor {
    public static void main(String []args){

        String str = "abababababbabbababbababbabbababccccccccccccc";

        String result ="";//we should get ab

        for(int i = 0; i <= str.length()-1; i++){//0,1,2,3 ==>INDEXES

            if(!result.contains(""+str.charAt(i)))

            result += str.charAt(i);//ab

        }

        System.out.println(result);

        String result2 = "";

        for(int i = 0; i <= str.length()-1; i++){

            if(result2.contains(""+str.charAt(i))){//if the string does not contain str.charAt(i)
                //then we concatenate  it to result, if it is already contained, then we dont concatenate it to result
                continue;
            }
            result2 += str.charAt(i);

        }
        System.out.println(result2);
    }
}
