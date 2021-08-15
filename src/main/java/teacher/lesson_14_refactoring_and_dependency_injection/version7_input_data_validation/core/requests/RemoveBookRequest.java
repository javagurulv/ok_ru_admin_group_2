package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.requests;

public class RemoveBookRequest {

	private Long bookIdToRemove;

	public RemoveBookRequest(Long bookIdToRemove) {
		this.bookIdToRemove = bookIdToRemove;
	}

	public Long getBookIdToRemove() {
		return bookIdToRemove;
	}
}
