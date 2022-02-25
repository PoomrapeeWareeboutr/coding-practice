// import java.util.*;

abstract class Book {
    String title;
    String author;
    
    // This is a constructor of this abstract class
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    private int price;
    /**   
    *   Class Constructor
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

public class AbstractClass {
    
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        String title = "How to be a god";
        String author = "Poomrapee Wareeboutr";
        int price = 370;
        // scanner.close();
        
        Book book = new MyBook(title, author, price); // Upcast
        book.display();
    }
}