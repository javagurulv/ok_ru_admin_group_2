package teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.services;

import teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.database.Database;

public class RemoveBookService {

	private Database database;

	public RemoveBookService(Database database) {
		this.database = database;
	}

	public void execute(Long bookId) {
		database.deleteById(bookId);
	}

}