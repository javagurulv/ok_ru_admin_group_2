package teacher.lesson_17_log4j.lessoncode.core.responses;

import java.util.List;

import teacher.lesson_17_log4j.lessoncode.core.domain.Book;

public class AddBookResponse extends CoreResponse {

	private Book newBook;

	public AddBookResponse(List<CoreError> errors) {
		super(errors);
	}

	public AddBookResponse(Book newBook) {
		this.newBook = newBook;
	}

	public Book getNewBook() {
		return newBook;
	}
}