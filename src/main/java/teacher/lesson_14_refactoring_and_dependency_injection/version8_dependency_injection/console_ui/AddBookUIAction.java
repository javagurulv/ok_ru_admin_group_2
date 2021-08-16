package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.console_ui;

import java.util.Scanner;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.requests.AddBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses.AddBookResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.services.AddBookService;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIComponent;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIDependency;

@DIComponent
public class AddBookUIAction implements UIAction {

	@DIDependency private AddBookService addBookService;

	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter book title: ");
		String bookTitle = scanner.nextLine();
		System.out.println("Enter book author: ");
		String bookAuthor = scanner.nextLine();
		AddBookRequest request = new AddBookRequest(bookTitle, bookAuthor);
		AddBookResponse response = addBookService.execute(request);

		if (response.hasErrors()) {
			response.getErrors().forEach(coreError ->
				System.out.println("Error: " + coreError.getField() + " " + coreError.getMessage())
			);
		} else {
			System.out.println("New book id was: " + response.getNewBook().getId());
			System.out.println("Your book was added to list.");
		}
	}

}