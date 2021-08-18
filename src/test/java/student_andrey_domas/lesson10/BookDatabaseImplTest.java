package student_andrey_domas.lesson10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import student_andrey_domas.lesson10.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class BookDatabaseImplTest {
    private BookDatabaseImpl db;
    private Book book = new Book("test author 1", "test title 1", "2000");
    private Book unsavedBook1 = new Book("test author 2", "test title 2", "1999");
    private Book unsavedBook2 = new Book("test author 3", "test title 3", "1600");

    @Before
    public void setup() {
        db = new BookDatabaseImpl();
        db.save(book);
    }

    @Test
    public void deleteByIdTest() {
        Assert.assertEquals(1, db.countAllBooks());
        Assert.assertTrue(db.delete(1L));
        Assert.assertEquals(0, db.countAllBooks());
    }

    @Test
    public void deleteByIdUnexistsTest() {
        Assert.assertEquals(1, db.countAllBooks());
        Assert.assertFalse(db.delete(10L));
        Assert.assertEquals(1, db.countAllBooks());
    }

    @Test
    public void deleteByInstanceTest() {
        Assert.assertEquals(1, db.countAllBooks());
        Assert.assertTrue(db.delete(book));
        Assert.assertEquals(0, db.countAllBooks());
    }

    @Test
    public void deleteByInstanceUnexistsTest() {
        Assert.assertEquals(1, db.countAllBooks());
        Assert.assertFalse(db.delete(unsavedBook1));
        Assert.assertEquals(1, db.countAllBooks());
    }

    @Test
    public void findByIdTest() {
        Optional<Book> found = db.findById(book.getId());
        Assert.assertFalse(found.isEmpty());
        Assert.assertTrue(found.get().equals(book));
    }

    @Test
    public void findByIdUnexistsTest() {
        Optional<Book> found = db.findById(10L);
        Assert.assertTrue(found.isEmpty());
    }

    @Test
    public void findByAuthor() {
        List<Book> found = db.findByAuthor(book.getAuthor());
        Assert.assertEquals(1, found.size());
        Assert.assertTrue(found.get(0).equals(book));
    }

    @Test
    public void findByAuthorUnexistsTest() {
        List<Book> found = db.findByAuthor(unsavedBook1.getAuthor());
        Assert.assertEquals(0, found.size());
    }

    @Test
    public void findByTitle() {
        List<Book> found = db.findByTitle(book.getTitle());
        Assert.assertEquals(1, found.size());
        Assert.assertTrue(found.get(0).equals(book));
    }

    @Test
    public void findByTitleUnexistsTest() {
        List<Book> found = db.findByTitle(unsavedBook1.getTitle());
        Assert.assertEquals(0, found.size());
    }

    @Test
    public void deleteByAuthorTest() {
        Assert.assertEquals(1, db.countAllBooks());
        db.deleteByAuthor(book.getAuthor());
        Assert.assertEquals(0, db.countAllBooks());
    }

    @Test
    public void deleteByAuthorUnexistsTest() {
        Assert.assertEquals(1, db.countAllBooks());
        db.deleteByAuthor(unsavedBook1.getAuthor());
        Assert.assertEquals(1, db.countAllBooks());
    }

    @Test
    public void deleteByTitleTest() {
        Assert.assertEquals(1, db.countAllBooks());
        db.deleteByTitle(book.getTitle());
        Assert.assertEquals(0, db.countAllBooks());
    }

    @Test
    public void deleteByTitleUnexistsTest() {
        Assert.assertEquals(1, db.countAllBooks());
        db.deleteByTitle(unsavedBook1.getTitle());
        Assert.assertEquals(1, db.countAllBooks());
    }

    @Test
    public void findTest() {
        SearchCriteria scTitle = new TitleSearchCriteria("title 1");
        SearchCriteria scAuthor = new AuthorSearchCriteria("author 1");
        SearchCriteria scAnd = new AndSearchCriteria(scTitle, scAuthor);
        List<Book> found = db.find(scAnd);
        Assert.assertEquals(1, found.size());
        Assert.assertEquals(found.get(0), book);
    }

    @Test
    public void findTestSorted() {
        SearchCriteria scTitle = new TitleSearchCriteria("title ");
        SearchCriteria scAuthor = new AuthorSearchCriteria("author ");
        SearchCriteria scAnd = new AndSearchCriteria(scTitle, scAuthor);
        SearchCriteria scSorted = new SortedSearchCriteria();
        SearchCriteria scAnd2 = new AndSearchCriteria(scSorted, scAnd);
        db.save(unsavedBook2);
        db.save(unsavedBook1);
        List<Book> found = db.find(scAnd2);
        Assert.assertEquals(3, found.size());
        Book[] expected = {book, unsavedBook1, unsavedBook2};
        Assert.assertArrayEquals(expected, found.toArray());
    }

    @Test
    public void findTestUnsorted() {
        SearchCriteria scTitle = new TitleSearchCriteria("title ");
        SearchCriteria scAuthor = new AuthorSearchCriteria("author ");
        SearchCriteria scAnd = new AndSearchCriteria(scTitle, scAuthor);
        db.save(unsavedBook2);
        db.save(unsavedBook1);
        List<Book> found = db.find(scAnd);
        Assert.assertEquals(3, found.size());
        Book[] expected = {book, unsavedBook2, unsavedBook1};
        Assert.assertArrayEquals(expected, found.toArray());
    }

    @Test
    public void findNotFoundTest() {
        SearchCriteria scTitle = new TitleSearchCriteria("title 1");
        SearchCriteria scAuthor = new AuthorSearchCriteria("xxx");
        SearchCriteria scAnd = new AndSearchCriteria(scTitle, scAuthor);
        List<Book> found = db.find(scAnd);
        Assert.assertEquals(0, found.size());
    }

    @Test
    public void findUniqueAuthorsTest() {
        Book book = new Book("test author 1", "test title 1", "2000");
        db.save(book);
        db.save(unsavedBook1);
        db.save(unsavedBook2);
        Assert.assertEquals(4, db.countAllBooks());
        String authors[] = db.findUniqueAuthors().stream().sorted().toArray(String[]::new);
        String expected[] = {"test author 1", "test author 2", "test author 3"};
        Assert.assertArrayEquals(expected, authors);
    }

    @Test
    public void findUniqueTitlesTest() {
        Book book = new Book("test author 1", "test title 1", "2000");
        db.save(book);
        db.save(unsavedBook1);
        db.save(unsavedBook2);
        Assert.assertEquals(4, db.countAllBooks());
        String titles[] = db.findUniqueTitles().stream().sorted().toArray(String[]::new);
        String expected[] = {"test title 1", "test title 2", "test title 3"};
        Assert.assertArrayEquals(expected, titles);
    }

    @Test
    public void findUniqueBooksTest() {
        Book book = new Book("test author 1", "test title 1", "2000");
        db.save(book);
        Assert.assertEquals(2, db.countAllBooks());
        Book uniqueBooks[] = db.findUniqueBooks().stream().toArray(Book[]::new);
        Book expected[] = {book};
        Assert.assertArrayEquals(expected, uniqueBooks);
    }

    @Test
    public void containsTest() {
        Book book = new Book("test author 1", "test title 1", "2000");
        Assert.assertTrue(db.contains(book));
    }

    @Test
    public void notContainsTest() {
        Assert.assertFalse(db.contains(unsavedBook1));
    }

    @Test
    public void getAuthorToBooksMapTest() {
        db.save(unsavedBook1);
        db.save(unsavedBook2);
        Book author1SecondBook = new Book(book.getAuthor(), "xxx", "yyy");
        db.save(author1SecondBook);
        Assert.assertEquals(4, db.countAllBooks());

        Map<String, List<Book>> result = db.getAuthorToBooksMap();
        Map<String, Integer> resultCount = db.getEachAuthorBookCount();

        Assert.assertTrue(result.containsKey(book.getAuthor()));
        Book expected1[] = {book, author1SecondBook};
        Assert.assertArrayEquals(expected1, result.get(book.getAuthor()).toArray());
        Assert.assertEquals(expected1.length, resultCount.get(book.getAuthor()).longValue());

        Assert.assertTrue(result.containsKey(unsavedBook1.getAuthor()));
        Book expected2[] = {unsavedBook1};
        Assert.assertArrayEquals(expected2, result.get(unsavedBook1.getAuthor()).toArray());
        Assert.assertEquals(expected2.length, resultCount.get(unsavedBook1.getAuthor()).longValue());

        Assert.assertTrue(result.containsKey(unsavedBook2.getAuthor()));
        Book expected3[] = {unsavedBook2};
        Assert.assertArrayEquals(expected3, result.get(unsavedBook2.getAuthor()).toArray());
        Assert.assertEquals(expected3.length, resultCount.get(unsavedBook2.getAuthor()).longValue());
    }

    @Test
    public void getAuthorToBooksMapEmptyDBTest() {
        BookDatabase emptyDB = new BookDatabaseImpl();
        Assert.assertEquals(0, emptyDB.countAllBooks());
        Map<String, List<Book>> result = emptyDB.getAuthorToBooksMap();
        Assert.assertTrue(result.isEmpty());
    }

}
