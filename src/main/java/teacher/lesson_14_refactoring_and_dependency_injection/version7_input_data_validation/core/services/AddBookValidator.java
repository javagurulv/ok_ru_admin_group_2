package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.requests.AddBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses.CoreError;

public class AddBookValidator {

	public List<CoreError> validate(AddBookRequest request) {
		List<CoreError> errors = new ArrayList<>();
		validateTitle(request).ifPresent(errors::add);
		validateAuthor(request).ifPresent(errors::add);
		return errors;
	}

	private Optional<CoreError> validateTitle(AddBookRequest request) {
		return (request.getTitle() == null || request.getTitle().isEmpty())
			? Optional.of(new CoreError("title", "Must not be empty!"))
			: Optional.empty();
	}

	private Optional<CoreError> validateAuthor(AddBookRequest request) {
		return (request.getAuthor() == null || request.getAuthor().isEmpty())
				? Optional.of(new CoreError("author", "Must not be empty!"))
				: Optional.empty();
	}

}
