package Replit_Practices;

public class printUniquesWords2 {

    /*
   Complete a void method printUniqueWords() that will print only unique words
    from an array of strings. Every single unique word should be printed from
    the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
    */
    public static void main(String[] args) {

        String [] words = {"java", "code", "python", "code", "rust", "code", "rust"};

        printUniqueWords(words);


    }
    public static void printUniqueWords(String [] words){


        for(int i = 0; i < words.length; i++){

            int count = 0;

            for(int j = 0; j < words.length; j++){

                if(words[i].equals(words[j])){

                    count++;
                }
            }

            if(count == 1){

                System.out.println(words[i]);
            }
        }

    }
}
