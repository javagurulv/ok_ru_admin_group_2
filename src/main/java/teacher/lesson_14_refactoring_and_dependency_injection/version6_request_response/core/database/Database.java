package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.database;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.Book;

public interface Database {

	void save(Book book);

	boolean deleteById(Long id);

	List<Book> getAllBooks();

}
