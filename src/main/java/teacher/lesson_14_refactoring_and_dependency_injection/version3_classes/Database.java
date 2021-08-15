package teacher.lesson_14_refactoring_and_dependency_injection.version3_classes;

import java.util.List;

public interface Database {

	void save(Book book);

	void deleteById(Long id);

	List<Book> getAllBooks();

}
