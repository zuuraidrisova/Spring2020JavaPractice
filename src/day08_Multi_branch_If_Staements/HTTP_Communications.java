package day08_Multi_branch_If_Staements;

public class HTTP_Communications {

    public static void main(String []args){
        int StatusCode =0;

        if(StatusCode==200){
            System.out.println("Ok");
        }else if(StatusCode==201){
            System.out.println("Created");
        }else if(StatusCode==202){
            System.out.println("Accepted");
        }else if(StatusCode==301){
            System.out.println("Moved Permanently");
        }else if(StatusCode==303){
            System.out.println("See other");
        }else if(StatusCode==304){
            System.out.println("Not Modified");
        }else if(StatusCode==307){
            System.out.println("Temporary Redirect");
        }else if(StatusCode==400){
            System.out.println("Bad Request");
        }else if(StatusCode==401){
            System.out.println("Unauthorized");
        }else if(StatusCode==403){
            System.out.println("Forbidden");
        }else if(StatusCode==404){
            System.out.println("Not Found");
        }else if(StatusCode==410){
            System.out.println("Gone");
        }else if(StatusCode==500){
            System.out.println("Internal Server Error");
        }else if(StatusCode==503){
            System.out.println("Service Unavailable");
        }
    }
}
