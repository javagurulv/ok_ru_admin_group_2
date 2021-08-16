package teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.console_ui;

import java.util.Scanner;

import teacher.lesson_14_refactoring_and_dependency_injection.version5_application_layers.services.RemoveBookService;

public class RemoveBookUIAction implements UIAction {

	private RemoveBookService removeBookService;

	public RemoveBookUIAction(RemoveBookService removeBookService) {
		this.removeBookService = removeBookService;
	}

	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter book id to remove: ");
		Long bookId = Long.parseLong(scanner.nextLine());
		removeBookService.execute(bookId);
		System.out.println("Your book was removed from list.");
	}
}