package teacher.lesson_17_log4j.lessoncode.core.database;

import java.util.List;

import teacher.lesson_17_log4j.lessoncode.core.domain.Book;

public interface Database {

	void save(Book book);

	boolean deleteById(Long id);

	List<Book> getAllBooks();

	List<Book> findByTitle(String title);

	List<Book> findByAuthor(String author);

	List<Book> findByTitleAndAuthor(String title, String author);

}
