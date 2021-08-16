package teacher.lesson_14_refactoring_and_dependency_injection.version4_packages.console_ui;

import teacher.lesson_14_refactoring_and_dependency_injection.version4_packages.database.Database;

public class GetAllBooksUIAction implements UIAction {

	private Database database;

	public GetAllBooksUIAction(Database database) {
		this.database = database;
	}

	@Override
	public void execute() {
		System.out.println("Book list: ");
		database.getAllBooks().forEach(System.out::println);
		System.out.println("Book list end.");
	}
}