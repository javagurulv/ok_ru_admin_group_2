package teacher.lesson_14_refactoring_and_dependency_injection.version4_packages.database;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version4_packages.Book;

public interface Database {

	void save(Book book);

	void deleteById(Long id);

	List<Book> getAllBooks();

}
