package student_andrey_domas.lesson10;

import org.junit.Assert;
import org.junit.Test;
import student_andrey_domas.lesson10.*;

import java.util.Arrays;

public class SearchCriteriaTest {
    @Test
    public void AuthorMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc = new AuthorSearchCriteria("test a");
        Assert.assertTrue(sc.match(book));
    }

    @Test
    public void AuthorNotMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc = new AuthorSearchCriteria("xxx");
        Assert.assertFalse(sc.match(book));
    }

    @Test
    public void AuthorNotMatchNull() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc = new AuthorSearchCriteria(null);
        Assert.assertFalse(sc.match(book));
    }

    @Test
    public void TitleMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc = new TitleSearchCriteria("test t");
        Assert.assertTrue(sc.match(book));
    }

    @Test
    public void TitleNotMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc = new TitleSearchCriteria("xxx");
        Assert.assertFalse(sc.match(book));
    }

    @Test
    public void TitleNotMatchNull() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc = new TitleSearchCriteria(null);
        Assert.assertFalse(sc.match(book));
    }

    @Test
    public void YearMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc = new YearOfIssueSearchCriteria("20");
        Assert.assertTrue(sc.match(book));
    }

    @Test
    public void YearNotMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc = new YearOfIssueSearchCriteria("xxx");
        Assert.assertFalse(sc.match(book));
    }

    @Test
    public void YearNotMatchNull() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc = new YearOfIssueSearchCriteria(null);
        Assert.assertFalse(sc.match(book));
    }

    @Test
    public void AndMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc1 = new YearOfIssueSearchCriteria("20");
        SearchCriteria sc2 = new TitleSearchCriteria("test t");
        SearchCriteria scAnd = new AndSearchCriteria(sc1, sc2);
        Assert.assertTrue(scAnd.match(book));
    }

    @Test
    public void AndNotMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc1 = new YearOfIssueSearchCriteria("xxx");
        SearchCriteria sc2 = new TitleSearchCriteria("test t");
        SearchCriteria scAnd = new AndSearchCriteria(sc1, sc2);
        Assert.assertFalse(scAnd.match(book));
    }

    @Test
    public void AndNotMatchNullLeft() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc2 = new TitleSearchCriteria("test t");
        SearchCriteria scAnd = new AndSearchCriteria(null, sc2);
        Assert.assertFalse(scAnd.match(book));
    }

    @Test
    public void AndNotMatchNullRight() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc2 = new TitleSearchCriteria("test t");
        SearchCriteria scAnd = new AndSearchCriteria(sc2, null);
        Assert.assertFalse(scAnd.match(book));
    }

    @Test
    public void OrMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc1 = new YearOfIssueSearchCriteria("19");
        SearchCriteria sc2 = new TitleSearchCriteria("test t");
        SearchCriteria scOr = new OrSearchCriteria(sc1, sc2);
        Assert.assertTrue(scOr.match(book));
    }

    @Test
    public void OrNotMatch() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc1 = new YearOfIssueSearchCriteria("xxx");
        SearchCriteria sc2 = new TitleSearchCriteria("zzz");
        SearchCriteria scAnd = new OrSearchCriteria(sc1, sc2);
        Assert.assertFalse(scAnd.match(book));
    }

    @Test
    public void OrMatchNullLeft() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc2 = new TitleSearchCriteria("test t");
        SearchCriteria scAnd = new OrSearchCriteria(null, sc2);
        Assert.assertTrue(scAnd.match(book));
    }

    @Test
    public void OrMatchNullRight() {
        Book book = new Book("test author", "test title", "2000");
        SearchCriteria sc2 = new TitleSearchCriteria("test t");
        SearchCriteria scAnd = new OrSearchCriteria(sc2, null);
        Assert.assertTrue(scAnd.match(book));
    }

    @Test
    public void PageSearchCriteriaTest() {
        int BOOKS = 60;
        int PAGE_LIMIT = 15;
        Book books[] = new Book[BOOKS];
        for (int i = 0; i < BOOKS; i++)
            books[i] = new Book("author " + i, "title " + i, "" + i);

        for (int i = 0; i < BOOKS / PAGE_LIMIT ; i++) {
            SearchCriteria pagination = new PageSearchCriteria(i, 15);
            Book[] results = Arrays.stream(books).filter(b -> pagination.match(b)).toArray(Book[]::new);
            Book[] expected = Arrays.copyOfRange(books, i * PAGE_LIMIT, i * PAGE_LIMIT + PAGE_LIMIT);
            Assert.assertArrayEquals(expected, results);
        }
    }
}
