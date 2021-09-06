package teacher.lesson_17_log4j.lessoncode.core.responses;

import java.util.List;

import teacher.lesson_17_log4j.lessoncode.core.domain.Book;

public class GetAllBooksResponse extends CoreResponse {

	private List<Book> books;

	public GetAllBooksResponse(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
}
