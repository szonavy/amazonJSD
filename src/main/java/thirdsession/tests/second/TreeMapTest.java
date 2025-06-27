package thirdsession.tests.second;

import java.util.TreeMap;

public class TreeMapTest {
    public static TreeMap<String, String> books = new TreeMap<String, String>();

    public static void addOrUpdateBook(String isbn, String title) {
        // TODO 1: add or update to the TreeMap
        books.put(isbn,title);
    }

    public static void removeBook(String isbn) {
        // TODO 2: check and remove only if present from the TreeMap, else print appropriate message
        if(!books.containsKey(isbn)){
            System.out.println("This book not exist.");
            return;
        }else{
            books.remove(isbn);
            System.out.println(isbn + ": This book has removed.");
        }
    }

    public static void getBookTitle(String isbn) {
        // TODO 3: get from TreeMap and print appropriate message if not found
        if(!books.containsKey(isbn)){
            System.out.println("This book not exist.");
        }else{
            System.out.println(isbn + ": This book's title is: " + books.get(isbn));
        }

    }

    public static void displayAllBooks() {
        // TODO 4: display all the elements in TreeMap
        for(String i: books.keySet()){
            System.out.println("ISBN: " + i + " title: " + books.get(i) );
        }
    }

    public static void main(String[] args) {
        TreeMap<String, String> inventory = new TreeMap<>();

        // Add or update books
        addOrUpdateBook("978-0134685991", "Effective Java");
        addOrUpdateBook("978-1491950357", "Clean Architecture");
        addOrUpdateBook("978-0132350884", "Clean Code");

        // Display all books
        displayAllBooks();

        // Retrieve the title of a specific book by ISBN
        getBookTitle("978-0134685991");

        // Remove a book
        removeBook("978-1491950357");

        // Display all books after removal
        displayAllBooks();
    }
}
