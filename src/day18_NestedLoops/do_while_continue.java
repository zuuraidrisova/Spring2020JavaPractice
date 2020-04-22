package day18_NestedLoops;

public class do_while_continue {
    public static void main(String[] args) {
        int y = 1;
        do{
            if(y==3){//if y is equal to 3 then skip it
                y++;//to make iteration continue y++;
                continue;//will skip the iteration
            }
            System.out.println(y);
            y++;

        }while(y<=5);



        int t=1;
        do{
            if(t%2 !=0){
                t++;//to make sure that the iterator(increment) does not get skipped
                continue;

            }
            System.out.print(t+" ");
            t++;
        }while(t<=100);






    }
}
