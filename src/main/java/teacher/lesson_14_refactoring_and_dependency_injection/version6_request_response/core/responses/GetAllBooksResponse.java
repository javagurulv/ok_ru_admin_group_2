package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.responses;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.Book;

public class GetAllBooksResponse {

	private List<Book> books;

	public GetAllBooksResponse(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
}
