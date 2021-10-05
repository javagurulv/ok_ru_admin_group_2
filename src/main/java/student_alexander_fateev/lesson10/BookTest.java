package student_alexander_fateev.lesson10;

import java.util.List;
import java.util.Objects;

class BookTest {
    public static void main(String[] args) {
        BookTest test = new BookTest();

        test.testDeleteCorrectId();
        test.testDeleteIncorrectId();

        test.testDeleteBook();
        test.testDeleteBookIncorrectObj();

        test.testFindById();
        test.testFindByIncorrectId();

        test.testFindByAuthor();
        test.testFindByWrongAuthor();

        test.testFindByTitle();
        test.testFindByWrongAuthor();

        test.testCountAllBooks();

        test.testDeleteByAuthor();

        test.testDeleteByTitle();

        test.testMatchAuthor();
        test.testMatchIncorrectAuthor();

        test.testMatchTitle();
        test.testMatchIncorrectTitle();

        test.testMatchYearOfIssue();
        test.testMatchIncorrectYearOfIssue();

        test.testAndSearch();
        test.testIncorrectAndSearch();

        test.testOrSearchLeft();
        test.testOrSearchRight();
        test.testOrSearchIncorrect();

        test.testListBooksByCriteria();

    }

    BookDatabaseImpl getDB() {
        Book book = new Book("Pushkin", "Buratina");
        Book book1 = new Book("Lermontov", "Hero");
        Book book2 = new Book("Lermontov", "SomeShit");
        Book book3 = new Book ("Tolstoy", "NewShit");

        BookDatabaseImpl bookDB = new BookDatabaseImpl();

        bookDB.save(book);
        bookDB.save(book1);
        bookDB.save(book2);
        bookDB.save(book3);

        return bookDB;
    }

    void printMessage(String message, boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }

    void testDeleteCorrectId() {
        String message = "Delete book by correct id";
        boolean expectedResult = true;
        long id = 4L;

        BookDatabaseImpl bookDB = getDB();
        boolean result = bookDB.delete(id);
        printMessage(message, result, expectedResult);
    }

    void  testDeleteIncorrectId() {
        String message = "Delete book by incorrect id";
        boolean expectedResult = false;
        long id = 5L;

        BookDatabaseImpl bookDB = getDB();
        boolean result = bookDB.delete(id);
        printMessage(message, result, expectedResult);
    }

    void testDeleteBook() {
        String message = "Delete book by correct object";
        boolean expectedResult = true;

        Book book = new Book("Lermontov", "SomeShit");
        book.setId(3L);

        BookDatabaseImpl bookDB = getDB();
        boolean result = bookDB.delete(book);
        printMessage(message, result, expectedResult);
    }

    void testDeleteBookIncorrectObj() {
        String message = "Delete book by incorrect object";
        boolean expectedResult = false;

        Book book = new Book("Lermontov", "Unknown");
        book.setId(3L);

        BookDatabaseImpl bookDB = getDB();
        boolean result = bookDB.delete(book);
        printMessage(message, result, expectedResult);
    }

    void testFindById() {
        String message = "Find book by correct id";
        boolean expectedResult = true;
        long id = 3L;

        BookDatabaseImpl bookDB = getDB();
        boolean result = bookDB.findById(id).isPresent();
        printMessage(message, result, expectedResult);
    }

    void testFindByIncorrectId() {
        String message = "Find book by incorrect id";
        boolean expectedResult = false;
        long id = 5L;

        BookDatabaseImpl bookDB = getDB();
        boolean result = bookDB.findById(id).isPresent();
        printMessage(message, result, expectedResult);
    }

    void testFindByAuthor() {
        BookDatabaseImpl bookDB = getDB();
        String author = "Pushkin";
        String title = "Buratina";
        Book book = new Book(author, title);
        book.setId(1L);

        List<Book> result = bookDB.findByAuthor(author);

        if (result.contains(book)) {
            System.out.println("Find book by author: OK");
        }
        else {
            System.out.println("Find book by author: FAIL");
        }
    }

    void testFindByWrongAuthor() {
        BookDatabaseImpl bookDB = getDB();
        String author = "Ushkin";
        String title = "Buratina";
        Book book = new Book(author, title);
        book.setId(1L);

        List<Book> result = bookDB.findByAuthor(author);

        if (!result.contains(book)) {
            System.out.println("Find book by wrong author: OK");
        }
        else {
            System.out.println("Find book by wrong author: FAIL");
        }
    }

    void testFindByTitle() {
        BookDatabaseImpl bookDB = getDB();
        String author = "Pushkin";
        String title = "Buratina";
        Book book = new Book(author, title);
        book.setId(1L);

        List<Book> result = bookDB.findByTitle(title);

        if (result.contains(book)) {
            System.out.println("Find book by title: OK");
        }
        else {
            System.out.println("Find book by title: FAIL");
        }
    }

    void testFindByWrongTitle() {
        BookDatabaseImpl bookDB = getDB();
        String author = "Pushkin";
        String title = "Buratinka";
        Book book = new Book(author, title);
        book.setId(1L);

        List<Book> result = bookDB.findByTitle(title);

        if (!result.contains(book)) {
            System.out.println("Find book by wrong title: OK");
        }
        else {
            System.out.println("Find book by wrong title: FAIL");
        }
    }

    void testCountAllBooks() {
        int expectedResult = 4;
        BookDatabaseImpl bookDB = getDB();
        int result = bookDB.countAllBooks();

        if (result == expectedResult) {
            System.out.println("Count all books: OK");
        }
        else {
            System.out.println("Count all books: FAIL");
        }
    }

    void testDeleteByAuthor() {
        Book book = new Book("Pushkin", "Buratina");
        book.setId(1L);

        BookDatabaseImpl bookDB = getDB();
        bookDB.deleteByAuthor("Pushkin");

        if (!bookDB.getBookLibrary().contains(book)) {
            System.out.println("Delete book by author: OK");
        }
        else {
            System.out.println("Delete book by author: FAIL");
        }
    }

    void testDeleteByTitle() {
        Book book = new Book("Pushkin", "Buratina");
        book.setId(1L);

        BookDatabaseImpl bookDB = getDB();
        bookDB.deleteByTitle("Buratina");

        if (!bookDB.getBookLibrary().contains(book)) {
            System.out.println("Delete book by title: OK");
        }
        else {
            System.out.println("Delete book by title: FAIL");
        }
    }

    void testMatchAuthor() {
        boolean expectedResult = true;
        String message = "Match author";

        AuthorSearchCriteria author = new AuthorSearchCriteria("Pushkin");
        Book book = new Book("Pushkin", "Buratina");

        boolean result = author.match(book);
        printMessage(message, result, expectedResult);
    }

    void testMatchIncorrectAuthor() {
        boolean expectedResult = false;
        String message = "Match incorrect author";

        AuthorSearchCriteria author = new AuthorSearchCriteria("Ushkin");
        Book book = new Book("Pushkin", "Buratina");

        boolean result = author.match(book);
        printMessage(message, result, expectedResult);
    }

    void testMatchTitle() {
        boolean expectedResult = true;
        String message = "Match title";

        TitleSearchCriteria title = new TitleSearchCriteria("Buratina");
        Book book = new Book("Pushkin", "Buratina");

        boolean result = title.match(book);
        printMessage(message, result, expectedResult);
    }

    void testMatchIncorrectTitle() {
        boolean expectedResult = false;
        String message = "Match incorrect title";

        TitleSearchCriteria title = new TitleSearchCriteria("Buratinka");
        Book book = new Book("Pushkin", "Buratina");

        boolean result = title.match(book);
        printMessage(message, result, expectedResult);
    }

    void testMatchYearOfIssue() {
        boolean expectedResult = true;
        String message = "Match year of issue";

        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("2001");
        Book book = new Book("Pushkin", "Buratina");
        book.setYearOfIssue("2001");

        boolean result = year.match(book);
        printMessage(message, result, expectedResult);
    }

    void testMatchIncorrectYearOfIssue() {
        boolean expectedResult = false;
        String message = "Match incorrect year of issue";

        YearOfIssueSearchCriteria year = new YearOfIssueSearchCriteria("2001");
        Book book = new Book("Pushkin", "Buratina");
        book.setYearOfIssue("2010");

        boolean result = year.match(book);
        printMessage(message, result, expectedResult);
    }

    void testAndSearch() {
        boolean expectedResult = true;
        String message = "Match left and right conditions";

        AuthorSearchCriteria author = new AuthorSearchCriteria("Pushkin");
        TitleSearchCriteria title = new TitleSearchCriteria("Buratina");
        Book book = new Book("Pushkin", "Buratina");

        AndSearchCriteria fields = new AndSearchCriteria(author, title);
        boolean result = fields.match(book);
        printMessage(message, result, expectedResult);
    }

    void testIncorrectAndSearch() {
        boolean expectedResult = false;
        String message = "Match left and right conditions";

        AuthorSearchCriteria author = new AuthorSearchCriteria("Pushkin");
        TitleSearchCriteria title = new TitleSearchCriteria("Buratina");
        Book book = new Book("Pushkin", "Buratinka");

        AndSearchCriteria fields = new AndSearchCriteria(author, title);
        boolean result = fields.match(book);
        printMessage(message, result, expectedResult);
    }

    void testOrSearchLeft() {
        boolean expectedResult = true;
        String message = "Match left OR right conditions (Left)";

        AuthorSearchCriteria author = new AuthorSearchCriteria("Pushkin");
        TitleSearchCriteria title = new TitleSearchCriteria("Buratinka");
        Book book = new Book("Pushkin", "Buratina");

        OrSearchCriteria fields = new OrSearchCriteria(author, title);
        boolean result = fields.match(book);
        printMessage(message, result, expectedResult);
    }

    void testOrSearchRight() {
        boolean expectedResult = true;
        String message = "Match left OR right conditions (Right)";

        AuthorSearchCriteria author = new AuthorSearchCriteria("Pushkiin");
        TitleSearchCriteria title = new TitleSearchCriteria("Buratina");
        Book book = new Book("Pushkin", "Buratina");

        OrSearchCriteria fields = new OrSearchCriteria(author, title);
        boolean result = fields.match(book);
        printMessage(message, result, expectedResult);
    }

    void testOrSearchIncorrect() {
        boolean expectedResult = false;
        String message = "Match left OR right conditions (both incorrect)";

        AuthorSearchCriteria author = new AuthorSearchCriteria("Pushkiin");
        TitleSearchCriteria title = new TitleSearchCriteria("Buratinka");
        Book book = new Book("Pushkin", "Buratina");

        OrSearchCriteria fields = new OrSearchCriteria(author, title);
        boolean result = fields.match(book);
        printMessage(message, result, expectedResult);
    }

    void testListBooksByCriteria() {
        AuthorSearchCriteria author = new AuthorSearchCriteria("Lermontov");
        TitleSearchCriteria title = new TitleSearchCriteria("SomeShit");
        AndSearchCriteria fields = new AndSearchCriteria(author, title);

        BookDatabaseImpl bookDB = getDB();

        for (Book b: bookDB.find(fields)) {
            if (b.getTitle().equals("SomeShit")
                    && b.getAuthor().equals("Lermontov")) {
                System.out.println("Test random search: OK");
            }
            else {
                System.out.println("Test random search: FAIL");
            }

        }
    }
}
