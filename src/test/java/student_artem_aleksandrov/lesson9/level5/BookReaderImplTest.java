package student_artem_aleksandrov.lesson9.level5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    BookReaderImpl bookReader = new BookReaderImpl();
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void setUp() throws Exception {
        book1 = new Book("Lenin", "What to Do?");
        book2 = new Book("Chernyshevsky", "What to Do?");
        book3 = new Book("Pushkin", "Evgeniy Onegin");
        book4 = new Book("Pushkinn", "XXX");

        bookReader.addBook(book2.getAuthor(), book2.getBookName());
        bookReader.addBook(book3.getAuthor(), book3.getBookName());
        bookReader.addBook(book4.getAuthor(), book4.getBookName());
    }

    @Test
    public void addBook() {
        String author = "Lenin";
        String bookName = "What to Do";
        assertEquals(bookReader.addBook(author, bookName), true);
        assertEquals(bookReader.addBook(author, bookName), false);
    }

    @Test
    public void delBook() {
        String author = book2.getAuthor();
        String bookName = book2.getBookName();
        assertEquals(true, bookReader.delBook(author, bookName));
        assertEquals(false, bookReader.delBook(author, bookName));
        assertEquals(false, bookReader.delBook("Non Exist", bookName));
    }

    @Test
    public void list() {
        String expectedString = "What to Do? [Chernyshevsky]\nEvgeniy Onegin [Pushkin]\nXXX [Pushkinn]";
        assertEquals(expectedString, bookReader.list().stripTrailing());
    }

    @Test
    public void searchBook() {
        List<Book> expectedBooks = new ArrayList<>();
        List<Book> emptyList = new ArrayList<>();
        expectedBooks.add(book3);
        expectedBooks.add(book4);
        assertEquals(expectedBooks, bookReader.searchBook("Pushk"));
        assertEquals(emptyList, bookReader.searchBook("NonExists"));
    }
}