package student_andrey_domas.lesson9.level5_6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookReaderTest {

    BookReader bookReader;
    Book book0 = new Book("Test title 0", "Test author 0");
    Book book1 = new Book("Test title 1", "Test author 1");
    Book book2 = new Book("Test title 2", "Test author 2");

    @Before
    public void setup() {
        bookReader = new BookReaderImpl();
        bookReader.add(book0);
        bookReader.add(book1);
    }

    @Test
    public void addTest() {
        Assert.assertTrue(bookReader.add(book2));
    }

    @Test
    public void addExistsTest() {
        Assert.assertFalse(bookReader.add(book1));
        Assert.assertEquals(2, bookReader.list().length);
    }

    @Test
    public void addNullTest() {
        Book book;

        book = new Book(null, "xxx");
        Assert.assertFalse(bookReader.add(book));
        Assert.assertEquals(2, bookReader.list().length);

        book = new Book("xxx", null);
        Assert.assertFalse(bookReader.add(book));
        Assert.assertEquals(2, bookReader.list().length);

        book = new Book(null, null);
        Assert.assertFalse(bookReader.add(book));
        Assert.assertEquals(2, bookReader.list().length);
    }

    @Test
    public void listTest() {
        String[] rv = bookReader.list();
        String[] expected = {
                "Test title 0 [Test author 0]",
                "Test title 1 [Test author 1]",
        };
        Assert.assertArrayEquals(expected, rv);
    }

    @Test
    public void removeTest() {
        Assert.assertTrue(bookReader.remove(book0));
        Assert.assertEquals(1, bookReader.list().length);

        Assert.assertFalse(bookReader.remove(book0));
        Assert.assertEquals(1, bookReader.list().length);

        Assert.assertTrue(bookReader.remove(book1));
        Assert.assertEquals(0, bookReader.list().length);
    }

    @Test
    public void findByAuthorFullTest() {
        Book[] rv = bookReader.findByAuthor("Test author 1");
        Book[] expected = { book1 };
        Assert.assertArrayEquals(expected, rv);
    }

    @Test
    public void findByAuthorPartialTest() {
        Book[] rv = bookReader.findByAuthor("Test author");
        Book[] expected = { book0, book1 };
        Assert.assertArrayEquals(expected, rv);
    }

    @Test
    public void findByAuthorNotFoundTest() {
        Book[] rv = bookReader.findByAuthor("unexists");
        Assert.assertEquals(0, rv.length);
    }

    @Test
    public void findByTitleTest() {
        Book[] rv = bookReader.findByTitle("Test title 1");
        Book[] expected = { book1 };
        Assert.assertArrayEquals(expected, rv);
    }

    @Test
    public void findByTitleNotFoundTest() {
        Book[] rv = bookReader.findByTitle("unexists");
        Assert.assertEquals(0, rv.length);
    }

    @Test
    public void findByTitlePartialTest() {
        Book[] rv = bookReader.findByTitle("Test title");
        Book[] expected = { book0, book1 };
        Assert.assertArrayEquals(expected, rv);
    }

    @Test
    public void findByTitleNullTest() {
        Assert.assertEquals(0, bookReader.findByTitle(null).length);
    }

    @Test
    public void findByAuthorNullTest() {
        Assert.assertEquals(0, bookReader.findByAuthor(null).length);
    }

    @Test
    public void markReadUnreadTest() {
        Assert.assertTrue(bookReader.markAsRead(book1));
        String[] expectedRead = {
                "Test title 1 [Test author 1]",
        };
        String[] expectedUnRead = {
                "Test title 0 [Test author 0]",
        };
        Assert.assertArrayEquals(expectedRead, bookReader.listRead());
        Assert.assertArrayEquals(expectedUnRead, bookReader.listUnread());

        Assert.assertTrue(bookReader.markAsUnread(book1));
        String[] expectedRead_after_Unread = {
        };
        String[] expectedUnRead_after_Unerad = {
                "Test title 0 [Test author 0]",
                "Test title 1 [Test author 1]",
        };
        Assert.assertArrayEquals(expectedRead_after_Unread, bookReader.listRead());
        Assert.assertArrayEquals(expectedUnRead_after_Unerad, bookReader.listUnread());
    }

    @Test
    public void markReadUnexistsTest() {
        Assert.assertFalse(bookReader.markAsRead(book2));
    }

    @Test
    public void markUnreadUnexistsTest() {
        Assert.assertFalse(bookReader.markAsUnread(book2));
    }

}
