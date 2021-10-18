package student_andrey_tryapichnikov.lesson_10.level_2;

import java.util.HashMap;
import java.util.Map;

public class BookDatabaseImpl implements BookDatabase {
    Map<Long, Book> database = new HashMap<>();
    Long id = 0L;

    @Override
    public Long save(Book book) {
        id += 1L;
        database.put(id, book);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        if (database.containsKey(bookId)) {
            database.remove(bookId);
            return true;
        }
        return false;
    }
}
