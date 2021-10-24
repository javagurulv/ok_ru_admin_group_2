package student_andrey_tryapichnikov.lesson_10.level_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {
    List<Book> database = new LinkedList<>();
    Long id = 0L;

    @Override
    public Long save(Book book) {
        // check id just in case we are adding a book that already has one
        if (book.getId() == null) {
            id += 1L;
            book.setId(id);
        }
        database.add(book);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        var book = findById(bookId);
        if (book.isPresent()) return database.remove(book.get());
        return false;
    }

    @Override
    public boolean delete(Book bookSpec) {
        return database.remove(bookSpec);
    }

    @Override
    public void deleteByAuthor(String author) {
        for (Book book: findByAuthor(author)) delete(book);
    }

    @Override
    public void deleteByTitle(String title) {
        for (Book book: findByTitle(title)) delete(book);
    }

    private List<Book> findBy(String criterion, Object value) {
        LinkedList<Book> books = new LinkedList<>();
        for (Book book: database) {
            boolean matches;
            switch(criterion) {
                case "author" -> matches = book.getAuthor().equals(value);
                case "title" -> matches = book.getTitle().equals(value);
                default -> matches = false;
            }
            if (matches) books.add(book);
        }
        return books;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book: database) {
            if (book.getId().equals(bookId)) return Optional.of(book);
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return findBy("author", author);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return findBy("title", title);
    }

    @Override
    public int countAllBooks() {
        return database.size();
    }
}
