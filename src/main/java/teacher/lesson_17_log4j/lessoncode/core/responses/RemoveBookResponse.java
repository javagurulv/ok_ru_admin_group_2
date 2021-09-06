package teacher.lesson_17_log4j.lessoncode.core.responses;

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