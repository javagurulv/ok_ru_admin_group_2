package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.services;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.Book;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.database.Database;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.requests.GetAllBooksRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.responses.GetAllBooksResponse;

public class GetAllBooksService {

	private Database database;

	public GetAllBooksService(Database database) {
		this.database = database;
	}

	public GetAllBooksResponse execute(GetAllBooksRequest request) {
		List<Book> books = database.getAllBooks();
		return new GetAllBooksResponse(books);
	}

}