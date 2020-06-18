package OfficeHours_Saim.day6_customClasses;

public abstract class SocialMedia {

    /*
    Social Media
(*) Create an abstract class for Social Media that has the following features:
    - Direct messaging(String username, String message)
    - Post(String body)
    - Notifications(int time)
(*) The Social Media will also have the following fields:

    - Personal URl (String)
    - Account length (int)
    - Platform (static String)

     */
    protected  String personalUrl;
    protected long accountLength;
    protected static String platform;


    public abstract boolean directMessaging(String username, String message);

    public abstract boolean post(String body);

    public abstract void notification(int time);








}
