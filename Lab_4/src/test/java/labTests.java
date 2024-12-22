import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class labTests {
    @Test
    public void task1_GettingValuesTest(){
        Task1 task1 = new Task1();
        var abonent1 = new Abonent("Іваненко", "Іван", "Іванович", "Київ");
        task1.addAbonent(380991234567L,abonent1);
        var abonent2 = new Abonent("Петренко", "Петро", "Петрович", "Львів");
        task1.addAbonent(380981234568L, abonent2);
        var abonent3 = new Abonent("Сидоренко", "Олексій", "Олександрович", "Одеса");
        task1.addAbonent(380671234569L, abonent3);
        var abonent4 = new Abonent("Коваленко", "Марія", "Іванівна", "Харків");
        task1.addAbonent(380501234570L, abonent4);
        var abonent5 = new Abonent("Тарасенко", "Тарас", "Григорович", "Дніпро");
        task1.addAbonent(380631234571L, abonent5);

        ArrayList<Abonent> trueOrder = new ArrayList<>();
        Collections.addAll(trueOrder, abonent1, abonent4, abonent2, abonent3, abonent5);
        var abonnents = task1.getAbonents();
        assertEquals(trueOrder, abonnents);
    }
    @Test
    public void task1_SortByFirstNameTest(){
        Task1 task1 = new Task1();
        var abonent1 = new Abonent("Іваненко", "Іван", "Іванович", "Київ");
        task1.addAbonent(380991234567L,abonent1);
        var abonent2 = new Abonent("Петренко", "Петро", "Петрович", "Львів");
        task1.addAbonent(380981234568L, abonent2);
        var abonent3 = new Abonent("Сидоренко", "Олексій", "Олександрович", "Одеса");
        task1.addAbonent(380671234569L, abonent3);
        var abonent4 = new Abonent("Коваленко", "Марія", "Іванівна", "Харків");
        task1.addAbonent(380501234570L, abonent4);
        var abonent5 = new Abonent("Тарасенко", "Тарас", "Григорович", "Дніпро");
        task1.addAbonent(380631234571L, abonent5);

        ArrayList<Abonent> trueOrder = new ArrayList<>();
        Collections.addAll(trueOrder, abonent1, abonent4, abonent3, abonent2, abonent5);
        var fnSort = task1.getAbonents_FirstNameSort();
        assertEquals(trueOrder, fnSort);
    }
    @Test
    public void task1_SortByLastNameTest(){
        Task1 task1 = new Task1();
        var abonent1 = new Abonent("Іваненко", "Іван", "Іванович", "Київ");
        task1.addAbonent(380991234567L,abonent1);
        var abonent2 = new Abonent("Петренко", "Петро", "Петрович", "Львів");
        task1.addAbonent(380981234568L, abonent2);
        var abonent3 = new Abonent("Сидоренко", "Олексій", "Олександрович", "Одеса");
        task1.addAbonent(380671234569L, abonent3);
        var abonent4 = new Abonent("Коваленко", "Марія", "Іванівна", "Харків");
        task1.addAbonent(380501234570L, abonent4);
        var abonent5 = new Abonent("Тарасенко", "Тарас", "Григорович", "Дніпро");
        task1.addAbonent(380631234571L, abonent5);

        ArrayList<Abonent> trueOrder = new ArrayList<>();
        Collections.addAll(trueOrder, abonent1, abonent4, abonent2, abonent3, abonent5);
        var lnSort = task1.getAbonents_LastNameSort();
        assertEquals(trueOrder, lnSort);
    }

    @Test
    public void task5_getListByAuthorTest(){
        Book book1 = new Book("War and Peace", "Tolstoy", "Leo", "", "Penguin", 1869, 19.99f);
        Book book2 = new Book("Pride and Prejudice", "Austen", "Jane", "", "Oxford", 1813, 14.99f);
        Book book3 = new Book("1984", "Orwell", "George", "", "Harcourt", 1949, 12.99f);
        Book book4 = new Book("The Catcher in the Rye", "Salinger", "J.D.", "", "Little, Brown", 1951, 9.99f);
        Book book5 = new Book("Moby Dick", "Melville", "Herman", "", "Harper & Brothers", 1851, 17.50f);

        Task5 task5 = new Task5();
        task5.addBook(book1, 1234);
        task5.addBook(book2, 3574);
        task5.addBook(book3, 6342);
        task5.addBook(book4, 7252);
        task5.addBook(book5, 1748);

        ArrayList<Book> sortedList, trueBooksOrder = new ArrayList<>();
        sortedList = task5.getListByAuthor();
        Collections.addAll(trueBooksOrder, book2, book5, book3, book4, book1);
        assertEquals(trueBooksOrder, sortedList);
    }
    @Test
    public void task5_getListByTitleTest(){
        Book book1 = new Book("War and Peace", "Tolstoy", "Leo", "", "Penguin", 1869, 19.99f);
        Book book2 = new Book("Pride and Prejudice", "Austen", "Jane", "", "Oxford", 1813, 14.99f);
        Book book3 = new Book("1984", "Orwell", "George", "", "Harcourt", 1949, 12.99f);
        Book book4 = new Book("The Catcher in the Rye", "Salinger", "J.D.", "", "Little, Brown", 1951, 9.99f);
        Book book5 = new Book("Moby Dick", "Melville", "Herman", "", "Harper & Brothers", 1851, 17.50f);

        Task5 task5 = new Task5();
        task5.addBook(book1, 1234);
        task5.addBook(book2, 3574);
        task5.addBook(book3, 6342);
        task5.addBook(book4, 7252);
        task5.addBook(book5, 1748);

        ArrayList<Book> sortedList, trueBooksOrder = new ArrayList<>();
        sortedList = task5.getListByTitle();
        Collections.addAll(trueBooksOrder, book3, book5, book2, book4, book1);
        assertEquals(trueBooksOrder, sortedList);
    }
    @Test
    public void task5_getListByPriceTest(){
        Book book1 = new Book("War and Peace", "Tolstoy", "Leo", "", "Penguin", 1869, 19.99f);
        Book book2 = new Book("Pride and Prejudice", "Austen", "Jane", "", "Oxford", 1813, 14.99f);
        Book book3 = new Book("1984", "Orwell", "George", "", "Harcourt", 1949, 12.99f);
        Book book4 = new Book("The Catcher in the Rye", "Salinger", "J.D.", "", "Little, Brown", 1951, 9.99f);
        Book book5 = new Book("Moby Dick", "Melville", "Herman", "", "Harper & Brothers", 1851, 17.50f);

        Task5 task5 = new Task5();
        task5.addBook(book1, 1234);
        task5.addBook(book2, 3574);
        task5.addBook(book3, 6342);
        task5.addBook(book4, 7252);
        task5.addBook(book5, 1748);

        ArrayList<Book> sortedList, trueBooksOrder = new ArrayList<>();
        sortedList = task5.getListByPrice();
        Collections.addAll(trueBooksOrder, book4, book3, book2, book5, book1);
        assertEquals(trueBooksOrder, sortedList);
    }
    @Test
    public void task5_deleteBookTest(){
        Book book1 = new Book("War and Peace", "Tolstoy", "Leo", "", "Penguin", 1869, 19.99f);
        Book book2 = new Book("Pride and Prejudice", "Austen", "Jane", "", "Oxford", 1813, 14.99f);
        Book book3 = new Book("1984", "Orwell", "George", "", "Harcourt", 1949, 12.99f);
        Book book4 = new Book("The Catcher in the Rye", "Salinger", "J.D.", "", "Little, Brown", 1951, 9.99f);
        Book book5 = new Book("Moby Dick", "Melville", "Herman", "", "Harper & Brothers", 1851, 17.50f);

        Task5 task5 = new Task5();
        task5.addBook(book1, 1234);
        task5.addBook(book2, 3574);
        task5.addBook(book3, 6342);
        task5.addBook(book4, 7252);
        task5.addBook(book5, 1748);

        assertTrue(task5.deleteBook(1234));
        assertFalse(task5.deleteBook(1234));
        assertFalse(task5.deleteBook(1232));
    }

    @Test
    public void task16_addProductTest(){
        Product product = new Product("prodA", 1.0f);
        Task16 task16 = new Task16();
        task16.addProduct(12345, product);
        assertEquals(product, task16.getProduct(12345));
    }
    @Test
    public void task16_updateWrongPriceTest(){
        Product product = new Product("prodA", 1.0f);
        Task16 task16 = new Task16();
        task16.addProduct(12345, product);
        assertFalse(task16.updateProductPrice(12345, -1.0f));
    }
    @Test
    public void task16_updateCorrectPriceTest(){
        Product product = new Product("prodA", 1.0f);
        Task16 task16 = new Task16();
        task16.addProduct(12345, product);

        assertTrue(task16.updateProductPrice(12345, 6.6f));

        var updatedProduct = task16.getProduct(12345);
        assertEquals(6.6f, updatedProduct.price);
    }
    @Test
    public void task16_uniqueNameCheckTest(){
        Product product = new Product("prodA", 1.0f);
        Task16 task16 = new Task16();
        assertFalse(task16.checkUniqueName("prodA"));
        task16.addProduct(12345, product);
        assertTrue(task16.checkUniqueName("prodA"));
        task16.addProduct(35673, product);
        assertFalse(task16.checkUniqueName("prodA"));
    }

    @Test
    public void task30_addFileTest(){
        var textFile = new TextFile("\\your path", "some info");
        Task30 task30 = new Task30();
        assertTrue(task30.addFile("new File", textFile));
        var getFile = task30.getTextFile("new File");
        assertTrue((getFile.getAbsolutePath() == textFile.getAbsolutePath() && getFile.getDescription() == textFile.getDescription()));
    }
    @Test
    public void task30_addWrongFileTest_1(){
        var textFile = new TextFile(null, "some info");
        Task30 task30 = new Task30();
        assertFalse(task30.addFile("new File", textFile));
        var getFile = task30.getTextFile("new File");
        assertNull(getFile);
    }
    @Test
    public void task30_addWrongFileTest_2(){
        var textFile = new TextFile("\\your path", null);
        Task30 task30 = new Task30();
        assertFalse(task30.addFile(null, textFile));
        var getFile = task30.getTextFile("new File");
        assertNull(getFile);
    }
    @Test
    public void task30_addWrongFileTest_3(){
        var textFile = new TextFile("\\your path", null);
        Task30 task30 = new Task30();
        assertTrue(task30.addFile("new File", textFile));
        var getFile = task30.getTextFile("new File");
        assertNotNull(getFile);

        assertFalse(task30.addFile("new File", textFile));
    }
    @Test
    public void task30_deleteFileTest(){
        var textFile = new TextFile("\\your path", "some info");
        Task30 task30 = new Task30();
        assertTrue(task30.addFile("new File", textFile));
        assertTrue(task30.deleteFile("new File"));
        assertTrue(task30.getTextFile("new File") == null);
    }
}
