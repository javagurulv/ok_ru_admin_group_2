package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses;

import java.util.List;

public class RemoveBookResponse extends CoreResponse {

	private boolean bookRemoved;

	public RemoveBookResponse(List<CoreError> errors) {
		super(errors);
	}

	public RemoveBookResponse(boolean bookRemoved) {
		this.bookRemoved = bookRemoved;
	}

	public boolean isBookRemoved() {
		return bookRemoved;
	}
}