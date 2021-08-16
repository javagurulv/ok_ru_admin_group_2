package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses;

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