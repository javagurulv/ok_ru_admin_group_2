package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.services;

import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.Book;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.database.Database;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.requests.AddBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.responses.AddBookResponse;

public class AddBookService {

	private Database database;

	public AddBookService(Database database) {
		this.database = database;
	}

	public AddBookResponse execute(AddBookRequest request) {
		Book book = new Book(request.getTitle(), request.getAuthor());
		database.save(book);
		return new AddBookResponse(book);
	}

}
