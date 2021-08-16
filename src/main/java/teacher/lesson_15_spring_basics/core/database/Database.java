package teacher.lesson_15_spring_basics.core.database;

import java.util.List;

import teacher.lesson_15_spring_basics.core.domain.Book;

public interface Database {

	void save(Book book);

	boolean deleteById(Long id);

	List<Book> getAllBooks();

	List<Book> findByTitle(String title);

	List<Book> findByAuthor(String author);

	List<Book> findByTitleAndAuthor(String title, String author);

}
