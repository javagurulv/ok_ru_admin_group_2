package teacher.lesson_14_refactoring_and_dependency_injection.version7_input_data_validation.core.requests;

public class AddBookRequest {

	private String title;
	private String author;

	public AddBookRequest(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}
