package OfficeHours_Saim.day1_StringsLoops;

public class makesTags {
    public static void main(String[] args) {

        /*
        The web is built with HTML strings like "<i>Yay</i>" which draws
         Yay as italic text. In this example, the "i" tag makes <i> and </i>
         which surround the word "Yay". Given tag and word strings, create the
          HTML string with tags around the word, e.g. "<i>Yay</i>".


makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
         */
        String tag = "i";
        String word = "Hello";

        String tagWord = makesTags(tag,word);

        System.out.println(tagWord);
    }

    public static String makesTags(String tag, String word){

        String tagWord = "<"+tag+">"+word+"</"+tag+">";

        return tagWord;



    }
}
