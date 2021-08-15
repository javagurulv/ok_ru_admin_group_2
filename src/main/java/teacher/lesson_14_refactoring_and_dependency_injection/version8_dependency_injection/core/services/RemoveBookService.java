package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.services;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.database.Database;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.requests.RemoveBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses.CoreError;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses.RemoveBookResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.services.validators.RemoveBookRequestValidator;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIComponent;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIDependency;

@DIComponent
public class RemoveBookService {

	@DIDependency private Database database;
	@DIDependency private RemoveBookRequestValidator validator;

	public RemoveBookResponse execute(RemoveBookRequest request) {
		List<CoreError> errors = validator.validate(request);
		if (!errors.isEmpty()) {
			return new RemoveBookResponse(errors);
		}
		boolean isBookRemoved = database.deleteById(request.getBookId());
		return new RemoveBookResponse(isBookRemoved);
	}

}