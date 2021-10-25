package student_andrey_tryapichnikov.lesson_10.level_2;

import java.util.LinkedList;
import java.util.List;

public class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabase db = new BookDatabaseImpl();
        var book1 = new Book("John Smith", "Generic Names");
        var book2 = new Book("John Doe", "Even More Generic Names");
        var book3 = new Book("Jane Doe", "Generic Names for Women");
        var book4 = new Book("John Smith", "Another book");
        db.save(book1);
        db.save(book2);
        db.save(book3);
        if (db.delete(2L)) System.out.println("deletion successful");
        System.out.println("books in db: " + db.countAllBooks());
        if (db.delete(book2)) System.out.println("This message should never appear");
        System.out.println("books in db: " + db.countAllBooks());
        if (db.delete(book1)) System.out.println("This one should");
        System.out.println("books in db: " + db.countAllBooks());
        db.save(book1);
        db.save(book4);
        System.out.println("books in db: " + db.countAllBooks());
        var booksBySmith = db.findByAuthor("John Smith");
        printBooks(booksBySmith);
    }
    private static void printBooks(List<Book> books) {
        LinkedList<String> bookList = new LinkedList<>();
        for (Book book: books) bookList.add(book.getTitle() + " by " + book.getAuthor());
        System.out.printf("Books found: %s\n", bookList);
    }
}
