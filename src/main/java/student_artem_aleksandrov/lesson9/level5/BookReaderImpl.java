package student_artem_aleksandrov.lesson9.level5;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {

    List<Book> books = new ArrayList<>();

    @Override
    public boolean isExist(String author, String bookName) {
        for (Book book: books) {
            if (book.getAuthor().equals(author) && book.getBookName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addBook(String author, String bookName) {
        if (isExist(author, bookName)) {
            return false;
        } else {
            Book book = new Book(author, bookName);
            books.add(book);
            return true;
        }
    }

    @Override
    public boolean delBook(String author, String bookName) {
        for (Book book: books) {
            if (book.getAuthor().equals(author) && book.getBookName().equals(bookName)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public String list() {
        StringBuilder listSummary = new StringBuilder();
        for (Book book: books) {
            listSummary.append(book.toString() + "\n");
        }
        return listSummary.toString();
    }

    @Override
    public List<Book> searchBook(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book: books) {
            if (book.getAuthor().startsWith(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
