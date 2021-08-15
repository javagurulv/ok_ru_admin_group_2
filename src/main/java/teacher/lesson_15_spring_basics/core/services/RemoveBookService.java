package teacher.lesson_15_spring_basics.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import teacher.lesson_15_spring_basics.core.database.Database;
import teacher.lesson_15_spring_basics.core.requests.RemoveBookRequest;
import teacher.lesson_15_spring_basics.core.responses.CoreError;
import teacher.lesson_15_spring_basics.core.responses.RemoveBookResponse;
import teacher.lesson_15_spring_basics.core.services.validators.RemoveBookRequestValidator;

@Component
public class RemoveBookService {

	@Autowired private Database database;
	@Autowired private RemoveBookRequestValidator validator;

	public RemoveBookResponse execute(RemoveBookRequest request) {
		List<CoreError> errors = validator.validate(request);
		if (!errors.isEmpty()) {
			return new RemoveBookResponse(errors);
		}
		boolean isBookRemoved = database.deleteById(request.getBookId());
		return new RemoveBookResponse(isBookRemoved);
	}

}