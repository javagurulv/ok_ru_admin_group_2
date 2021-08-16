package student_andrey_domas.lesson9.level5_6;

import java.util.*;

import static java.util.function.Predicate.not;

public class BookReaderImpl extends HashSet<Book> implements BookReader {

    private TreeMap<String, Set<Book>> authorIndex = new TreeMap<>();  // author -> books
    private TreeMap<String, Set<Book>> titleIndex = new TreeMap<>();  // title -> books
    private Set<Book> readIndex = new HashSet<>();

    @Override
    public String[] list() {
        return stream().map(Book::toString).toArray(String[]::new);
    }

    @Override
    public boolean remove(Book book) {
        Set<Book> idx;

        idx = authorIndex.get(book.getAuthor());
        if (idx != null)
            idx.remove(book);

        idx = titleIndex.get(book.getTitle());
        if (idx != null)
            idx.remove(book);

        return super.remove(book);
    }

    @Override
    public boolean add(Book book) {
        if (Objects.isNull(book.getAuthor()) || Objects.isNull(book.getTitle()) || contains(book))
            return false;

        Set<Book> aLst = authorIndex.computeIfAbsent(book.getAuthor(), x -> new HashSet<>());
        aLst.add(book);

        Set<Book> tLst = titleIndex.computeIfAbsent(book.getTitle(), x -> new HashSet<>());
        tLst.add(book);

        return super.add(book);
    }

    private Book[] indexSearch(TreeMap<String, Set<Book>> index, String prefix) {
        return prefix == null ? new Book[0] : index.tailMap(prefix)
                .values()
                .stream()
                .flatMap(Collection::stream)
                .filter(this::contains)
                .toArray(Book[]::new);
    }

    @Override
    public Book[] findByAuthor(String author) {
        return indexSearch(authorIndex, author);
    }

    @Override
    public Book[] findByTitle(String title) {
        return indexSearch(titleIndex, title);
    }

    @Override
    public boolean markAsRead(Book book) {
        if (!contains(book))
            return false;
        readIndex.add(book);
        return true;
    }

    @Override
    public boolean markAsUnread(Book book) {
        if (!contains(book))
            return false;
        readIndex.remove(book);
        return true;
    }

    @Override
    public String[] listRead() {
        return stream()
                .filter(readIndex::contains)
                .map(Book::toString)
                .toArray(String[]::new);
    }

    @Override
    public String[] listUnread() {
        return stream()
                .filter(not(readIndex::contains))
                .map(Book::toString)
                .toArray(String[]::new);
    }
}
