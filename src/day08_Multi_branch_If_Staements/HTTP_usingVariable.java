package day08_Multi_branch_If_Staements;

public class HTTP_usingVariable {
    public static void main(String[]args){
        int StatusCode = 503;
        String message = " ";
        if(StatusCode==200){
            message="OK";
        }else if(StatusCode==201){
            message="Created";
        }else if(StatusCode==202){
            message="Accepted";
        }else if(StatusCode==301){
            message="Moved Permanently";
        }else if(StatusCode==303){
            message="See Other";
        }else if(StatusCode==304){
            message="Not Modified";
        }else if(StatusCode==307){
            message="Temporary Redirect";
        }else if(StatusCode==400){
            message="Bad Request";
        }else if(StatusCode==401){
            message="Unauthorized";
        }else if(StatusCode==403){
            message="Forbidden";
        }else if(StatusCode==404){
            message="Not Found";
        }else if(StatusCode==410){
            message="Gone";
        }else if(StatusCode==500){
            message="Internal Server Error";
        }else if(StatusCode==503){
            message="Service Unavailable";
        }else{
            message="Invalid Status Code";
        }

        System.out.println(message);
    }
}
