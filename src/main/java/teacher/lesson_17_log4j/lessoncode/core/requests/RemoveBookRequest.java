package teacher.lesson_17_log4j.lessoncode.core.requests;

public class RemoveBookRequest {

	private Long bookId;

	public RemoveBookRequest(Long bookId) {
		this.bookId = bookId;
	}

	public Long getBookId() {
		return bookId;
	}
}
