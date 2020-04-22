package WarmUp_Practices;

public class helloWorldForLoop {
    public static void main(String[] args) {

      for(int i = 0; i <= 5;i++){


          if(i == 3){
              break;
          }

          System.out.println("Hello World!");//it will print the statement three times, bcs top to bottom

      }

      for(char i = 'a'; i <= 'z'; i++){

          System.out.println(i); //it will print from a to d,bcs top to bottom

          if (i == 'd') {

              break;
          }


      }

      for(int i = 0; i <= 5; i++){


        //  System.out.println(i); it is not gonna skip the iteration, bcs java top to bottom

          if(i ==  3){
              continue;
          }

          System.out.println(i);

      }










    }
}
