package teacher.lesson_15_spring_basics.core.responses;

import java.util.List;

import teacher.lesson_15_spring_basics.core.domain.Book;

public class SearchBooksResponse extends CoreResponse {

	private List<Book> books;

	public SearchBooksResponse(List<Book> books, List<CoreError> errors) {
		super(errors);
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
}
