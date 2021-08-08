package teacher.lesson_11_exceptions.lessoncode;

import student_sergo_kurbanov.lesson_7.level_7.Book;

public class ExceptionTest {

	public static void main(String[] args) {
		Book book = null;
		book.getAuthor();

		Exception e = new Exception("sdfsdfsd");
		try {
			throw e;
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

}
