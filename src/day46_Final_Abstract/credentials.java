package day46_Final_Abstract;

public class credentials {

    /*
    i can only generate getter for final variables, because they cannot be reassigned
     */

     final private String username = "Cybertek";
     final private String password = "CtberTek12345";

    public String getUsername() {
        return username;
    }
    /*

it will give us a compiler error because setter cannot be generated for final keywords
        public void setUsername(String username){

        this.username = username;
    }
     */


    public String getPassword() {
        return password;
    }


}
