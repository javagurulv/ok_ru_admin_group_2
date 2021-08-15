package teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.services;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.Book;
import teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.database.Database;

public class GetAllBooksService {

	private Database database;

	public GetAllBooksService(Database database) {
		this.database = database;
	}

	public List<Book> execute() {
		return database.getAllBooks();
	}

}