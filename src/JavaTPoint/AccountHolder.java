package JavaTPoint;

public class AccountHolder {

    String firstName;
    String lastName;
    int age;
    double accountBalance;
    boolean eligibilityForCC;

    public void eligibilityForCC(){


        if(age > 25  &&  accountBalance >= 20000 ){

            eligibilityForCC = true;
        }else{
            eligibilityForCC = false;
        }

        System.out.println(eligibilityForCC);
    }
}
