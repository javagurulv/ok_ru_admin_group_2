package teacher.lesson_12_junit.lessoncode;

public class ExceptionExample {

	public void throwException(int abc) {
		if (abc == 5) {
			throw new RuntimeException("message 9898");
		}
	}

}
