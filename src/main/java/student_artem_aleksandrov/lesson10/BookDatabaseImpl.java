package student_artem_aleksandrov.lesson10;

import java.util.*;
import java.util.stream.Collectors;

public class BookDatabaseImpl implements BookDatabase {

    private final ArrayList<Book> db = new ArrayList<>();
    public Long bookIndexer = 0L;

    @Override
    public Long save(Book book) {
        bookIndexer = bookIndexer + 1;
        book.setId(bookIndexer);
        db.add(book);
        return bookIndexer;
    }

    @Override
    public boolean delete(Long bookId) {
        Optional<Book> bookToDelete = db.stream().filter(book -> book.getId().equals(bookId)).findFirst();
        if (bookToDelete.isPresent()) {
            db.remove((bookToDelete.get()));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(Book book) {
        for (Book currentBook: db) {
            if (currentBook.equals(book)) {
                db.remove(currentBook);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return db.stream().filter(book -> book.getId().equals(bookId)).findFirst();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return db.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
    }

    @Override
    public List<Book> findByTitle(String title) {
        return db.stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
    }

    @Override
    public int countAllBooks() {
        int size = 0;
        for (Object obj: db) {
            if (obj != null) {
                size += 1;
            }
        }
        return size;
    }

    @Override
    public void deleteByAuthor(String author) {
        ArrayList<Book> bookToDelete = new ArrayList<>();
        for (Book book: db) {
            if (book.getAuthor().equals(author)) {
                bookToDelete.add(book);
            }
        }
        for (Book book : bookToDelete) {
            delete(book);
        }
    }

    @Override
    public void deleteByTitle(String title) {
        ArrayList<Book> bookToDelete = new ArrayList<>();
        for (Book book: db) {
            if (book.getTitle().equals(title)) {
                bookToDelete.add(book);
            }
        }
        for (Book book : bookToDelete) {
            delete(book);
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        return db.stream().filter(searchCriteria::match).collect(Collectors.toList());
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> findBooks = new HashSet<>();
        for (Book book: db) {
            findBooks.add(book.getAuthor());
        }
        return findBooks;
    }


    @Override
    public Set<String> findUniqueTitles() {
        Set<String> findBooks = new HashSet<>();
        for (Book book: db) {
            findBooks.add(book.getTitle());
        }
        return findBooks;
    }


    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(db);
    }

    @Override
    public boolean contains(Book book) {
        return db.stream().anyMatch(book::equals);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        HashMap<String, List<Book>> authorToBookMap = new HashMap<>();
        for (String author: findUniqueAuthors()) {
            authorToBookMap.put(author, findByAuthor(author));
        }
        return authorToBookMap;
    }

}
