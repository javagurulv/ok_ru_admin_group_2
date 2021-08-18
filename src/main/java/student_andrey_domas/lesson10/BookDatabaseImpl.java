package student_andrey_domas.lesson10;

import java.util.*;
import java.util.stream.Collectors;

public class BookDatabaseImpl implements BookDatabase {

    private ArrayList<Book> db = new ArrayList<>();

    @Override
    public Long save(Book book) {
        if (db.add(book))
            book.setId(Long.valueOf(db.size()));
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        try {
            db.remove(bookId.intValue() - 1);
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    @Override
    public int countAllBooks() {
        return db.size();
    }

    @Override
    public boolean delete(Book book) {
        // unsaved instance
        if (book.getId() == null)
            return false;

        return db.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        try {
            return Optional.ofNullable(db.get(bookId.intValue() - 1));
        } catch (IndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return db.stream().filter(book -> Objects.equals(book.getAuthor(), author))
                          .collect(Collectors.toList());
    }

    @Override
    public List<Book> findByTitle(String title) {
        return db.stream().filter(book -> Objects.equals(book.getTitle(), title))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteByAuthor(String author) {
        for (Book book: findByAuthor(author))
            delete(book);
    }

    @Override
    public void deleteByTitle(String title) {
        for (Book book: findByTitle(title))
            delete(book);
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        return db.stream()
                .filter(searchCriteria::match)
                .sorted(searchCriteria)
                .collect(Collectors.toList());
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return new HashSet<>(db.stream().map(book -> book.getAuthor()).toList());
    }

    @Override
    public Set<String> findUniqueTitles() {
        return new HashSet<>(db.stream().map(book -> book.getTitle()).toList());
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(db);
    }

    @Override
    public boolean contains(Book book) {
        return db.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return db.stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toMap(a -> a, a -> findByAuthor(a)));
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        return getAuthorToBooksMap().entrySet().stream()
                .collect(Collectors.toMap( e -> e.getKey(), e -> e.getValue().size()));
    }
}
