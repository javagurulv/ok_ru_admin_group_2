package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.services;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.Book;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.database.Database;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.requests.AddBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses.AddBookResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses.CoreError;

public class AddBookService {

	private Database database;
	private AddBookValidator validator;

	public AddBookService(Database database,
						  AddBookValidator validator) {
		this.database = database;
		this.validator = validator;
	}

	public AddBookResponse execute(AddBookRequest request) {
		List<CoreError> errors = validator.validate(request);
		if (!errors.isEmpty()) {
			return new AddBookResponse(errors);
		}

		Book book = new Book(request.getTitle(), request.getAuthor());
		database.save(book);

		return new AddBookResponse(book);
	}

}
