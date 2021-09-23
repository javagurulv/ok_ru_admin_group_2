package student_alexander_fateev.lesson9.level_5.task13;

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
        book.setBookTitle("Some book 2");

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
                && result.contains("Some book 2 [Lermontov]")) {
            System.out.println("List all books: OK");
        }
        else {
            System.out.println("List all books: FAIL");
        }
    }

    void testFindBookByAuthor(List<Object> bookLibrary) {
        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermontov");
        book.setBookTitle("Some new book");
        book.addNewBook(bookLibrary);

        ArrayList<String> result = book.findBookByAuthor(bookLibrary, "Lermontov");
        if (result.contains("Some book 2 [Lermontov]")
                && result.contains("Some new book [Lermontov]")) {
            System.out.println("List books by author: OK");
        }
        else {
            System.out.println("List books by author: FAIL");
        }
    }

    void testFindBookByAuthorStartWith(List<Object> bookLibrary) {
        BookReaderImpl book = new BookReaderImpl();
        book.setBookAuthor("Lermann");
        book.setBookTitle("Some cool book");
        book.addNewBook(bookLibrary);

        ArrayList<String> result = book.findBookByAuthor(bookLibrary, "Ler");
        if (result.contains("Some book 2 [Lermontov]")
                && result.contains("Some new book [Lermontov]")
                && result.contains("Some cool book [Lermann]")) {
            System.out.println("List books by author [start with]: OK");
        }
        else {
            System.out.println("List books by author [start with]: FAIL");
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
