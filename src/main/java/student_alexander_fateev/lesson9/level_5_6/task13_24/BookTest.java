package student_alexander_fateev.lesson9.level_5_6.task13_24;

import java.util.ArrayList;
import java.util.List;

class BookTest {
    public static void main(String[] args) {
        List<Object> bookLibrary = new ArrayList<Object>();

        Books book1 = new Books("Some book 1", "Lermontov");
        bookLibrary.add(book1);

        Books book2 = new Books("Some book 1", "Tolstoy");
        bookLibrary.add(book2);

        BookTest test = new BookTest();

        test.testAddExistingBook(bookLibrary);
        test.testAddNewBook(bookLibrary);
        test.testEmptyAuthor(bookLibrary);
        test.testEmptyTitle(bookLibrary);
        test.testNullAuthor(bookLibrary);
        test.testNullTitle(bookLibrary);
        test.testRmExistingBook(bookLibrary);
        test.testRmNonExistingBook(bookLibrary);
        test.testListBooks(bookLibrary);
        test.testFindBookByAuthor(bookLibrary);
        test.testFindBookByAuthorStartWith(bookLibrary);
        test.testFindBookByTitle(bookLibrary);
        test.testFindBookByTitleStartWith(bookLibrary);
        test.testMarkAsReadExistingBook(bookLibrary);
        test.testMarkAsReadNonExistingBook(bookLibrary);
        test.testMarkAsUnReadExistingBook(bookLibrary);
        test.testMarkAsUnReadNonExistingBook(bookLibrary);
        test.testAllReadBooks(bookLibrary);
        test.testAllUnreadBooks(bookLibrary);
    }

    void testAddExistingBook(List<Object> bookLibrary) {
        boolean expectedResult = false;
        String message = "Add existing book test";

        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermontov");
        book.setBookTitle("Some book 1");

        boolean result = book.addNewBook(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testAddNewBook(List<Object> bookLibrary) {
        boolean expectedResult = true;
        String message = "Add new book test";

        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermontov");
        book.setBookTitle("New book 2");

        boolean result = book.addNewBook(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testEmptyAuthor(List<Object> bookLibrary) {
        boolean expectedResult = false;
        String message = "Add book with empty Author field test";

        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("");
        book.setBookTitle("Some book 2");

        boolean result = book.addNewBook(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testEmptyTitle(List<Object> bookLibrary) {
        boolean expectedResult = false;
        String message = "Add book with empty Title field test";

        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermontov");
        book.setBookTitle("");

        boolean result = book.addNewBook(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testNullAuthor(List<Object> bookLibrary) {
        boolean expectedResult = false;
        String message = "Add book with null Author field test";

        BookReaderImpl book = new BookReaderImpl();
        book.setBookTitle("Some title");

        boolean result = book.addNewBook(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testNullTitle(List<Object> bookLibrary) {
        boolean expectedResult = false;
        String message = "Add book with null Title field test";

        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermontov");

        boolean result = book.addNewBook(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testRmExistingBook (List<Object> bookLibrary) {
        boolean expectedResult = true;
        String message = "Remove existing book from library test";

        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermontov");
        book.setBookTitle("Some book 1");

        boolean result = book.removeBook(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testRmNonExistingBook (List<Object> bookLibrary) {
        boolean expectedResult = false;
        String message = "Remove NON existing book from library test";

        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Pupkin");
        book.setBookTitle("Buratina");

        boolean result = book.removeBook(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testListBooks(List<Object> bookLibrary) {
        BookReaderImpl book = new BookReaderImpl();
        ArrayList<String> result = book.listAllBooks(bookLibrary);

        if (result.contains("Some book 1 [Tolstoy]")
                && result.contains("New book 2 [Lermontov]")) {
            System.out.println("List all books: OK");
        }
        else {
            System.out.println("List all books: FAIL");
        }
    }

    void testFindBookByAuthor(List<Object> bookLibrary) {
        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermontov");
        book.setBookTitle("Another new book");
        book.addNewBook(bookLibrary);

        ArrayList<String> result = book.findBookByAuthor(bookLibrary, "Lermontov");
        if (result.contains("New book 2 [Lermontov]")
                && result.contains("Another new book [Lermontov]")) {
            System.out.println("List books by author: OK");
        }
        else {
            System.out.println("List books by author: FAIL");
        }
    }

    void testFindBookByAuthorStartWith(List<Object> bookLibrary) {
        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermann");
        book.setBookTitle("Cool book");
        book.addNewBook(bookLibrary);

        ArrayList<String> result = book.findBookByAuthor(bookLibrary, "Ler");
        if (result.contains("New book 2 [Lermontov]")
                && result.contains("Another new book [Lermontov]")
                && result.contains("Cool book [Lermann]")) {
            System.out.println("List books by author [start with]: OK");
        }
        else {
            System.out.println("List books by author [start with]: FAIL");
        }
    }

    void testFindBookByTitle(List<Object> bookLibrary) {
        BookReaderImpl book = new BookReaderImpl();
        ArrayList<String> result = book.findBookByTitle(bookLibrary, "Some book 1");

        if (result.contains("Some book 1 [Tolstoy]")) {
            System.out.println("List books by title: OK");
        }
        else {
            System.out.println("List books by title: FAIL");
        }
    }

    void testFindBookByTitleStartWith(List<Object> bookLibrary) {
        BookReaderImpl book = new BookReaderImpl();
        ArrayList<String> result = book.findBookByTitle(bookLibrary, "Cool");

        if (result.contains("Cool book [Lermann]")) {
            System.out.println("List books by title [start with]: OK");
        }
        else {
            System.out.println("List books by title [start with]: FAIL");
        }
    }

    void testMarkAsReadExistingBook(List<Object> bookLibrary) {
        boolean expectedResult = true;
        String message = "Mark as read existing book";
        BookReaderImpl book = new BookReaderImpl();
        book.setBookTitle("Cool book");
        book.setBookAuthor("Lermann");

        boolean result = book.markRead(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testMarkAsReadNonExistingBook(List<Object> bookLibrary) {
        boolean expectedResult = false;
        String message = "Mark as read non existing book";
        BookReaderImpl book = new BookReaderImpl();
        book.setBookTitle("Buratina");
        book.setBookAuthor("Pushkin");

        boolean result = book.markRead(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testMarkAsUnReadExistingBook(List<Object> bookLibrary) {
        boolean expectedResult = true;
        String message = "Mark as unread existing book";
        BookReaderImpl book = new BookReaderImpl();
        book.setBookTitle("Cool book");
        book.setBookAuthor("Lermann");

        boolean result = book.markUnread(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testMarkAsUnReadNonExistingBook(List<Object> bookLibrary) {
        boolean expectedResult = false;
        String message = "Mark as unread non existing book";
        BookReaderImpl book = new BookReaderImpl();
        book.setBookTitle("Buratina");
        book.setBookAuthor("Pushkin");

        boolean result = book.markUnread(bookLibrary);
        printMessage(message,result,expectedResult);
    }

    void testAllReadBooks(List<Object> bookLibrary) {
        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermontov");
        book.setBookTitle("New book 2");
        book.markRead(bookLibrary);

        ArrayList<String> result = book.findAllReadBooks(bookLibrary);
        if (result.contains("New book 2 [Lermontov]")) {
            System.out.println("List all read books: OK");
        }
        else {
            System.out.println("List all read books: FAIL");
        }
    }

    void testAllUnreadBooks(List<Object> bookLibrary) {
        BookReaderImpl book = new BookReaderImpl();

        ArrayList<String> result = book.findAllUnreadBooks(bookLibrary);
        if (result.contains("Some book 1 [Tolstoy]")
                && result.contains("Another new book [Lermontov]")
                && result.contains("Cool book [Lermann]")) {
            System.out.println("List all unread books: OK");
        }
        else {
            System.out.println("List all unread books: FAIL");
        }
    }

    void printMessage(String message, boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }
}
