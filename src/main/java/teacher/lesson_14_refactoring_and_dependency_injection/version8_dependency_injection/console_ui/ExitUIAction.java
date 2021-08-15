package teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.console_ui;

import teacher.lesson_14_refactoring_and_dependency_injection.version8_dependency_injection.dependency_injection.DIComponent;

@DIComponent
public class ExitUIAction implements UIAction {
	@Override
	public void execute() {
		System.out.println("Good by!");
		System.exit(0);
	}
}
