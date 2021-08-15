package teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.database;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.Book;

public interface Database {

	void save(Book book);

	void deleteById(Long id);

	List<Book> getAllBooks();

}
