package student_andrey_tryapichnikov.lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {
    List<Book> bookList = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        for (Book presentBook : bookList) {
            if (presentBook.equals(book)) return false;
        }
        bookList.add(book);
        return true;
    }

    @Override
    public boolean addBook(String title, String author) {
        try {
            return this.addBook(new Book(title, author));
        } catch (IncompatibleBookIDException e) {
            return false;
        }
    }
}
