package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.console_ui;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.requests.GetAllBooksRequest;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.responses.GetAllBooksResponse;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.core.services.GetAllBooksService;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIComponent;
import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIDependency;

@DIComponent
public class GetAllBooksUIAction implements UIAction {

	@DIDependency private GetAllBooksService getAllBooksService;

	@Override
	public void execute() {
		System.out.println("Book list: ");
		GetAllBooksRequest request = new GetAllBooksRequest();
		GetAllBooksResponse response = getAllBooksService.execute(request);
		response.getBooks().forEach(System.out::println);
		System.out.println("Book list end.");
	}
}