package reviewPracticing;

public class Credentials {
     /*two instance variables:
            username and password cannot be accessed directly
           generate getter and setter for private data, so we can access them
           outside class
     */
    private String username;
    private String password;

    public void setUsername(String username){

        this.username = username;
    }

    public void  setPassword(String password){

        this.password = password;
    }

    public String getUsername(){

        return username;
    }

    public String getPassword(){

        return password;
    }
}

class CredentialsObject{

    public static void main(String[] args) {

        Credentials credit = new Credentials();

        System.out.println("credit.getUsername() = " + credit.getUsername());
        System.out.println("credit.getPassword() = " + credit.getPassword());

        credit.setUsername("zuura");
        credit.setPassword("chicago");

        System.out.println("credit.getUsername() = " + credit.getUsername());
        System.out.println("credit.getPassword() = " + credit.getPassword());

    }
}