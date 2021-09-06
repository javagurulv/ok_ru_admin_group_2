package teacher.lesson_17_log4j.lessoncode.core.responses;

import java.util.List;

abstract class CoreResponse {

	private List<CoreError> errors;

	public CoreResponse() { }

	public CoreResponse(List<CoreError> errors) {
		this.errors = errors;
	}

	public List<CoreError> getErrors() {
		return errors;
	}

	public boolean hasErrors() {
		return errors != null && !errors.isEmpty();
	}
}