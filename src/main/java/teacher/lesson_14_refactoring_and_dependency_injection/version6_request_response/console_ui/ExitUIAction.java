package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.console_ui;

public class ExitUIAction implements UIAction {
	@Override
	public void execute() {
		System.out.println("Good by!");
		System.exit(0);
	}
}
