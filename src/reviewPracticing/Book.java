package reviewPracticing;

public class Book {

    //title, type,author, price

    public String title;
    public String type;
    public String author;
    public double price;

    public String toString(){

        return "Title: \""+title+"\" Author: "+author+" Price: $"+price;

    }

}

class AudioBook extends  Book{

    /*
    title is inherited
    author is inherited
    price is inherited
    type is inherited

    length is declared
    narrator is declared

    listenBook() is declared method
    toString() is inherited method
 */

    public String length;
    public String narrator;

    public void listenBook(){

        System.out.println(narrator+" is narrating "+title);
    }

    public static void main(String[] args) {

        AudioBook book = new AudioBook();

        book.title = "White Ship";
        book.type = "fiction";
        book.author = "Chyngyz Aytmatov";
        book.price =  50;
        book.narrator = "Ernis Kiyaz";

        book.length = "3 hours 22 minutes";

        book.listenBook();

        System.out.println("book = " + book);
    }

}

class Ebook extends  Book{

    //title, type,author, price == > inherited
    //size instance variable is declared
    //pages instance variable is declared
    // readBook() is declared
    //toString() is inherited

    public String size;
    public int pages;

    public void readBook(){

        System.out.println("Reading "+title);
    }

    public static void main(String[] args) {

        Ebook book = new Ebook();

        book.title = "White Ship";
        book.type = "fiction";
        book.author = "Chyngyz Aytmatov";
        book.price =  50;

        book.pages = 230;

        book.readBook();

        System.out.println("book = " + book);
    }

}