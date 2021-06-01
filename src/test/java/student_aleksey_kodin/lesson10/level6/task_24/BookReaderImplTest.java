package student_aleksey_kodin.lesson10.level6.task_24;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {
    BookReaderImpl bookReader = new BookReaderImpl();
    Book book_1 = new Book("Author#1", "Name#1");
    Book book_2 = new Book("Author#2", "Name#2");

    @Test
    public void createFinishedBookList_Not_Records() {
        String[] result = bookReader.createFinishedBookList();

        int length = result.length;

        assertEquals(0, length);
    }

    @Test
    public void createFinishedBookList_Check_Length_1() {
        bookReader.addBook(book_1);

        bookReader.finishedBooks(book_1);
        String[] result = bookReader.createFinishedBookList();

        int length = result.length;

        assertEquals(1, length);
    }

    @Test
    public void createFinishedBookList_Check_Length_2() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        bookReader.finishedBooks(book_1);
        String[] result = bookReader.createFinishedBookList();

        int length = result.length;

        assertEquals(1, length);
    }

    @Test
    public void createFinishedBookList_Check_Length_3() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        bookReader.finishedBooks(book_1);
        bookReader.finishedBooks(book_2);
        String[] result = bookReader.createFinishedBookList();

        int length = result.length;

        assertEquals(2, length);
    }

    @Test
    public void createFinishedBookList_Check_First_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        bookReader.finishedBooks(book_1);
        String[] result = bookReader.createFinishedBookList();

        String firstRecord = result[0];
        assertEquals("Name#1" + " [" + "Author#1" + "]", firstRecord);
    }

    @Test
    public void createFinishedBookList_Check_Second_Record() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        bookReader.finishedBooks(book_2);
        String[] result = bookReader.createFinishedBookList();

        String firstRecord = result[0];
        assertEquals("Name#2" + " [" + "Author#2" + "]", firstRecord);
    }

    @Test
    public void createFinishedBookList_Check_Second_Record_2() {
        bookReader.addBook(book_1);
        bookReader.addBook(book_2);

        bookReader.finishedBooks(book_1);
        bookReader.finishedBooks(book_2);
        String[] result = bookReader.createFinishedBookList();

        String firstRecord = result[1];
        assertEquals("Name#2" + " [" + "Author#2" + "]", firstRecord);
    }
}