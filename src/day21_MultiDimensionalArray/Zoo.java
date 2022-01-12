package day21_MultiDimensionalArray;

public class Zoo {

    public static void main(String[] args) {

        String [] wildAnimals = {"Tiger","Lion","Turtles","Monkey"};

        String [] birds = {"Eagle","Ducks","Peacock","Dove"};

        String [] [] zoo = {wildAnimals,birds};

        String animal1 =  zoo[1][3];

        System.out.println(animal1);

        System.out.println("===================");

        for(String eachBirds : zoo [1]){//print each element in zoo's  single-dimensional array at index 1

            if(eachBirds.equalsIgnoreCase("dove")){//print without dove

                continue;
            }

            System.out.println(eachBirds);
        }

        System.out.println("==================");

        for(String eachWild : zoo[0]){

                if(eachWild.equalsIgnoreCase("monkey")){//print without monkey

                    continue;
                }

                System.out.println(eachWild);
        }



    }
}
