package student_artem_khokhlov.lesson_10.level_5_middle.task_28;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookDatabaseimplTest extends TestCase {
    private BookDatabaseimpl db = new BookDatabaseimpl();
    private Book book1 =new Book("Author_1", "Title_1");
    private Book book2 =new Book("Author_2", "Title_2");
    private Book book3 =new Book("Author_3", "Title_3");
    private Book book4 =new Book("Author_3", "Title_4");
    private Book book5 =new Book("Author_3", "Title_5");
    private Book book6 =new Book("Author_2", "Title_6");

    public void fillDb() {
        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
        db.save(book5);
        db.save(book6);
    }

    @Test
    public void testSave() {
        db.save(this.book1);
        assertEquals(1, this.db.db.size());
    }

    @Test
    public void testDelete() {
        db.delete(book1);
        assertEquals(0, this.db.db.size());
    }

    public void testGetAuthorToBooksMap() {
        fillDb();
        Map<String, List<Book>> testmap = db.getAuthorToBooksMap();
        assertTrue(testmap.get(book3.getAuthor()).contains(book4));
    }

    public void testGetEachAuthorBookCount() {
        fillDb();
        Map<String, Integer> testmap = db.getEachAuthorBookCount();
        assertEquals(Integer.valueOf(2), testmap.get("Author_2"));
    }

    public void testGetAuthors() {
        fillDb();
        assertTrue(db.getAuthors().contains("Author_1"));
        assertTrue(db.getAuthors().contains("Author_2"));
        assertTrue(db.getAuthors().contains("Author_3"));
        assertFalse(db.getAuthors().contains("Author_4"));
    }
}