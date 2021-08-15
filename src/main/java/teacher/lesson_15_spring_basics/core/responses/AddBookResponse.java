package teacher.lesson_15_spring_basics.core.responses;

import java.util.List;

import teacher.lesson_15_spring_basics.core.domain.Book;

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