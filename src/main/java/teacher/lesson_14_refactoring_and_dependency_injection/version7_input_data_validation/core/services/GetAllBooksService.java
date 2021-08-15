package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.services;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.Book;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.database.Database;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.requests.GetAllBooksRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses.GetAllBooksResponse;

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