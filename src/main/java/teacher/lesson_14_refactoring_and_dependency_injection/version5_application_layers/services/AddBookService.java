package teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.services;

import teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.Book;
import teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.database.Database;

public class AddBookService {

	private Database database;

	public AddBookService(Database database) {
		this.database = database;
	}

	public void execute(String bookTitle, String bookAuthor) {
		Book book = new Book(bookTitle, bookAuthor);
		database.save(book);
	}

}
