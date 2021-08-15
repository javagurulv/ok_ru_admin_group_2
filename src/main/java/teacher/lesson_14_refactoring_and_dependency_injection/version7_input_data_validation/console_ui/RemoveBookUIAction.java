package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.console_ui;

import java.util.Scanner;

import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.requests.RemoveBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses.RemoveBookResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.services.RemoveBookService;

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
		RemoveBookRequest request = new RemoveBookRequest(bookId);
		RemoveBookResponse response = removeBookService.execute(request);

		if (response.hasErrors()) {
			response.getErrors().forEach(coreError -> System.out.println("Error: " + coreError.getField() + " " + coreError.getMessage()));
		} else {
			if (response.isBookRemoved()) {
				System.out.println("Your book was removed from list.");
			} else {
				System.out.println("Your book not removed from list.");
			}
		}
	}
}