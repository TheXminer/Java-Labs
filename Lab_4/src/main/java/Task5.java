import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Task5 {
    private HashMap<Integer, Book> bookHashMap = new HashMap<>();

    public void addBook(Book book, int ISBN){
        if(book == null)
            return;
        bookHashMap.put(ISBN, book);
    }

    public boolean deleteBook(int ISBN){
        if(bookHashMap.remove(ISBN) != null){
            return true;
        }
        return false;
    }

    public ArrayList<Book> getListByTitle(){
        ArrayList<Book> bookList = new ArrayList<>(bookHashMap.values());
        bookList.sort(Comparator.comparing(Book::getTitle));
        return bookList;
    }
    public ArrayList<Book> getListByPrice(){
        ArrayList<Book> bookList = new ArrayList<>(bookHashMap.values());
        bookList.sort(Comparator.comparing(Book::getPrice));
        return bookList;
    }
    public ArrayList<Book> getListByAuthor(){
        ArrayList<Book> bookList = new ArrayList<>(bookHashMap.values());
        bookList.sort(Comparator.comparing(Book::getLastName).thenComparing(Book::getFirstName));
        return bookList;
    }
}
class Book {
    private String title;
    private String lastName;
    private String firstName;
    private String middleName;
    private String publisher;
    private int year;
    private float price;

    public Book(String title, String lastName, String firstName, String middleName, String publisher, int year, float price) {
        this.title = title;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " by " + lastName + " " + firstName + " " + middleName +
                ", Publisher: " + publisher + ", Year: " + year + ", Price: $" + price;
    }
}