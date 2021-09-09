package teacher.lesson_15_spring_basics.lessoncode.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import teacher.lesson_15_spring_basics.lessoncode.core.database.Database;
import teacher.lesson_15_spring_basics.lessoncode.core.domain.Book;
import teacher.lesson_15_spring_basics.lessoncode.core.requests.AddBookRequest;
import teacher.lesson_15_spring_basics.lessoncode.core.responses.AddBookResponse;
import teacher.lesson_15_spring_basics.lessoncode.core.responses.CoreError;
import teacher.lesson_15_spring_basics.lessoncode.core.services.validators.AddBookRequestValidator;

@Component
public class AddBookService {

	@Autowired private Database database;
	@Autowired private AddBookRequestValidator validator;

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
