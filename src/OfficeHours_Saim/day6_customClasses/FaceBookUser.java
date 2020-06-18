package OfficeHours_Saim.day6_customClasses;

import java.util.ArrayList;

public class FaceBookUser extends SocialMedia implements Groups {
   /*
   (*) Create a class for a facebook user which inherits the Social Media class
 and additional instance variables: username, password, full name, age, and
 number of friends
(*) Encapsulate all the variables.
    */

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private int numberOfGroups;
    private ArrayList<Post> posts;

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {

        this.numberOfGroups = numberOfGroups;
    }

    static {

        platform = "facebook.com/";
    }

    //personalUrl = "facebook.com/" + username;

    /*
    (*) Create a constructor which will create a facebook user by taking username
 and password.

    - inside constructor assign the user's person url by taking 'facebook.com/'
     and adding their username
    - Set the account length to 0
    - Set the platform for "Facebook" using static block
     */
    public FaceBookUser(String username, String password){

       setUsername(username);
       setPassword(password);
       personalUrl = "facebook.com/"+username;
       accountLength = 0;
       posts = new ArrayList<>();

    }
    /*
    Overload the constructor to accept username, password, and the user’s name
            */

    public FaceBookUser(String username, String password, String fullName){

        this(username, password);

        setFullName(fullName);

    }
    /*
(*) Overload the constructor to accept username, password, the user’s name,
 age and number of friends.
     */

    public FaceBookUser(String username, String password, String fullName,
                        int age, int numberOfFriends){

        this(username, password, fullName);



    }

    public String getUsername(){

        return username;
    }

    public String getPassword(){

        return password;
    }
    public String getFullName(){

        return fullName;
    }
    public int getAge(){

        return age;

    }
    public int getNumberOfFriends(){

        return numberOfFriends;
    }

    public void setUsername(String username){

        this.username = username;
    }
    /*
      - If the password contains the username then it is not a valid password
    and should not be saved. In this case Print “Password contained username.
     Default password created: ‘password’” and set the password for the user
      to the default value.
     */
    public void setPassword(String password){

        if(password.contains(username)){

            System.out.println("Invalid Password.Password contained username.");
            password = "password";
        }

        this.password = password;
    }
/*
 - If the name entered has any characters that are not letters from the
    alphabet, then the name is invalid. In this case print “invalid name”
    and assign the name value to be ‘no name’
 */
    public void setFullName(String fullName){

        boolean isValid = true;
        String check = fullName.replace(" ", "");

        for(int i = 0; i < fullName.length(); i++){

            if(! Character.isLetter(fullName.charAt(i))){

              isValid = false;

              break;

            }

        }

        if(isValid) {

            this.fullName = fullName;

        }else{

            System.out.println("Invalid Name");
            this.fullName = "no name";
        }

    }

    /*
Only store the age and number of friends into the variables if they are valid
numbers ( No negative numbers ). If they are invalid print “Invalid
(age/number of friends) and keep the values as the default of 0.
 */
    public void setAge(int age){

        if(age < 0){

            System.out.println("Invalid age");
            this.age = 0;
        }
        this.age = age;
    }

    public void setNumberOfFriends(int numberOfFriends){

        if(numberOfFriends >= 0){

            this.numberOfFriends = numberOfFriends;

        }else {

            System.out.println("Invalid number of friends");
            this.numberOfFriends = 0;
        }
    }
    /*
    (*) Implement all methods coming from Social Media class
    (*) Direct messaging(String username, String message)
        - print = %message sent to %username
            (*) Post(String body)
            - Should be added to the the ArrayList of Posts of the user
            (*) Notifications(int time)
            - Checks the current time. If the time is between 8 am - 5 pm print
             "Notification", otherwise print "Sleep mode"
            (*) Override the toString method to print all of the information
             of a Facebook user when they are searched.


     */
    @Override
    public boolean directMessaging(String username, String message){

        if(message.isEmpty()){

            return false;

        }else {

            System.out.println(message + " sent to " + username);

            return true;
        }
    }


    @Override
    public boolean post(String body){

        Post post =  new Post(body);
        posts.add(post);
        return false;
    }
    @Override
    public void notification(int time){

        if(time >= 8 && time <= 17){

            System.out.println("Notification");
        }else{

            System.out.println("Sleep mode");
        }

    }
    @Override
    public boolean joinGroup(String name){


        System.out.println(fullName+" welcome to "+ name);
        numberOfGroups++;
        return true;
    }
    @Override
    public boolean leaveGroup(String name){

        System.out.println(fullName+" , do you really want to leave "+name+" ?");
        numberOfGroups--;
        return true;
    }




}
