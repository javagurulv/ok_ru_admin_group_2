package student_artem_khokhlov.lesson_10.level_5_middle.task_28;

import java.util.*;
import java.util.stream.Collectors;

public class BookDatabaseimpl implements BookDatabase{

    List<Book> db = new ArrayList<>();

    public Long getLastIdx() {
        Book last = db.stream().max(Comparator.comparing(Book::getId)).get();
        if (last.getId() == null) { return Long.valueOf(0); }
        return last.getId();
    }

    @Override
    public Long save(Book book) {
        Long idx = 0L;
        if (db.size() > 0) {
            idx = getLastIdx();
            idx ++;
        }
        db.add(book);
        book.setId(idx);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        Optional<Book> book = this.db.stream().filter(b -> bookId.equals(b.getId())).findAny();
        if (book.isEmpty()) { return false;}
        db.remove(book);
        return true;
    }

    @Override
    public boolean delete(Book book) {
        return this.db.remove(book);
    }

    @Override
    public Map<String ,List <Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> result = new HashMap<>();

        Set<String> authors = getAuthors();

        for (String author: authors) {
            result.put(author, this.db.stream().filter(book -> author.equals(book.getAuthor())).collect(Collectors.toList()));
        }
        return result;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> result = new HashMap<>();
        Set<String> authors = getAuthors();

        for (String author: authors) {
            result.put(author, (int) this.db.stream().filter(b -> author.equals(b.getAuthor())).count());
        }
        return result;
    }

    @Override
    public Set<String> getAuthors() {
        return this.db.stream().map(Book::getAuthor).collect(Collectors.toSet());
    }
}
