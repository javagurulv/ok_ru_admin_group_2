package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.database;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.Book;

public interface Database {

	void save(Book book);

	boolean deleteById(Long id);

	List<Book> getAllBooks();

}
