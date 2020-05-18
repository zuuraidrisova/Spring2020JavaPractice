package day40_Encapsulation;

public class credentials {

    /*two instance variables:
            username and password cannot be accessed directly
           generate getter and setter for private data, so we can access them
           outside class
     */

    private String username;
    private String password;

    public String getUsername(){

        return username;
    }
    public String getPassword(){

        return password;
    }

    public void setUsername(String username){

        this.username = username;
    }
    public void setPassword(String password){

        this.password = password;
    }


}
class CredentialObject{

    public static void main(String[] args) {

        credentials facebook = new credentials();

        System.out.println(facebook.getUsername());//currently null==? default value
        System.out.println(facebook.getPassword());

        facebook.setUsername("zuura");//setting username value
        facebook.setPassword("zuura90");//setting password value

        System.out.println("username is: "+facebook.getUsername());//now we have values
        System.out.println("password is: "+facebook.getPassword());


    }
}