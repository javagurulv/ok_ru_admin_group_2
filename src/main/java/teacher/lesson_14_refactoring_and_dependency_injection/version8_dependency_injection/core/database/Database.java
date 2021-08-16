package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.database;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.Book;

public interface Database {

	void save(Book book);

	boolean deleteById(Long id);

	List<Book> getAllBooks();

	List<Book> findByTitle(String title);

	List<Book> findByAuthor(String author);

	List<Book> findByTitleAndAuthor(String title, String author);

}
