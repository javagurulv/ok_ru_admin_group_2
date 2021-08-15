package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.services.validators;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.requests.RemoveBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses.CoreError;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIComponent;

@DIComponent
public class RemoveBookRequestValidator {

	public List<CoreError> validate(RemoveBookRequest request) {
		List<CoreError> errors = new ArrayList<>();
		validateBookId(request).ifPresent(errors::add);
		return errors;
	}

	private Optional<CoreError> validateBookId(RemoveBookRequest request) {
		return (request.getBookId() == null)
			? Optional.of(new CoreError("bookId", "Must not be empty!"))
			: Optional.empty();
	}

}
