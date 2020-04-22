package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

      //  int scores = 90;//regular data takes only one data
        /*
        declaration:
                    DataType variableName = {data1.data2,data3};
         */
// multiple data 70,75,85,90,95,100  ===>scores ==>variable name
        int [] scores = {70,75,85,90,95,100};
            //            0  1  2  3  4  5
// each data has its index number
        int num1  = scores[2];//we can assign it to int bcs int is data type
        System.out.println(num1); //85
        //retrive data :  scores [2]==>85

        int num2 = scores [5];
        System.out.println(num2);



        String [] friendsNames ={"Madina","Judy","Sada","Gulzara","Selcuk","Rahman"};
                            //      0       1       2       3         4        5

        String friend1  = friendsNames[5];//we can assign it to its data type
        System.out.println(friend1);

        System.out.println(friendsNames[1]);//or we can just give it in print statement

        System.out.println("========================");

        for(int i = 0; i <= friendsNames.length-1;i++){
            System.out.println(friendsNames[i]);
        }

        System.out.println("==================");

        String [] cities = { "Paris","Amsterdam","London", "Beijing", "Tokio","Seoul"};

        for(int i = 0; i <= cities.length-1; i++){
            String city = cities[i];
            System.out.println(city);
        }


        System.out.println("======================");
        String [] emails = { "cybertek@yahoo.com", "cybertek@gmail.com",  "cybertek@hotmail.com","cybertek@outlook.com"};
            //print all emails which registered with gmails
           //   max: 4....but it has 0,1,2,3 ==>index

        for(int i = 0; i <= emails.length-1; i++){
            String email = emails[i];
            if(email.endsWith("@gmail.com")){
                System.out.println(email);
            }
        }

    }
}
