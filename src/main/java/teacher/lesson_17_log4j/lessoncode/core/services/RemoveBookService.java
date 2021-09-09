package teacher.lesson_17_log4j.lessoncode.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import teacher.lesson_17_log4j.lessoncode.core.database.Database;
import teacher.lesson_17_log4j.lessoncode.core.requests.RemoveBookRequest;
import teacher.lesson_17_log4j.lessoncode.core.responses.CoreError;
import teacher.lesson_17_log4j.lessoncode.core.responses.RemoveBookResponse;
import teacher.lesson_17_log4j.lessoncode.core.services.validators.RemoveBookRequestValidator;

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