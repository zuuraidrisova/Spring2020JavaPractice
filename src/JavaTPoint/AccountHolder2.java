package JavaTPoint;

public class AccountHolder2 {
    public static void main(String[] args) {

        AccountHolder tom = new AccountHolder();
        AccountHolder zuura = new AccountHolder();

        tom.firstName = "Tom";
        tom.lastName = "Francis";
        tom.age = 21;
        tom.accountBalance = 20000;

        tom.eligibilityForCC();

        zuura.firstName = "Zuura";
        zuura.lastName = "Idrisova";
        zuura.age = 29;
        zuura.accountBalance = 35000;

        zuura.eligibilityForCC();


    }
}
