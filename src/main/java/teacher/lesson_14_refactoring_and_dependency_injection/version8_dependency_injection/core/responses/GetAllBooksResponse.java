package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses;

import java.util.List;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.Book;

public class GetAllBooksResponse extends CoreResponse {

	private List<Book> books;

	public GetAllBooksResponse(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
}
