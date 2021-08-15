package teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response;

import java.util.Scanner;

import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.console_ui.AddBookUIAction;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.console_ui.ExitUIAction;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.console_ui.GetAllBooksUIAction;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.console_ui.RemoveBookUIAction;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.console_ui.UIAction;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.database.Database;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.database.InMemoryDatabaseImpl;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.services.AddBookService;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.services.GetAllBooksService;
import teacher.lesson_14_refactoring_and_dependency_injection.version6_request_response.core.services.RemoveBookService;

public class BookListApplication {

	private static Database database = new InMemoryDatabaseImpl();
	private static AddBookService addBookService = new AddBookService(database);
	private static RemoveBookService removeBookService = new RemoveBookService(database);
	private static GetAllBooksService getAllBooksService = new GetAllBooksService(database);
	private static UIAction addBookUIAction = new AddBookUIAction(addBookService);
	private static UIAction removeBookUIAction = new RemoveBookUIAction(removeBookService);
	private static UIAction getAllBooksUIAction = new GetAllBooksUIAction(getAllBooksService);
	private static UIAction exitUIAction = new ExitUIAction();

	public static void main(String[] args) {
		while (true) {
			printProgramMenu();
			int menuNumber = getMenuNumberFromUser();
			executeSelectedMenuItem(menuNumber);
		}
	}

	private static void printProgramMenu() {
		System.out.println();
		System.out.println("Program menu:");
		System.out.println("1. Add book to list");
		System.out.println("2. Delete book from list");
		System.out.println("3. Show all books in the list");
		System.out.println("4. Exit");
		System.out.println();
	}

	private static int getMenuNumberFromUser() {
		System.out.println("Enter menu item number to execute:");
		Scanner scanner = new Scanner(System.in);
		return Integer.parseInt(scanner.nextLine());
	}

	private static void executeSelectedMenuItem(int selectedMenu) {
		switch (selectedMenu) {
			case 1: {
				addBookUIAction.execute();
				break;
			}
			case 2: {
				removeBookUIAction.execute();
				break;
			}
			case 3: {
				getAllBooksUIAction.execute();
				break;
			}
			case 4: {
				exitUIAction.execute();
				break;
			}
		}
	}

}