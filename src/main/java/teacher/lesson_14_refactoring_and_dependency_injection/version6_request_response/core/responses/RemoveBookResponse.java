package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.responses;

public class RemoveBookResponse {

	private boolean bookRemoved;

	public RemoveBookResponse(boolean bookRemoved) {
		this.bookRemoved = bookRemoved;
	}

	public boolean isBookRemoved() {
		return bookRemoved;
	}
}