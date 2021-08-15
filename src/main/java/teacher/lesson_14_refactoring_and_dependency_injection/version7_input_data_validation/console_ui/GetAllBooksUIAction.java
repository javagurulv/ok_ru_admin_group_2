package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.console_ui;

import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.requests.GetAllBooksRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.responses.GetAllBooksResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.services.GetAllBooksService;

public class GetAllBooksUIAction implements UIAction {

	private GetAllBooksService getAllBooksService;

	public GetAllBooksUIAction(GetAllBooksService getAllBooksService) {
		this.getAllBooksService = getAllBooksService;
	}

	@Override
	public void execute() {
		System.out.println("Book list: ");
		GetAllBooksRequest request = new GetAllBooksRequest();
		GetAllBooksResponse response = getAllBooksService.execute(request);
		response.getBooks().forEach(System.out::println);
		System.out.println("Book list end.");
	}
}