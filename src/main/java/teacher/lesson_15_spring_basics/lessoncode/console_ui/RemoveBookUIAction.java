package teacher.lesson_15_spring_basics.lessoncode.console_ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import teacher.lesson_15_spring_basics.lessoncode.core.requests.RemoveBookRequest;
import teacher.lesson_15_spring_basics.lessoncode.core.responses.RemoveBookResponse;
import teacher.lesson_15_spring_basics.lessoncode.core.services.RemoveBookService;

@Component
public class RemoveBookUIAction implements UIAction {

	@Autowired private RemoveBookService removeBookService;

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