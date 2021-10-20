package student_artem_khokhlov.lesson_10.level_5_middle.task_28;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Map<String, List<Book>> getAuthorToBooksMap();
    Map<String, Integer> getEachAuthorBookCount();
    Set<String> getAuthors();
}
