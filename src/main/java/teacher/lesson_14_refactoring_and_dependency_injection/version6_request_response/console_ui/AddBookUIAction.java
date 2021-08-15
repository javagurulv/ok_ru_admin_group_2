package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.console_ui;

import java.util.Scanner;

import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.requests.AddBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.responses.AddBookResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.services.AddBookService;

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
		System.out.println("New book id was: " + response.getNewBook().getId());
		System.out.println("Your book was added to list.");
	}

}