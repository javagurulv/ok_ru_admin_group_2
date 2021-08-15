package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.services;

import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.database.Database;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.requests.RemoveBookRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.responses.RemoveBookResponse;

public class RemoveBookService {

	private Database database;

	public RemoveBookService(Database database) {
		this.database = database;
	}

	public RemoveBookResponse execute(RemoveBookRequest request) {
		boolean isBookRemoved = database.deleteById(request.getBookIdToRemove());
		return new RemoveBookResponse(isBookRemoved);
	}

}