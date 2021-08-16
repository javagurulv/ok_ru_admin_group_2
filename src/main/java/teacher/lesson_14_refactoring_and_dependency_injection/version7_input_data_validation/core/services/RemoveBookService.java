package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.services;

import java.util.ArrayList;
import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.database.Database;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.requests.RemoveBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses.CoreError;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses.RemoveBookResponse;

public class RemoveBookService {

	private Database database;

	public RemoveBookService(Database database) {
		this.database = database;
	}

	public RemoveBookResponse execute(RemoveBookRequest request) {
		if (request.getBookIdToRemove() == null) {
			CoreError error = new CoreError("id", "Must not be empty!");
			List<CoreError> errors = new ArrayList<>();
			errors.add(error);
			return new RemoveBookResponse(errors);
		}
		boolean isBookRemoved = database.deleteById(request.getBookIdToRemove());
		return new RemoveBookResponse(isBookRemoved);
	}

}