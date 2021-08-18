package student_andrey_domas.lesson10;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    int countAllBooks();
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    void deleteByAuthor(String author);
    void deleteByTitle(String title);
    List<Book> find(SearchCriteria searchCriteria);
    Set<String> findUniqueAuthors();
    Set<String> findUniqueTitles();
    Set<Book> findUniqueBooks();
    boolean contains(Book book);
    Map<String, List<Book>> getAuthorToBooksMap();
    Map<String, Integer> getEachAuthorBookCount();
}
