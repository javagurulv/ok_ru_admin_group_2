package student_dmitry_samsonov.lesson_10_collections.level_2_intern;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase{
    List<Book> books = new ArrayList<Book>();
    private Long lastId = 0L;

    public Integer getLastId() {
        return lastId.intValue();
    }

    public void setLastId(Long lastId) {
        this.lastId = lastId;
    }

    @Override
    public Long save(Book book) {
        this.lastId = this.lastId + 1;
        book.setId(this.lastId);
        this.books.add(book);
        return this.lastId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book: this.books) {
            if (book.getId().equals(bookId)) {
                this.books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return this.books.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book: this.books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> books = new ArrayList<Book>();
        for (Book book: this.books) {
            if (book.getAuthor().equals(author)) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> books = new ArrayList<Book>();
        for (Book book: this.books) {
            if (book.getTitle().equals(title)) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public int countAllBooks() {
        return this.books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> books = this.findByAuthor(author);
        for (Book book: books) {
            this.delete(book);
        }
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> books = this.findByTitle(title);
        for (Book book: books) {
            this.delete(book);
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> books = new ArrayList<Book>();
        for (Book book: this.books) {
            if (searchCriteria.match(book)) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<String>();
        for (Book book: this.books) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titles = new HashSet<String>();
        for (Book book: this.books) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(this.books);
    }

    @Override
    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorsBooks = new HashMap<String, List<Book>>();
        for (String author: this.findUniqueAuthors()) {
            authorsBooks.put(author, this.findByAuthor(author));
        }
        return authorsBooks;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorsBooks = new HashMap<String, Integer>();
        for (String author: this.findUniqueAuthors()) {
            authorsBooks.put(author, this.findByAuthor(author).size());
        }
        return authorsBooks;
    }
}