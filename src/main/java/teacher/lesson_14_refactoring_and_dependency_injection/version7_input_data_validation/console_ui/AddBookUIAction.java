package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.console_ui;

import java.util.Scanner;

import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.requests.AddBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses.AddBookResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.services.AddBookService;

public class AddBookUIAction implements UIAction {

	private AddBookService addBookService;

	public AddBookUIAction(AddBookService addBookService) {
		this.addBookService = addBookService;
	}

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