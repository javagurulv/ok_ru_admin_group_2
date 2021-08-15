package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.Book;

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