package student_alexander_zhukov.lesson_9.level_5;

import java.util.List;
interface BookReader {

    boolean addBook(Book book);
    boolean removeBook(Book book);
    List<String> listAllBooks();
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    boolean setBookFinished(Book book);
    boolean setBookUnFinished(Book book);
    List<String> listAllFinishedBooks();
    List<String> listAllUnFinishedBooks();
}
