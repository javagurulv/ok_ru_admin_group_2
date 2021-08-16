package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.console_ui;

import java.util.Scanner;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.requests.RemoveBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses.RemoveBookResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.services.RemoveBookService;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIComponent;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIDependency;

@DIComponent
public class RemoveBookUIAction implements UIAction {

	@DIDependency private RemoveBookService removeBookService;

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