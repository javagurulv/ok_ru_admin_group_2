package student_artem_aleksandrov.lesson10;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    BookDatabaseImpl db = new BookDatabaseImpl();
    Book book1 = new Book("author1", "name1_1");
    Book book2 = new Book("author1", "name1_2");
    Book book3 = new Book("author2", "NonUniqName");
    Book book4 = new Book("author3", "NonUniqName");
    Book book5 = new Book("author4", "name4_1");

    @Before
    public void setUp() throws Exception {
        db.save(book1);
        db.save(book2);
        db.save(book3);
        db.save(book4);
    }

    @Test
    public void save() {
        assertEquals(Long.valueOf(1), book1.getId());
        assertEquals(Long.valueOf(3), book3.getId());
    }

    @Test
    public void deleteById() {
        db.delete(1L);
        assertEquals(Optional.empty(), db.findById(1L));
        // Return book
        db.save(book1);
        assertEquals(Optional.of(book1), db.findById(book1.getId()));
    }

    @Test
    public void testDeleteByBook() {
        assertTrue(db.delete(book1));
        assertFalse(db.delete(book1));
        assertEquals(Optional.empty(), db.findById(1L));
    }

    @Test
    public void findById() {
        assertEquals(Optional.of(book3), db.findById(3L));
        assertEquals(Optional.empty(), db.findById(100L));
    }

    @Test
    public void findByAuthor() {
        ArrayList<Book> expectedList = new ArrayList<>();
        ArrayList<Book> emptyList = new ArrayList<>();
        expectedList.add(book1);
        expectedList.add(book2);
        assertEquals(expectedList, db.findByAuthor("author1"));
        assertEquals(emptyList, db.findByAuthor("authorNotFound"));
    }

    @Test
    public void findByTitle() {
        ArrayList<Book> expectedList = new ArrayList<>();
        ArrayList<Book> emptyList = new ArrayList<>();
        expectedList.add(book1);
        assertEquals(expectedList, db.findByTitle("name1_1"));
        assertEquals(emptyList, db.findByTitle("authorNotFound"));
    }

    @Test
    public void countAllBooks() {
        assertEquals(4, db.countAllBooks());
    }

    @Test
    public void deleteByAuthor() {
        ArrayList<Book> emptyList = new ArrayList<>();
        db.deleteByAuthor("author1");
        assertEquals(emptyList, db.findByAuthor("author1"));
    }

    @Test
    public void deleteByTitle() {
        ArrayList<Book> emptyList = new ArrayList<>();
        db.deleteByTitle("NonUniqName");
        assertEquals(emptyList, db.findByTitle("NonUniqName"));
    }

    @Test
    public void find() {
        SearchCriteria searchCriteriaAuthor = new AuthorSearchCriteria("author1");
        ArrayList<Book> expectedList = new ArrayList<>();
        expectedList.add(book1);
        expectedList.add(book2);
        assertEquals(expectedList, db.find(searchCriteriaAuthor));
    }

    @Test
    public void findUniqueAuthors() {
        Set<String> exectedList = new HashSet<>(Arrays.asList("author2", "author1", "author3"));
        assertEquals(exectedList, db.findUniqueAuthors());
    }

    @Test
    public void contains() {
        assertTrue(db.contains(book1));
        assertFalse(db.contains(book5));
    }

    @Test
    public void findUniqueBooks() {
        int currentSize = db.countAllBooks();
        db.save(book5);
        db.save(book5);
        assertEquals(currentSize + 2, db.countAllBooks());
        assertEquals(currentSize + 1, db.findUniqueBooks().size());
    }

    @Test
    public void getAuthorToBooksMap() {
        System.out.println(db.getAuthorToBooksMap());
    }
}