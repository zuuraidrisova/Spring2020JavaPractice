package reviewPracticing;

public class MultiDimensionalArray_Tasks {

    public static void main(String[] args) {

        String [] developers = {"Zeynep","Heider","Jovid"};

        String [] testers = {"Rahman","Ali","Osman","Zuura"};

        String [] po = {"Sary","Chopa"};

        String [][] scrum = {developers, testers, po};

        for (String [] each : scrum){

            for (String item : each){

                System.out.print(item+" ");
            }

            System.out.println();
        }


        String [] wildAnimals = {"Tiger","Lion","Turtles","Monkey"};

        String [] birds = {"Eagle","Ducks","Peacock","Dove"};

        String zoo [][] = {wildAnimals, birds};

        for (String [] each : zoo){

            for (String animal : each){

                System.out.println(animal);
            }

            System.out.println();
        }



    }
}
