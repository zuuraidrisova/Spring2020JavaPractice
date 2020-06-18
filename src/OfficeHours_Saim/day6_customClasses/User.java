package OfficeHours_Saim.day6_customClasses;


public class User {

    public static void main(String[] args) {

        FaceBookUser user1 = new FaceBookUser("java5","kesjava5love");

        user1.setPassword("java5");
        System.out.println(user1.getUsername());
        System.out.println(user1.getPassword());

        FaceBookUser user2 = new FaceBookUser("jamesB","pass07","James Bond");

        System.out.println(user2.getUsername());
        System.out.println(user2.personalUrl);
        System.out.println(user2.accountLength);
        user2.setFullName("james382al");
        System.out.println(user2.getFullName());

        System.out.println("==================================");

        Post post = new Post("hello world");

        System.out.println(post.getDateAndTime());

        System.out.println(post);

    }
}
