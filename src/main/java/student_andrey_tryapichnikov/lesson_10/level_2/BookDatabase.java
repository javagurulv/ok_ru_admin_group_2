package student_andrey_tryapichnikov.lesson_10.level_2;

public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
}
