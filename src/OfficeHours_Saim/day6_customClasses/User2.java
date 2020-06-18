package OfficeHours_Saim.day6_customClasses;

public class User2 {

    public static void main(String[] args) {

        FaceBookUser user = new FaceBookUser("jbond5","007","James Bond");

        user.post("My first post");
        user.post("Taday was good");
        user.post("Okay dinner time");


        System.out.println(user.getPosts());
    }
}
