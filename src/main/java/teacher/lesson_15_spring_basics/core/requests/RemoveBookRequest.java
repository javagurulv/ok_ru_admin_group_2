package teacher.lesson_15_spring_basics.core.requests;

public class RemoveBookRequest {

	private Long bookId;

	public RemoveBookRequest(Long bookId) {
		this.bookId = bookId;
	}

	public Long getBookId() {
		return bookId;
	}
}
