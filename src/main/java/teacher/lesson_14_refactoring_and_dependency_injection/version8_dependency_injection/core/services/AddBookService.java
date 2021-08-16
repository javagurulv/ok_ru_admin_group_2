package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.services;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.Book;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.database.Database;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.requests.AddBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses.AddBookResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses.CoreError;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.services.validators.AddBookRequestValidator;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIComponent;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIDependency;

@DIComponent
public class AddBookService {

	@DIDependency private Database database;
	@DIDependency private AddBookRequestValidator validator;

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
