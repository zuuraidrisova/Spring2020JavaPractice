package day42_Inheritance;

public class Book {

    //title, type,author, price

    public String title;
    public String type;
    public String author;
    public double price;

    public String toString(){//toString method is also inherited by sub classes

        return "Title: \""+title+"\" Author: "+author+" Price: $"+price;
    }

}
class Ebook extends Book{

    //title, type,author, price == > inherited
    //size instance variable is declared
    //pages instance variable is declared
    // readBook() is declared
    //toString() is inherited

    public String size;
    public int pages;

    public void readBook(){

        System.out.println("reading "+title);
    }


    public static void main(String[] args) {

        Ebook book =  new Ebook();

        book.title = "Djamilya";
        book.type = "fiction";
        book.author = "Chyngyz Aytmatov";
        book.price =  50;
        book.size = "12MB";
        book.pages =  125;

        book.readBook();
        System.out.println(book);
    }
}
class AudioBook extends Book{
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

    public String narrator;
    public String length;

    public void listenBook(){

        System.out.println("listening to "+title);
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
        System.out.println(book);
    }
}