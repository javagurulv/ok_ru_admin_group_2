package teacher.lesson_8_objects_equality_reflection.lessoncode;

public class ImmutableBook {

	private final String title;
	private final String author;

	public ImmutableBook(String title,
						 String author) {
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
