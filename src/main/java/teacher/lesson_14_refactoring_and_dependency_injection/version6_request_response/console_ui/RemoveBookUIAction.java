package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.console_ui;

import java.util.Scanner;

import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.requests.RemoveBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.responses.RemoveBookResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.services.RemoveBookService;

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
		if (response.isBookRemoved()) {
			System.out.println("Your book was removed from list.");
		} else {
			System.out.println("Your book not removed from list.");
		}
	}
}