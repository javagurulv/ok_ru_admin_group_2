package teacher.lesson_15_spring_basics.console_ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import teacher.lesson_15_spring_basics.core.domain.Book;
import teacher.lesson_15_spring_basics.core.requests.Ordering;
import teacher.lesson_15_spring_basics.core.requests.Paging;
import teacher.lesson_15_spring_basics.core.requests.SearchBooksRequest;
import teacher.lesson_15_spring_basics.core.responses.SearchBooksResponse;
import teacher.lesson_15_spring_basics.core.services.SearchBooksService;

@Component
public class SearchBooksUIAction implements UIAction {

	@Autowired private SearchBooksService searchBooksService;

	@Override
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter book title: ");
		String title = scanner.nextLine();
		System.out.println("Enter book author: ");
		String author = scanner.nextLine();

		System.out.println("Enter orderBy (title||author): ");
		String orderBy = scanner.nextLine();
		System.out.println("Enter orderDirection (ASCENDING||DESCENDING): ");
		String orderDirection = scanner.nextLine();
		Ordering ordering = new Ordering(orderBy, orderDirection);

		System.out.println("Enter pageNumber: ");
		Integer pageNumber = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter pageSize: ");
		Integer pageSize = Integer.parseInt(scanner.nextLine());
		Paging paging = new Paging(pageNumber, pageSize);

		SearchBooksRequest request = new SearchBooksRequest(title, author, ordering, paging);
		SearchBooksResponse response = searchBooksService.execute(request);

		if (response.hasErrors()) {
			response.getErrors().forEach(coreError -> System.out.println("Error: " + coreError.getField() + " " + coreError.getMessage()));
		} else {
			response.getBooks().forEach(Book::toString);
		}
	}

}
