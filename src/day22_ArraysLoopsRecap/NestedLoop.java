package day22_ArraysLoopsRecap;

public class NestedLoop {

    public static void main(String[] args) {

        char [][] arr2D = { { 'A','B'  }, { 'C','D', 'E'  } ,{'F','G','H','J'  }  };
        //each index in arr2D must be single dimensional arrays

        //arr2D[0] ==> {'A','B'}

        for(int i = 0; i < arr2D[0].length; i++ ){

            System.out.println(arr2D[0][i]);
        }

        //arr2D[1] ==> {'C','D','E'}

        for(int i = 0; i < arr2D[1].length; i++){
            System.out.println(arr2D[1][i]);
        }

        //arr2D[2] ==> {'F','G','H','J'}

        for(int i = 0; i < arr2D[2].length; i++){
            System.out.println(arr2D[2][i]);
        }


        System.out.println("=============================");

        for(int j = 0; j < arr2D.length; j++){// j represents index number of single dimensional array in two dimensional array

            for(int i = 0; i < arr2D[j].length; i++){// i represents index number of each element in single dimensional array

                System.out.println(arr2D[j][i]);
            }

        }







    }
}
