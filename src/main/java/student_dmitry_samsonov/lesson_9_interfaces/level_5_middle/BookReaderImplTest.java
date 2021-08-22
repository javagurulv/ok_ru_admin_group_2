package student_dmitry_samsonov.lesson_9_interfaces.level_5_middle;

import java.util.ArrayList;
import java.util.List;

class BookReaderImplTest {
    public static void main(String[] args) {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("author1", "title1");
        Book book1_1 = new Book("author1", "title1");
        Book book2 = new Book("author2", "title11");
        Book book3 = new Book("author3", "title3");
        printTestResult("Add first book", bookReader.addBook(book1));
        printTestResult("Add second equal book", !bookReader.addBook(book1_1));
        printTestResult("Add third non-equal book", bookReader.addBook(book3));
        printTestResult("Remove third non-equal book", bookReader.delBook(book3));
        printTestResult("Remove third non-equal book again", !bookReader.delBook(book3));

        bookReader.addBook(book2);
        bookReader.addBook(book3);
        List<String> allBooks = new ArrayList<String>();
        allBooks.add("title1 [author1]");
        allBooks.add("title11 [author2]");
        allBooks.add("title3 [author3]");
        printTestResult("Get all books", bookReader.getAllBooks().equals(allBooks));

        Book book4 = new Book("author3", "title4");
        bookReader.addBook(book4);
        List<Book> authorsBooks = new ArrayList<Book>();
        authorsBooks.add(book3);
        authorsBooks.add(book4);
        printTestResult("Get books of author3", bookReader.getBooksByAuthor("author3").equals(authorsBooks));

        Book book5 = new Book("author33", "title5");
        bookReader.addBook(book5);
        authorsBooks.add(book5);
        printTestResult("Get books of author3*", bookReader.getBooksByAuthor("author3").equals(authorsBooks));

        List<Book> booksByTitle = new ArrayList<Book>();
        booksByTitle.add(book1);
        booksByTitle.add(book2);
        printTestResult("Get books with title1*", bookReader.getBooksByTitle("title1").equals(booksByTitle));

        printTestResult("Set book book1 finished", bookReader.setBookFinished(book1));

        Book book6 = new Book("author6", "title6");
        printTestResult("Set book book6 new", !bookReader.setBookNew(book6));

        List<String> finishedBooks = new ArrayList<String>();
        finishedBooks.add("title1 [author1]");
        printTestResult("Get finished books", bookReader.getFinishedBooks().equals(finishedBooks));

        List<String> newBooks = new ArrayList<String>();
        newBooks.add("title11 [author2]");
        newBooks.add("title3 [author3]");
        newBooks.add("title4 [author3]");
        newBooks.add("title5 [author33]");
        printTestResult("Get finished books", bookReader.getNewBooks().equals(newBooks));
    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
}
