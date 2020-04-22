package WarmUp_Practices;

public class HTTP_Ternary {
    public static void main(String []args){
        int StatusCode = 503;
        String message = (StatusCode==200)? "Ok" :(StatusCode==201)? "Created":
                (StatusCode==202)? "Accepted":(StatusCode==301)? "Moved Permanently":
                        (StatusCode==303)?"See other":(StatusCode==304)?"Not modified":
                                (StatusCode==307)?"Tmeporary Redirect":
                                        (StatusCode==400)?"Bad Request" : (StatusCode==401)? "Unauthorized":
                                                (StatusCode==403)?"Forbidden":(StatusCode==404)?"Not Found":
                                                        (StatusCode==420)?"Gone":(StatusCode==500)?"Internal server error":
                                                                (StatusCode==503)? "Service unavailable" :"Invalid Entry" ;

        System.out.println(message);

    }
}
