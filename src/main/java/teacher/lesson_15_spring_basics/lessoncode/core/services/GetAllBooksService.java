package teacher.lesson_15_spring_basics.lessoncode.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import teacher.lesson_15_spring_basics.lessoncode.core.database.Database;
import teacher.lesson_15_spring_basics.lessoncode.core.domain.Book;
import teacher.lesson_15_spring_basics.lessoncode.core.requests.GetAllBooksRequest;
import teacher.lesson_15_spring_basics.lessoncode.core.responses.GetAllBooksResponse;

@Component
public class GetAllBooksService {

	@Autowired private Database database;

	public GetAllBooksResponse execute(GetAllBooksRequest request) {
		List<Book> books = database.getAllBooks();
		return new GetAllBooksResponse(books);
	}

}