package student_alexander_fateev.lesson10;

import java.util.List;

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
}
