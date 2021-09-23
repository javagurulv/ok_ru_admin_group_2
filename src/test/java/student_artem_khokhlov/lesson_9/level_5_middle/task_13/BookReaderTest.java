package student_artem_khokhlov.lesson_9.level_5_middle.task_13;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashSet;

public class BookReaderTest extends TestCase {
    Book book1 = new Book("Book Title 1", "Author 1", 2010);
    Book book2 = new Book("Book Title 2", "Author 1", 2011);
    Book book3 = new Book("Book Title 2", "Author 1", 2011);
    Book book4 = new Book("Book Title 1", "Author 1", 2010);
    HashSet<Book> books = new HashSet<>();
    Library testlibrary = new Library(books);

    @Test
    public void testAddBook1() {
        assertTrue("Test normal add book1", testlibrary.add(book1));
        assertTrue("Test normal add book2", testlibrary.add(book2));
    }
    public void testAddBook2() {
        assertTrue("Test normal add book1", testlibrary.add(book1));
        assertTrue("Test normal add book2", testlibrary.add(book2));
        assertFalse("Test add book3 which equals book 2", testlibrary.add(book3));
    }

    public void testAddBook3() {
        assertTrue("Test normal add book1", testlibrary.add(book1));
        assertTrue("Test normal add book2", testlibrary.add(book2));
        assertFalse("Test add book3 which equals book 2", testlibrary.add(book3));
        assertFalse("Test add book4 which equals book1", testlibrary.add(book4));
    }

}