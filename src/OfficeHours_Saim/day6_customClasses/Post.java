package OfficeHours_Saim.day6_customClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {

    /*
 Create a class that has the following instance variable:
 String body, and String dateTime
 - Encapsulate body. Provide a public getter and setter(update)
 - Make dateTime final and read only (getter)
(*) Create a constructor that will take the body and initialize store it
to the instance variable. Upon creation of the post the current time
should be taken and stored into the dateTime variable
(*) Implement post method to create a post by the given body and store
it to the ArrayList of Posts of the user

  */
    private String body;
    private String dateAndTime;

    public Post(String body){

        this.body = body;
        setDateAndTime();
    }
    public String getBody(){

        return body;
    }
    public void setBody(String body){

        this.body = body;
    }

    public String getDateAndTime(){

        return dateAndTime;
    }
    public void setDateAndTime(){

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm");
        this.dateAndTime = dt.format(format);

    }
    public String toString(){

        return "Post: "+body+"\n"+dateAndTime;
    }

}
