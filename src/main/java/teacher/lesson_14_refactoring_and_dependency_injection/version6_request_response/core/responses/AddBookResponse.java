package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.responses;

import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.Book;

public class AddBookResponse {

	private Book newBook;

	public AddBookResponse(Book newBook) {
		this.newBook = newBook;
	}

	public Book getNewBook() {
		return newBook;
	}
}