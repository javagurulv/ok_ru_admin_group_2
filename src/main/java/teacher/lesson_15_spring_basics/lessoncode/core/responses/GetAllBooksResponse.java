package teacher.lesson_15_spring_basics.lessoncode.core.responses;

import java.util.List;

import teacher.lesson_15_spring_basics.lessoncode.core.domain.Book;

public class GetAllBooksResponse extends CoreResponse {

	private List<Book> books;

	public GetAllBooksResponse(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
}
