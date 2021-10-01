package student_alexander_fateev.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {
    private List<Object> bookLibrary = new ArrayList<Object>();
    private long id = 1;

    public List<Object> getBookLibrary() {
        return bookLibrary;
    }

    @Override
    public Long save(Book book) {
        Book newBook = (Book) book;
        newBook.setId(id);
        id++;
        bookLibrary.add(newBook);

        return id - 1;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Object o: getBookLibrary()) {
            Book getBook = (Book) o;
            if (((Book) o).getId() == bookId) {
                getBookLibrary().remove(o);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        Book rmBook = (Book) book;
        for (Object o: getBookLibrary()) {
            if (rmBook.equals(o)) {
                getBookLibrary().remove(o);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Object o: getBookLibrary()) {
            Book getBook = (Book) o;
            if (((Book) o).getId() == bookId) {
                Optional<Book> foundedBook = Optional.of(getBook);
                return foundedBook;
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> books = new ArrayList<Book>();
        for (Object o: getBookLibrary()) {
            Book getBook = (Book) o;
            if (getBook.getAuthor().equals(author)) {
                books.add(getBook);
            }
        }
        return books;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> books = new ArrayList<Book>();
        for (Object o: getBookLibrary()) {
            Book getBook = (Book) o;
            if (getBook.getTitle().equals(title)) {
                books.add(getBook);
            }
        }
        return books;
    }

    @Override
    public int countAllBooks() {
        return getBookLibrary().size();
    }

    @Override
    public void deleteByAuthor(String author) {
        for (Object o: getBookLibrary()) {
            Book getBook = (Book) o;
            if (getBook.getAuthor().equals(author)) {
                getBookLibrary().remove(getBook);
                break;
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (Object o: getBookLibrary()) {
            Book getBook = (Book) o;
            if (getBook.getTitle().equals(title)) {
                getBookLibrary().remove(getBook);
                break;
            }
        }
    }
}
