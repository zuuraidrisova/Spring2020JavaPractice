package WarmUp_Practices;

public class noDuplicates {

    public static void main(String[] args) {

        String str = "zuuuuuuuura";

        String result = "";

        for(int i = 0; i < str.length(); i++){

            if(!result.contains(""+str.charAt(i))){

                result += str.charAt(i);
            }
        }

        System.out.println(result);

        int count = 0;
        String u = "u";

        while(str.contains("u")){

            count++;

            str = str.replaceFirst("u","");
        }

        System.out.println(count);

        String str2 = "Zuuuuuraaaaa";
        String uniques = "";

        for(int i = 0; i < str2.length(); i++){

            int count1 =0 ;

            for(int j = 0; j < str2.length(); j++){

                if(str2.charAt(i) == str2.charAt(j)){

                    count1++;
                }
            }

            if(count1 == 1){

                uniques += str2.charAt(i);
            }
        }

        System.out.println(uniques);
    }
}
