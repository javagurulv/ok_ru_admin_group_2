package teacher.lesson_17_log4j.lessoncode.console_ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import teacher.lesson_17_log4j.lessoncode.core.requests.GetAllBooksRequest;
import teacher.lesson_17_log4j.lessoncode.core.responses.GetAllBooksResponse;
import teacher.lesson_17_log4j.lessoncode.core.services.GetAllBooksService;

@Component
public class GetAllBooksUIAction implements UIAction {

	@Autowired private GetAllBooksService getAllBooksService;

	@Override
	public void execute() {
		System.out.println("Book list: ");
		GetAllBooksRequest request = new GetAllBooksRequest();
		GetAllBooksResponse response = getAllBooksService.execute(request);
		response.getBooks().forEach(System.out::println);
		System.out.println("Book list end.");
	}
}