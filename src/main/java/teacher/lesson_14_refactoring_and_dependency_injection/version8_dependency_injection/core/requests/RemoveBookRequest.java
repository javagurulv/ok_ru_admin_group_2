package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.requests;

public class RemoveBookRequest {

	private Long bookId;

	public RemoveBookRequest(Long bookId) {
		this.bookId = bookId;
	}

	public Long getBookId() {
		return bookId;
	}
}
