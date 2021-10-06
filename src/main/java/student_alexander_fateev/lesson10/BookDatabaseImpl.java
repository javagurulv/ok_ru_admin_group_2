package student_alexander_fateev.lesson10;

import java.util.*;

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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> books = new ArrayList<Book>();


        for (Object o: getBookLibrary()) {
            Book book = (Book) o;
            if (searchCriteria.match(book)) {
                books.add(book);
            }
        }

        return books;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        HashSet<String> authors = new HashSet<>();
        for (Object o: getBookLibrary()) {
            Book book = (Book) o;
            authors.add(book.getAuthor());
        }

        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        HashSet<String> titles = new HashSet<>();
        for (Object o: getBookLibrary()) {
            Book book = (Book) o;
            titles.add(book.getTitle());
        }

        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        HashSet<Book> books = new HashSet<>();
        for (Object o: getBookLibrary()) {
            Book book = (Book) o;
            books.add(book);
        }

        return books;
    }

    @Override
    public boolean contains(Book book) {
        if (getBookLibrary().contains(book)) {
            return true;
        }
        return false;
    }
}
